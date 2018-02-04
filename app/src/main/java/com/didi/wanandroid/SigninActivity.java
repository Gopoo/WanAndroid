package com.didi.wanandroid;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.widget.EditText;

import com.afollestad.materialdialogs.MaterialDialog;
import com.didi.wanandroid.base.BaseActivity;
import com.didi.wanandroid.view.DialogManager;
import com.didi.wancore.account.AccountManger;
import com.didi.wancore.bean.SignBean;
import com.didi.wancore.net.RetrofitClient;
import com.didi.wancore.net.rxhelper.RxObserver;
import com.didi.wancore.net.rxhelper.RxSchedulerHelper;
import com.didi.wancore.utils.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class SigninActivity extends BaseActivity {

    @BindView(R.id.et_username)
    EditText mUsername = null;
    @BindView(R.id.et_password)
    EditText mPassword = null;

    private MaterialDialog mDialog;
    @Override
    public int setLayoutID() {
        return R.layout.activity_signin;
    }

    @Override
    public void init() {
        getWindow().setBackgroundDrawable(null);
        mDialog = DialogManager.progress(this,"登录中");
    }

    @OnClick(R.id.btn_signin)
    public void onClick(){
        final String username= mUsername.getText().toString().replaceAll(" ","");
        final String password = mPassword.getText().toString().replaceAll(" ","");
        if (checkUserProfile(username,password)){
            mDialog.show();
            RetrofitClient.getRetrofitService()
                    .login(username,password)
                    .compose(new RxSchedulerHelper<SignBean>().main_io())
                    .subscribe(new RxObserver<SignBean>() {

                        @Override
                        public void onNext(SignBean signBean) {
                            mDialog.dismiss();
                          if (signBean.getErrorCode()==0){
                            AccountManger.setUsername(username);
                            AccountManger.setPassword(password);
                            ToastUtils.showShort("登录成功");
                            MainActivity.intentFrom(SigninActivity.this);
                            finish();
                          }else{
                              ToastUtils.showShort(signBean.getErrorMsg());
                          }
                        }
                        @Override
                        public void onError(Throwable e) {
                            super.onError(e);
                            mDialog.dismiss();
                        }
                    });
        }
    }

    @OnClick(R.id.btn_signup)
    public void toSignup(){
        RegisterActivity.intentFrom(this);
    }


    private boolean checkUserProfile(String username,String password){
        boolean success = true;
        if ( username.length()<6){
            mUsername.setError("用户名输入不正确");
            success =false;
        }else {
            mUsername.setError(null);
            success =true;
        }
        if (password.length()<6){
            mPassword.setError("密码输入不正确");
            success =false;
        }else {
            mPassword.setError(null);
            success =true;
        }
        return success;
    }
    public static void intentFrom(Context context){
        Intent i = new Intent(context,SigninActivity.class);
        context.startActivity(i);
    }
}

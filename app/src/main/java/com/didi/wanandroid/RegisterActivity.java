package com.didi.wanandroid;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;

import com.afollestad.materialdialogs.MaterialDialog;
import com.didi.wanandroid.base.BaseActivity;
import com.didi.wanandroid.view.DialogManager;
import com.didi.wancore.bean.SignBean;
import com.didi.wancore.net.RetrofitClient;
import com.didi.wancore.net.rxhelper.RxObserver;
import com.didi.wancore.net.rxhelper.RxSchedulerHelper;
import com.didi.wancore.utils.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;


public class RegisterActivity extends BaseActivity {

    @BindView(R.id.et_username)
    TextInputEditText mName = null;
    @BindView(R.id.et_password)
    TextInputEditText mPassword = null;
    @BindView(R.id.et_password_again)
    TextInputEditText mRePassword = null;

    private MaterialDialog mDialog = null;
    @Override
    public int setLayoutID() {
        return R.layout.activity_register;
    }

    @Override
    public void init() {
        getWindow().setBackgroundDrawable(null);
        mDialog = DialogManager.progress(this,"注册中...");
    }

    @OnClick(R.id.link_signin)
    public void onClickToSignin(){
        finish();
    }
    @OnClick(R.id.signup)
    public void onClickSignup(){
        final String name = mName.getText().toString().replaceAll(" ","");
        final String password = mPassword.getText().toString().replaceAll(" ","");
        final String rePassword = mRePassword.getText().toString().replaceAll(" ","");
        if (checkUserProfile(name,password,rePassword)){
            mDialog.show();
            RetrofitClient.getRetrofitService()
                    .register(name,password,rePassword)
                    .compose(new RxSchedulerHelper<SignBean>().main_io())
                    .subscribe(new RxObserver<SignBean>(){

                        @Override
                        public void onNext(SignBean signBean) {
                            mDialog.dismiss();
                            if (signBean.getErrorCode()==0){
                                ToastUtils.showShort("注册");
                                MainActivity.intentFrom(RegisterActivity.this);
//                                finish();
                            }else{
                                ToastUtils.showShort(signBean.getErrorMsg());
                                MainActivity.intentFrom(RegisterActivity.this);
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

    private boolean checkUserProfile(String name,String password,String rePassword){

        boolean isPass = true;

        if (name.isEmpty()||name.length()< 6 || name.length()>20) {
            mName.setError("请输入6位以上用户名");
            isPass = false;
        } else {
            mName.setError(null);
        }

        if (password.isEmpty() || password.length() < 6|| password.length()> 20) {
            mPassword.setError("请输入6位以上密码");
            isPass = false;
        } else {
            mPassword.setError(null);
        }

        if (rePassword.isEmpty() || !(rePassword.equals(password))) {
            mRePassword.setError("密码验证错误");
            isPass = false;
        } else {
            mRePassword.setError(null);
        }
        return isPass;
    }


    public static void intentFrom(Context context){
        Intent i = new Intent(context,RegisterActivity.class);
        context.startActivity(i);
    }
}

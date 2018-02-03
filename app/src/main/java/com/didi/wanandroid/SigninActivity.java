package com.didi.wanandroid;

import android.content.Context;
import android.content.Intent;
import android.widget.EditText;

import com.didi.wancore.account.AccountManger;
import com.didi.wancore.activity.BaseActivity;
import com.didi.wancore.bean.SignBean;
import com.didi.wancore.net.RetrofitClient;
import com.didi.wancore.net.rxhelper.RxObserver;
import com.didi.wancore.net.rxhelper.RxSchedulerHelper;
import com.didi.wancore.utils.LogUtils;
import com.didi.wancore.utils.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class SigninActivity extends BaseActivity {

    @BindView(R.id.et_username)
    EditText mUsername = null;
    @BindView(R.id.et_password)
    EditText mPassword = null;

    @Override
    public int setLayoutID() {
        return R.layout.activity_signin;
    }

    @Override
    public void init() {

    }

    @OnClick(R.id.btn_signin)
    public void onClick(){
        if (checkUserProfile()){
            final String username = mUsername.getText().toString().replaceAll(" ","");
            final String password = mPassword.getText().toString().replaceAll(" ","");
            RetrofitClient.getRetrofitService()
                    .login(username,password)
                    .compose(new RxSchedulerHelper<SignBean>().main_io())
                    .subscribe(new RxObserver<SignBean>() {

                        @Override
                        public void onNext(SignBean signBean) {
                          if (signBean.getErrorCode()==0){

                          }else {
                              ToastUtils.showShort(signBean.getErrorMsg());
                          }
                        }
                    });
        }
    }

    @OnClick(R.id.btn_signup)
    public void toSignup(){

    }


    private boolean checkUserProfile(){
        boolean success = true;
        final String username = mUsername.getText().toString().replaceAll(" ","");
        final String password = mPassword.getText().toString().replaceAll(" ","");
        if (username.isEmpty() || username.length()<6){
            mUsername.setError("用户名输入不正确");
            success =false;
        }else {
            mUsername.setError(null);
            success =true;
        }
        if (password.isEmpty() || password.length()<6){
            mPassword.setError("密码输入不正确");
            success =false;
        }else {
            mPassword.setError(null);
            success =true;
        }
        return success;
    }
    public static void intentTo(Context context){
        Intent i = new Intent(context,SigninActivity.class);
        context.startActivity(i);
    }
}

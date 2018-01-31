package com.didi.wancore.account;


import com.didi.wancore.app.Preferences;

/**
 * Created by didi on 2018/1/30.
 */

public class AccountManger {
    private static final String USERNAME = "USERNAME";
    private static final String PASSWORD = "PASSWORD";
    private static final String TOKEN = "TOKEN";
    private static final String COOKIE = "COOKIE";
    private static final String SIGN_IN = "SIGN_IN_FLAG";

    public static final boolean getSigninFlag(){
        return Preferences.getAppFlags(SIGN_IN,false);
    }
    public static final String getUsername(){
        return Preferences.getProfile(USERNAME,"");
    }
    public static final String getToken(){
        return Preferences.getProfile(TOKEN,"");
    }
    public static final String getCookie() {
        return Preferences.getProfile(TOKEN,"");
    }
    public static final String getPassword(){
        return Preferences.getProfile(PASSWORD,"");
    }
    public static final void isSignIn(ISigninListener listener){
        if (getSigninFlag()){
            listener.onSignin();
        }else{
            listener.onNotSignin();
        }
    }
}

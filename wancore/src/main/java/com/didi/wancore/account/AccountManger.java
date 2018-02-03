package com.didi.wancore.account;


import android.preference.Preference;

import com.didi.wancore.app.Preferences;

/**
 * Created by didi on 2018/1/30.
 */

public class AccountManger {
    private static final String USERNAME = "USERNAME";
    private static final String PASSWORD = "PASSWORD";
    private static final String TOKEN = "TOKEN";
    private static final String COOKIES = "COOKIES";
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
    public static final String getCookies() {
        return Preferences.getProfile(COOKIES,"");
    }
    public static final String getPassword(){
        return Preferences.getProfile(PASSWORD,"");
    }

    public static final void setUsername(String username){
         Preferences.addProfile(USERNAME,username);
    }
    public static final void setToken(String token){
         Preferences.addProfile(TOKEN,token);
    }
    public static final void setCookies(String cookies) {
         Preferences.addProfile(COOKIES,cookies);
    }
    public static final void setPassword(String password){
         Preferences.addProfile(PASSWORD,password);
    }

    public static final void clearAll(){
        Preferences.clearProfiles();
    }
    public static final void isSignIn(ISigninListener listener){
        if (getSigninFlag()){
            listener.onSignin();
        }else{
            listener.onNotSignin();
        }
    }
}

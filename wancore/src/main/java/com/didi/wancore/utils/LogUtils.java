package com.didi.wancore.utils;

import android.util.Log;

import com.didi.wancore.app.AppCore;

/**
 * Created by didi on 2018/2/3.
 */

public class LogUtils {
    public static final void d(String message){
        Log.d(AppCore.pkgname(),message);
    }
    public static final void i(String message){
        Log.i(AppCore.pkgname(),message);
    }
    public static final void w(String message){
        Log.w(AppCore.pkgname(),message);
    }
}

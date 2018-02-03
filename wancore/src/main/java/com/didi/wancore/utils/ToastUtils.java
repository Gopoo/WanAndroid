package com.didi.wancore.utils;

import android.widget.Toast;

import com.didi.wancore.app.AppCore;

/**
 * Created by didi on 2018/2/3.
 */

public class ToastUtils {
    public static void showLong(String message){
        Toast.makeText(AppCore.context(),message,Toast.LENGTH_SHORT).show();
    }
    public static void showShort(String message){
        Toast.makeText(AppCore.context(),message,Toast.LENGTH_SHORT).show();
    }
}

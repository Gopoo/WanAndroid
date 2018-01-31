package com.didi.wanandroid.app;


import com.didi.wancore.BaseApplication;
import com.didi.wancore.app.AppCore;

/**
 * Created by didi on 2018/1/31.
 */

public class WanApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        AppCore.context(getApplicationContext());
        AppCore.url("http://www.wanandroid.com/");

    }
}

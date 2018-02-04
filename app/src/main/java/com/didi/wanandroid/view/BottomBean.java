package com.didi.wanandroid.view;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

/**
 * Created by didi on 2018/2/4.
 */

public class BottomBean {
    @DrawableRes
    private int imgRes;
    @NonNull
    private String title;

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BottomBean(int imgRes, @NonNull String title) {
        this.imgRes = imgRes;
        this.title = title;
    }
}
package com.didi.wancore.net.rxhelper;

import com.didi.wancore.utils.ToastUtils;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by didi on 2018/2/3.
 */

public abstract class RxObserver <T> implements Observer<T> {
    private static final String NO_NETWORK = "无网络";
    private static final String TIME_OUT = "超时";
    private static final String DEFAULT_TIPS = "请求失败，请稍后重试";

    @Override
    public void onComplete() {
    }

    @Override
    public void onSubscribe(Disposable d) {}

    @Override
    public void onError(Throwable e) {
        if (e instanceof SocketTimeoutException)
            ToastUtils.showShort(TIME_OUT);
        else if (e instanceof UnknownHostException)
            ToastUtils.showShort(NO_NETWORK);
        else
            ToastUtils.showShort(DEFAULT_TIPS);
    }
}

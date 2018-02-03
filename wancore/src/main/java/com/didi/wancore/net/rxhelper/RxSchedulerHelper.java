package com.didi.wancore.net.rxhelper;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by didi on 2018/2/3.
 */

public class RxSchedulerHelper<M> {
    public   ObservableTransformer<M,M> main_io(){
        return new ObservableTransformer<M,M>() {
            @Override
            public ObservableSource<M> apply(Observable<M> upstream) {
                return upstream.observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io());
            }
        };
    }
}

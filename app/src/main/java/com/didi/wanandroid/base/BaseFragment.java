package com.didi.wanandroid.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by didi on 2018/1/30.
 */

public abstract class BaseFragment extends Fragment {
    private boolean canLoad = false;
    private boolean prepared = false;
    protected boolean isLoaded = false;
    private Unbinder unbinder = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        prepared = true;
        View view = inflater.inflate(setLayoutId(),container);
        if (canLoad&&!isLoaded)
            lazyLoad();
        unbinder = ButterKnife.bind(view);
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser){
            canLoad = true;
        }
        if (isVisibleToUser&&prepared&&!isLoaded)
            lazyLoad();
    }
    public abstract void lazyLoad();
    public abstract int setLayoutId();

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}

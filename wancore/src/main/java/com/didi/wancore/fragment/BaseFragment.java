package com.didi.wancore.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by didi on 2018/1/30.
 */

public abstract class BaseFragment extends Fragment {
    private boolean canLoad = false;
    private boolean prepared = false;
    protected boolean isLoaded = false;
    protected View view = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        prepared = true;
        view = inflater.inflate(setLayoutId(),container);
        if (canLoad&&!isLoaded)
            lazyLoad();
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
}

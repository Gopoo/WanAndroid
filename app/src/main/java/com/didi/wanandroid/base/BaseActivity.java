package com.didi.wanandroid.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.didi.wancore.R;

import butterknife.ButterKnife;

/**
 * Created by didi on 2018/1/30.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (setLayoutID()!=0){
            setContentView(setLayoutID());
            ButterKnife.bind(this);
            init();
        }

    }

    /**
     *
     * @return content view
     */
    public abstract int setLayoutID();
    public abstract void init();

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

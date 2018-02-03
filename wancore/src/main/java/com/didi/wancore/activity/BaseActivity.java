package com.didi.wancore.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.didi.wancore.R;

/**
 * Created by didi on 2018/1/30.
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected Toolbar mToolbar = null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (setLayoutID()!=0){
            setContentView(setLayoutID());
            mToolbar = findViewById(R.id.tb_toolbar);
            init();
        }

    }

    /**
     *
     * @return content view
     */
    public abstract int setLayoutID();
    public abstract void init();
}

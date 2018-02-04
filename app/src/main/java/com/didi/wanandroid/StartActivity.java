package com.didi.wanandroid;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.lang.ref.WeakReference;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ProHandler handler = new ProHandler(this);
        handler.sendEmptyMessageDelayed(0,2500);
        //load retrofit
        try {
            Class.forName("com.didi.wancore.net.RetrofitClient");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private class ProHandler extends Handler{
        private WeakReference<Context> contextWeakReference = null;
        public ProHandler(Context context){
            contextWeakReference = new WeakReference<Context>(context);
            context = null ;
        }
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (contextWeakReference.get()!=null){
                MainActivity.intentFrom(contextWeakReference.get());
                finish();
            }
        }
    }
}

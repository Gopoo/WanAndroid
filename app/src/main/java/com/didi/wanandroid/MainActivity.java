package com.didi.wanandroid;


import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;


import com.didi.wanandroid.base.BaseActivity;
import com.didi.wancore.account.AccountManger;
import com.didi.wancore.bean.OwnWebsiteBean;
import com.didi.wancore.net.RetrofitClient;
import com.didi.wancore.net.rxhelper.RxObserver;
import com.didi.wancore.net.rxhelper.RxSchedulerHelper;
import com.didi.wancore.utils.LogUtils;

public class MainActivity extends BaseActivity {


    @Override
    public int setLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        final TextView board = findViewById(R.id.tv_board);
        findViewById(R.id.btn_get_collected).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogUtils.w(System.currentTimeMillis()+"start");
                RetrofitClient.getRetrofitService()
                        .collectedWebsite()
                        .compose(new RxSchedulerHelper<OwnWebsiteBean>().main_io())
                        .subscribe(new RxObserver<OwnWebsiteBean>() {
                            @Override
                            public void onNext(OwnWebsiteBean ownWebsiteBean) {
                                LogUtils.w(System.currentTimeMillis()+"mid");
                                board.setText(board.getText()+ownWebsiteBean.toString());
                            }
                        });
            }
        });
        findViewById(R.id.btn_signin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               SigninActivity.intentFrom(MainActivity.this);
            }
        });
        findViewById(R.id.btn_get_cookie).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogUtils.w(AccountManger.getCookies());
            }
        });

    }
    public static void intentFrom(Context context){
        Intent i = new Intent(context,MainActivity.class);
        context.startActivity(i);
    }
}

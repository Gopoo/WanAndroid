package com.didi.wanandroid;


import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;


import com.didi.wancore.account.AccountManger;
import com.didi.wancore.activity.BaseActivity;
import com.didi.wancore.bean.OwnWebsiteBean;
import com.didi.wancore.bean.SignBean;
import com.didi.wancore.net.RetrofitClient;
import com.didi.wancore.net.rxhelper.RxObserver;
import com.didi.wancore.net.rxhelper.RxSchedulerHelper;
import com.didi.wancore.utils.LogUtils;
import com.didi.wancore.utils.ToastUtils;



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
                RetrofitClient.getRetrofitService()
                        .collectedWebsite()
                        .compose(new RxSchedulerHelper<OwnWebsiteBean>().main_io())
                        .subscribe(new RxObserver<OwnWebsiteBean>() {
                            @Override
                            public void onNext(OwnWebsiteBean ownWebsiteBean) {
                                board.setText(board.getText()+ownWebsiteBean.toString());

                            }
                        });
            }
        });
        findViewById(R.id.btn_signin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RetrofitClient.getRetrofitService()
                        .login("praia1","a612325")
                        .compose(new RxSchedulerHelper<SignBean>().main_io())
                        .subscribe(new RxObserver<SignBean>() {

                            @Override
                            public void onNext(SignBean signBean) {
                                ToastUtils.showShort(signBean.getErrorCode()+signBean.getErrorMsg()+signBean.getData().getPassword());
                                LogUtils.w(AccountManger.getCookies());
                            }
                        });
            }
        });

    }
    public static void intentTo(Context context){
        Intent i = new Intent(context,MainActivity.class);
        context.startActivity(i);
    }
}

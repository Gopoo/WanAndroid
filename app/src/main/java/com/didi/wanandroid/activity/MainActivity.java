package com.didi.wanandroid.activity;


import android.content.Context;
import android.content.Intent;
import android.support.design.widget.BottomNavigationView;

import com.didi.wanandroid.R;
import com.didi.wanandroid.base.BaseActivity;
import com.didi.wanandroid.view.BottomBean;
import com.didi.wanandroid.view.BottomItems;
import com.didi.wancore.utils.LogUtils;

import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.bottom_navigation)
    BottomNavigationView bar;
    @Override
    public int setLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {

        BottomItems items = BottomItems.Holder.creat();
        List<BottomBean> itemlist= items
                .add(new BottomBean(R.drawable.ic_home_blue_24dp,"首页"))
                .add(new BottomBean(R.drawable.ic_stars_blue_24dp,"热点"))
                .add(new BottomBean(R.drawable.ic_bookmark_blue_24dp,"收藏"))
                .add(new BottomBean(R.drawable.ic_person_blue_24dp,"我"))
                .get();
        LogUtils.w(itemlist.size()+"");
//        bar.set
    }
    public static void intentFrom(Context context){
        Intent i = new Intent(context,MainActivity.class);
        context.startActivity(i);
    }
}

package com.didi.wanandroid.activity;


import android.content.Context;
import android.content.Intent;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.didi.wanandroid.R;
import com.didi.wanandroid.base.BaseActivity;
import com.didi.wanandroid.fragment.ChoseFragment;
import com.didi.wanandroid.fragment.CollectFragment;
import com.didi.wanandroid.fragment.HomeFragnment;
import com.didi.wanandroid.fragment.UserFragment;
import com.didi.wanandroid.helper.NavigationPagerHelper;
import com.didi.wanandroid.view.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity {
    @BindView(R.id.viewpager)
    ViewPager viewPager;
    @BindView(R.id.bottom_navigation)
    BottomNavigationView bar;
    @Override
    public int setLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        NavigationPagerHelper.help(viewPager,bar);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),fragments()));
    }
    private List<Fragment> fragments(){
        List<Fragment> fragments = new ArrayList<Fragment>();
        fragments.add(new HomeFragnment());
        fragments.add(new ChoseFragment());
        fragments.add(new CollectFragment());
        fragments.add(new UserFragment());
        return fragments;
    }
    public static void intentFrom(Context context){
        Intent i = new Intent(context,MainActivity.class);
        context.startActivity(i);
    }
}

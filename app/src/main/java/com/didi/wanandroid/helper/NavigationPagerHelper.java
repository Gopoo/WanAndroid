package com.didi.wanandroid.helper;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import com.didi.wanandroid.R;

/**
 * Created by didi on 2018/2/4.
 */

public class NavigationPagerHelper {
    public static void help(final ViewPager viewPager, final BottomNavigationView view){
        final Menu menu = view.getMenu();
        final int size = menu.size();
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                menu.getItem(position%size).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_home:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.item_chose:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.item_collect:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.item_user:
                        viewPager.setCurrentItem(3);
                        break;
                }
                return false;
            }
        });
    }
}

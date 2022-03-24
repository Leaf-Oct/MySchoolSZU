package com.leafoct.myschool;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MenuItem;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;



public class MainActivity extends BaseActivity {

    public static boolean isTablet(Context context) {
        return (context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        if(isTablet(this)){
            Intent i=new Intent(this,WebPage.class);
            i.putExtra("url","https://www1.szu.edu.cn/");
            startActivity(i);
            finish();
        }

//        获取底部导航栏的引用
        final BottomNavigationView bn=findViewById(R.id.bottom_navigation);
//        创建底部导航栏的适配器，以用于使不同的选项匹配不同的页面。该适配器继承自FragmentPagerAdapter
        final NavigationAdapter na=new NavigationAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
//        获取页面ViewPager的引用
        final ViewPager szu=(ViewPager)findViewById(R.id.view_pager);
//        页面ViewPager跟适配器绑定
        szu.setAdapter(na);
//        页面跟底部导航栏绑定。页面滑动的时候，底部导航栏也要跟着点亮相应的选项卡
        szu.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                bn.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
//        底部导航栏跟页面绑定，获取点击的选项的ID，再通过id使页面显示不同的碎片
        bn.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                switch (id){
                    case R.id.menu_home_page:
                        szu.setCurrentItem(0);
                        break;
                    case R.id.menu_service:
                        szu.setCurrentItem(1);
                        break;
                    case R.id.menu_link:
                        szu.setCurrentItem(2);
                        break;
                    case R.id.menu_tel_code_uooc:
                        szu.setCurrentItem(3);
                        break;
                    case R.id.menu_about:
                        szu.setCurrentItem(4);
                        break;
                }
                return true;
            }
        });
    }

}
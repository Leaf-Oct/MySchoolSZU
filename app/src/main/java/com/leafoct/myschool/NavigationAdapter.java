package com.leafoct.myschool;


import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class NavigationAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments;

    public NavigationAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        fragments=new ArrayList<>();
        fragments.add(Fragment_Home_Page.newInstance());
        fragments.add(Fragment_Service.newInstance());
        fragments.add(Fragment_Link.newInstance());
        fragments.add(Fragment_Tel.newInstance());
        fragments.add(Fragment_About.newInstance());
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}

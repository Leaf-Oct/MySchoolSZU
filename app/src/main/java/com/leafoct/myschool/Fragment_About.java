package com.leafoct.myschool;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class Fragment_About extends Fragment {

    public Fragment_About() {
        // Required empty public constructor
    }

    public static Fragment_About newInstance() {
        Fragment_About fragment = new Fragment_About();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_fragment__about, container, false);

        return v;
    }
}

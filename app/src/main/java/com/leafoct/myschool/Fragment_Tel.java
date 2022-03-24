package com.leafoct.myschool;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Fragment_Tel extends Fragment {

    public Fragment_Tel() {
        // Required empty public constructor
    }

    public static Fragment_Tel newInstance() {
        Fragment_Tel fragment = new Fragment_Tel();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_fragment__tel, container, false);
        initial_code(v);
        initial_tel(v);
        return v;
    }
    private void initial_code(View view){
        ImageButton covid=(ImageButton)view.findViewById(R.id.covid_code);
        covid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www1.szu.edu.cn/NCP/iQRcode/");
            }
        });
        ImageButton uooc=(ImageButton)view.findViewById(R.id.uooc_code);
        uooc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://www.uooc.net.cn/");
            }
        });
        ImageButton oa=(ImageButton)view.findViewById(R.id.oa_code);
        oa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www1.szu.edu.cn/v.asp?id=133");
            }
        });
    }
    private void gotoWeb(String url){
        Intent i=new Intent(getContext(),WebPage.class);
        i.putExtra("url",url);
        startActivity(i);
    }
    private void gotoTel(String number){
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:"+number));
        startActivity(i);
    }
    private void initial_tel(View view){
        TextView consult=(TextView)view.findViewById(R.id.consult_tel);
        consult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoTel("26536114");
            }
        });
        TextView police=(TextView)view.findViewById(R.id.police_in_school);
        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoTel("26537119");
            }
        });
        TextView zhonghang=(TextView)view.findViewById(R.id.zhonghang);
        zhonghang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoTel("26732006");
            }
        });
        TextView xinli_1=(TextView)view.findViewById(R.id.xinli_consult_1);
        xinli_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoTel("26978002");
            }
        });
        TextView xinli_2=(TextView)view.findViewById(R.id.xinli_consult_2);
        xinli_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoTel("26958879");
            }
        });
        TextView student_network_dianxin=(TextView)view.findViewById(R.id.student_area_network_1);
        student_network_dianxin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoTel("86310108");
            }
        });
        TextView student_network_yidong=(TextView)view.findViewById(R.id.student_area_network_2);
        student_network_yidong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoTel("18476328678");
            }
        });
        TextView teaching_network_1=(TextView)view.findViewById(R.id.teaching_area_network_1);
        teaching_network_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoTel("26537109");
            }
        });
        TextView teaching_network_2=(TextView)view.findViewById(R.id.teaching_area_network_2);
        teaching_network_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoTel("86930513");
            }
        });
    }
}

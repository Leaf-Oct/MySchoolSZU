package com.leafoct.myschool;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Link extends Fragment {
    private List<String> tel_numbers;

    public Fragment_Link() {
        // Required empty public constructor
    }

    public static Fragment_Link newInstance() {
        Fragment_Link fragment = new Fragment_Link();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    private String[] urls={
            "http://news.szu.edu.cn",
            "https://www1.szu.edu.cn/board",
            "http://210.39.3.155:9090/goLogin.do",
            "http://www.szu.edu.cn/yxjg/xbxy.htm",
            "http://www.szu.edu.cn/yxjg/znbm.htm",
            "https://www1.szu.edu.cn/view.asp?id=12",
            "https://www1.szu.edu.cn/view.asp?id=13",
            "https://www1.szu.edu.cn/tv/",
            "https://www1.szu.edu.cn/nc/",
            "https://drcom.szu.edu.cn/",
            "http://172.30.255.2/0.html",
            "https://webvpn.szu.edu.cn/"
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_fragment__link, container, false);
        tel_numbers=new ArrayList<>();

        LinkDatabase ld=new LinkDatabase(getContext(),"Link.db",null,1);
        SQLiteDatabase link_database=ld.getWritableDatabase();
        Cursor c=link_database.query("link",null,null,null,null,null,null,null);
        if(c.moveToFirst()){
            do{
                String title=c.getString(c.getColumnIndex("name"));
                tel_numbers.add(title);
            }while(c.moveToNext());
        }
        String tel_array[]=new String[tel_numbers.size()];
        for(int i=0;i<tel_array.length;i++){
            tel_array[i]=tel_numbers.get(i);
        }
        ArrayAdapter<String>  adapter=new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,tel_array);
        ListView links_listview=(ListView)v.findViewById(R.id.other_link);
        links_listview.setAdapter(adapter);
        links_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                gotoWeb(position);
            }
        });
        return v;
    }
    private void gotoWeb(int position){
        Intent i=new Intent(getContext(),WebPage.class);
        i.putExtra("url",urls[position]);
        startActivity(i);
    }
}

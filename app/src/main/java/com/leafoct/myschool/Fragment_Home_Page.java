package com.leafoct.myschool;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Fragment_Home_Page extends Fragment {

    public Fragment_Home_Page() {
        // Required empty public constructor
    }

    public static Fragment_Home_Page newInstance() {
        Fragment_Home_Page fragment = new Fragment_Home_Page();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    private TextView date;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment__home__page, container, false);
//        设置底下查看校历的日期和链接
        date = (TextView) v.findViewById(R.id.date_text_school_calendar);
        Date today = new Date();
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 EE");
        String setDate = df.format(today) + " (查看校历)";
        date.setText(setDate);
        setLink(v);

        return v;
    }

    private void setLink(View view) {
//        日期校历
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), WebPage.class);
                intent.putExtra("url", "https://www.szu.edu.cn/xxgk/xl.htm");
                startActivity(intent);
            }
        });
//        登录统一身份验证
        TextView login_union_ID = (TextView) view.findViewById(R.id.login_union_ID);
        login_union_ID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), WebPage.class);
                intent.putExtra("url", "https://authserver.szu.edu.cn/authserver/login");
                Toast.makeText(getContext(), "此处登录后即可使用app内各种服务", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
//        忘记密码
        TextView forget_password = (TextView) view.findViewById(R.id.forget_szu_password);
        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), WebPage.class);
                intent.putExtra("url", "https://authserver.szu.edu.cn/authserver/getBackPasswordMainPage.do");
                startActivity(intent);
            }
        });
//        使用说明
        TextView use_instruction = (TextView) view.findViewById(R.id.use_instrument);
        use_instruction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), WebPage.class);
                intent.putExtra("url", "https://www1.szu.edu.cn/v.asp?id=136");
                startActivity(intent);
            }
        });
//        进入阅览
        Button read = (Button) view.findViewById(R.id.gongwentong);
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), WebPage.class);
                intent.putExtra("url", "https://www1.szu.edu.cn/board/");
                startActivity(intent);
            }
        });
//        重要通知
        TextView importante_notice = (TextView) view.findViewById(R.id.importent_notice);
        importante_notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), WebPage.class);
                intent.putExtra("url", "https://www1.szu.edu.cn/board/");
                startActivity(intent);
            }
        });
//        深大新闻
        TextView szu_news = (TextView) view.findViewById(R.id.szu_news);
        szu_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), WebPage.class);
                intent.putExtra("url", "https://news.szu.edu.cn/xyxw/sdyw.htm");
                startActivity(intent);
            }
        });
//        学术讲座
        TextView lecture = (TextView) view.findViewById(R.id.acadamic_lecture);
        lecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), WebPage.class);
                intent.putExtra("url", "https://www1.szu.edu.cn/board/infolist.asp?infotype=%BD%B2%D7%F9");
                startActivity(intent);
            }
        });
//        党史教育
        TextView party_history_education = (TextView) view.findViewById(R.id.szu_party_history_learning_education);
        party_history_education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), WebPage.class);
                intent.putExtra("url", "https://it.szu.edu.cn/dsjy/");
                startActivity(intent);
            }
        });
//        心理咨询
        TextView consult = (TextView) view.findViewById(R.id.mental_24_consult);
        consult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), WebPage.class);
                intent.putExtra("url", "https://www1.szu.edu.cn/board/view.asp?id=463138");
                startActivity(intent);
            }
        });
    }
}


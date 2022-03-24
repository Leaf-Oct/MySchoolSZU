package com.leafoct.myschool;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class Fragment_Service extends Fragment {


    public Fragment_Service() {
        // Required empty public constructor
    }

    public static Fragment_Service newInstance() {
        Fragment_Service fragment = new Fragment_Service();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_fragment_service, container, false);
//        设置上下图片
        ImageView top_image=(ImageView)v.findViewById(R.id.top_image);
        ImageView bottom_image=(ImageView)v.findViewById(R.id.bottom_image);
        randomTop(top_image);
        randomBottom(bottom_image);
        initial_column1(v);
        initial_column2(v);
        initial_column3(v);
        initial_column4(v);
        return v;
    }
    private void randomBottom(ImageView bottom){
        Random r=new Random();
        switch (r.nextInt(6)){
            case 0:
                bottom.setImageResource(R.drawable.bottom_www1);
                break;
            case 1:
                bottom.setImageResource(R.drawable.bottom_www2);
                break;
            case 2:
                bottom.setImageResource(R.drawable.bottom_www3);
                break;
            case 3:
                bottom.setImageResource(R.drawable.bottom_www4);
                break;
            case 4:
                bottom.setImageResource(R.drawable.bottom_www5);
                break;
            case 5:
                bottom.setImageResource(R.drawable.bottom_www6);
                break;
        }
    }
    private void randomTop(ImageView top){
        Random r=new Random();
        switch (r.nextInt(6)){
            case 0:
                top.setImageResource(R.drawable.szu_www1);
                break;
            case 1:
                top.setImageResource(R.drawable.szu_www2);
                break;
            case 2:
                top.setImageResource(R.drawable.szu_www3);
                break;
            case 3:
                top.setImageResource(R.drawable.szu_www4);
                break;
            case 4:
                top.setImageResource(R.drawable.szu_www5);
                break;
            case 5:
                top.setImageResource(R.drawable.szu_www6);
                break;
        }
    }
    private void gotoWeb(String url){
        Intent i=new Intent(getContext(),WebPage.class);
        i.putExtra("url",url);
        startActivity(i);
    }
    private void initial_column1(View view){
        TextView ehall=(TextView)view.findViewById(R.id.ehall);
        ehall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://ehall.szu.edu.cn/");
            }
        });
        TextView teacher_email=(TextView)view.findViewById(R.id.teacher_email);
        teacher_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://mail.szu.edu.cn/");
            }
        });
        TextView benkeshengjiaowu=(TextView)view.findViewById(R.id.benkeshengjiaowu);
        benkeshengjiaowu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://jwb.szu.edu.cn/");
            }
        });
        TextView yanjiushengjiaowu=(TextView)view.findViewById(R.id.yanjiushengjiaowu);
        yanjiushengjiaowu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://gra.szu.edu.cn/");
            }
        });
        TextView bb=(TextView)view.findViewById(R.id.blackboard);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://elearning.szu.edu.cn/");
            }
        });
        TextView oaxitong=(TextView)view.findViewById(R.id.oaxitong);
        oaxitong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://210.39.3.155:9090/goLogin.do");
            }
        });
        TextView kexuejishu=(TextView)view.findViewById(R.id.kexuejishu);
        kexuejishu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://kjb.szu.edu.cn/");
            }
        });
        TextView shehuikexue=(TextView)view.findViewById(R.id.shehuikexue);
        shehuikexue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://skb.szu.edu.cn/");
            }
        });
        TextView renliziyuan=(TextView)view.findViewById(R.id.renliziyuan);
        renliziyuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://hr.szu.edu.cn/");
            }
        });
        TextView shiyanshebei=(TextView)view.findViewById(R.id.shiyanshebei);
        shiyanshebei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://sbc.szu.edu.cn/");
            }
        });
        TextView shebeigongxiang=(TextView)view.findViewById(R.id.shebeigongxiang);
        shebeigongxiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://gxpt.szu.edu.cn/");
            }
        });
        TextView caiwufuwu=(TextView)view.findViewById(R.id.caiwufuwu);
        caiwufuwu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://cwcx.szu.edu.cn/dlpt/caslogin4.aspx");
            }
        });
        TextView zhaobiaocaigou=(TextView)view.findViewById(R.id.zhaobiaocaigou);
        zhaobiaocaigou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://bidding.szu.edu.cn/");
            }
        });
        TextView more=(TextView)view.findViewById(R.id.more1);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www1.szu.edu.cn/view.asp?id=12");
            }
        });
    }
    private void initial_column2(View view){
        TextView uooc=(TextView)view.findViewById(R.id.uooc);
        uooc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://www.uooc.net.cn/");
            }
        });
        TextView xueshengyouxiang=(TextView)view.findViewById(R.id.xuesheng_email);
        xueshengyouxiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://email.szu.edu.cn/");
            }
        });
        TextView benkeshengxuanke=(TextView)view.findViewById(R.id.benkeshengxuanke);
        benkeshengxuanke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://bkxk.szu.edu.cn/xsxkapp/sys/xsxkapp/*default/index.do");
            }
        });
        TextView yanjiushengxuanke=(TextView)view.findViewById(R.id.yanjiushengxuanke);
        yanjiushengxuanke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://ehall.szu.edu.cn/yjsxkapp/sys/xsxkapp/*default/index.do");
            }
        });
        TextView xueshenggongzuo=(TextView)view.findViewById(R.id.xueshenggongzuo);
        xueshenggongzuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://student.szu.edu.cn/");
            }
        });
        TextView shiwuzhongxin=(TextView)view.findViewById(R.id.shiwuzhongxin);
        shiwuzhongxin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://swzx.szu.edu.cn/");
            }
        });
        TextView gongyuguanli=(TextView)view.findViewById(R.id.gongyuguanli);
        gongyuguanli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://gyzx.szu.edu.cn/");
            }
        });
        TextView xlzx=(TextView)view.findViewById(R.id.xinlizixun);
        xlzx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://xinli.szu.edu.cn/");
            }
        });
        TextView jxzf=(TextView)view.findViewById(R.id.jiaoxuezafei);
        jxzf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://cwxssf.szu.edu.cn/wsyh/casLogin_zf.aspx");
            }
        });
        TextView kaoyankaobo=(TextView)view.findViewById(R.id.kanyankaobo);
        kaoyankaobo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://yz.szu.edu.cn/");
            }
        });
        TextView jyzd=(TextView)view.findViewById(R.id.jiuyazhidao);
       jyzd .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://job.szu.edu.cn/");
            }
        });
        TextView xshd=(TextView)view.findViewById(R.id.xueshenghuodong);
        xshd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://www.szu.edu.cn/xysh1/xshd.htm");
            }
        });
        TextView yjsh=(TextView)view.findViewById(R.id.yanjiushenghui);
        yjsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://grasu.szu.edu.cn/");
            }
        });
        TextView more=(TextView)view.findViewById(R.id.more2);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www1.szu.edu.cn/view.asp?id=13");
            }
        });
    }
    private void initial_column3(View view){
        TextView sdyg=(TextView)view.findViewById(R.id.shendayigong);
        sdyg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://yigong.szu.edu.cn/");
            }
        });
        TextView xkjs=(TextView)view.findViewById(R.id.xuekejingsai);
        xkjs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://jingsai.szu.edu.cn/");
            }
        });
        TextView cxcy=(TextView)view.findViewById(R.id.chuangyechuangxin);
        cxcy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www.szu.edu.cn/xysh1/cxcy.htm");
            }
        });
        TextView ghhd=(TextView)view.findViewById(R.id.gonghuihuodong);
        ghhd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www.szu.edu.cn/xysh1/ghhd.htm");
            }
        });
        TextView sdxb=(TextView)view.findViewById(R.id.shendaxiaobao);
        sdxb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://szunews.ihwrm.com/");
            }
        });
        TextView wsds=(TextView)view.findViewById(R.id.wangshangdianshi);
        wsds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www1.szu.edu.cn/tv");
            }
        });
        TextView gbdt=(TextView)view.findViewById(R.id.guangbodiantai);
        gbdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://mp.weixin.qq.com/mp/homepage?__biz=MzU0NjM0ODA4Mw==&hid=3");
            }
        });
        TextView spxy=(TextView)view.findViewById(R.id.shipinxiaoyuan);
        spxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://172.31.61.5/");
            }
        });
        TextView tycg=(TextView)view.findViewById(R.id.tiyuchangguan);
        tycg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www1.szu.edu.cn/v.asp?id=185");
            }
        });
        TextView hqfw=(TextView)view.findViewById(R.id.houqinfuwu);
        hqfw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://hqb.szu.edu.cn/");
            }
        });
        TextView gjjl=(TextView)view.findViewById(R.id.guojijiaoliu);
        gjjl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://szupu.szu.edu.cn/");
            }
        });
        TextView zyy=(TextView)view.findViewById(R.id.zongyiyuan);
        zyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://sugh.szu.edu.cn/");
            }
        });
        TextView hnyy=(TextView)view.findViewById(R.id.huananyiyuan);
        hnyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://sch.szu.edu.cn/");
            }
        });
        TextView more=(TextView)view.findViewById(R.id.more3);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www1.szu.edu.cn/tv");
            }
        });
    }
    private void initial_column4(View view){
        TextView tsg=(TextView)view.findViewById(R.id.tushuguan);
        tsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://www.lib.szu.edu.cn/");
            }
        });
        TextView xywl=(TextView)view.findViewById(R.id.xiaoyuanwangluo);
        xywl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www1.szu.edu.cn/nc");
            }
        });
        TextView zzfw=(TextView)view.findViewById(R.id.zizhufuwu);
        zzfw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://self.szu.edu.cn/self/nav_login");
            }
        });
        TextView xwxx=(TextView)view.findViewById(R.id.xiaowuxinxiang);
        xwxx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www1.szu.edu.cn/mailbox");
            }
        });
        TextView dxpt=(TextView)view.findViewById(R.id.duanxinpingtai);
        dxpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://sms2008.szu.edu.cn/");
            }
        });
        TextView hyssq=(TextView)view.findViewById(R.id.huiyishishenqing);
        hyssq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www1.szu.edu.cn/meeting");
            }
        });
        TextView xsgyy=(TextView)view.findViewById(R.id.xiaoshiguanyuyue);
        xsgyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www1.szu.edu.cn/meeting");
            }
        });
        TextView xyk=(TextView)view.findViewById(R.id.xiaoyuanka);
        xyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://card.szu.edu.cn/");
            }
        });
        TextView gzbx=(TextView)view.findViewById(R.id.guzhangbaoxiu);
        gzbx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www1.szu.edu.cn/view.asp?id=9");
            }
        });
        TextView swzl=(TextView)view.findViewById(R.id.shiwuzhaoling);
        swzl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www1.szu.edu.cn/lostfound");
            }
        });
        TextView jjh=(TextView)view.findViewById(R.id.jijinhui);
        jjh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://edf.szu.edu.cn/");
            }
        });
        TextView sdjnp=(TextView)view.findViewById(R.id.shendajinianpin);
        sdjnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://cd7me-26.pospal.cn/");
            }
        });
        TextView zhwy=(TextView)view.findViewById(R.id.zhonghangwangyin);
        zhwy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("http://www.boc.cn/");
            }
        });
        TextView more=(TextView)view.findViewById(R.id.more4);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoWeb("https://www1.szu.edu.cn/nc");
            }
        });
    }
}

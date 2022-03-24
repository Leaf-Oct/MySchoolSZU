package com.leafoct.myschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        全屏，隐藏标题栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.splash);
//        等待1秒的splash
        Thread wait_several_second=new Thread(){
          @Override
          public void run(){
              try {
                  sleep(1000);
                  Intent to_login=new Intent(Splash.this,Login.class);
                  startActivity(to_login);
                  finish();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        };
        wait_several_second.start();
//        向sharedprefe...中传账户密码的数据
        final SharedPreferences.Editor save_account_password=getSharedPreferences("account_password",MODE_PRIVATE).edit();
        save_account_password.putString("root","root");
        save_account_password.apply();
//        数据库传相关链接，为后面做准备
        LinkDatabase link_helper=new LinkDatabase(this,"Link.db",null,1);
        link_helper.getWritableDatabase();
    }
}

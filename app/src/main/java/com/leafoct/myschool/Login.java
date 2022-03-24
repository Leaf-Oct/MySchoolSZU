package com.leafoct.myschool;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        //忘记密码的点击事件
        TextView forget_password=(TextView)findViewById(R.id.forget_password);
        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder default_password_root=new AlertDialog.Builder(Login.this);
                default_password_root.setTitle("忘记密码？");
                default_password_root.setMessage("默认(唯一)账户密码,root和root");
                default_password_root.setCancelable(false);
                default_password_root.setPositiveButton("确认", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                default_password_root.show();
            }
        });
        //获取账户密码输入栏
        final EditText account=(EditText)findViewById(R.id.account);
        final EditText password=(EditText)findViewById(R.id.password);
        //登录按钮点击事件
        Button login=(Button)findViewById(R.id.login_button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String account_value=account.getText().toString();
                String password_value=password.getText().toString();
                SharedPreferences sp=getSharedPreferences("account_password",MODE_PRIVATE);
                String real_password=sp.getString(account_value,"null");
                if(real_password.equals("null")){
                    AlertDialog.Builder no_account=new AlertDialog.Builder(Login.this);
                    no_account.setTitle("错误❌");
                    no_account.setMessage("用户名不存在");
                    no_account.setCancelable(false);
                    no_account.setPositiveButton("确认", null);
                    no_account.show();
                }
                else if(!password_value.equals(real_password)){
                    AlertDialog.Builder no_account=new AlertDialog.Builder(Login.this);
                    no_account.setTitle("错误❌");
                    no_account.setMessage("密码错误");
                    no_account.setCancelable(false);
                    no_account.setPositiveButton("确认", null);
                    no_account.show();
                }
                else{
                    Intent to_main=new Intent(Login.this,MainActivity.class);
                    startActivity(to_main);
                    finish();
                }
            }
        });
    }
}

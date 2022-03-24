package com.leafoct.myschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebPage extends BaseActivity {
    private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        Intent i=getIntent();
        String url_link=i.getStringExtra("url");
        web=(WebView)findViewById(R.id.web);
        WebSettings ws=web.getSettings();
//        允许http
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ws.setMixedContentMode(WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE);
        }
//        允许js
        ws.setJavaScriptEnabled(true);
//        允许缩放
        ws.setSupportZoom(true);
        ws.setBuiltInZoomControls(true);
//        不许跳转到系统浏览器
        web.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
        web.loadUrl(url_link);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        推出的时候清楚缓存
        web.clearCache(true);
        web.destroy();
    }
}

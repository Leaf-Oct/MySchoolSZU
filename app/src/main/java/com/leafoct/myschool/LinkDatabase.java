package com.leafoct.myschool;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class LinkDatabase extends SQLiteOpenHelper {
    public LinkDatabase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    private String createString="create table link(" +
            "name text primary key)";
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createString);
        ContentValues cv=new ContentValues();
        cv.put("name","深大新闻网");
        db.insert("link",null,cv);
        cv.clear();
        cv.put("name"," 公文通");
        db.insert("link",null,cv);
        cv.clear();
        cv.put("name","OA系统");
        db.insert("link",null,cv);
        cv.clear();
        cv.put("name","院系设置");
        db.insert("link",null,cv);
        cv.clear();
        cv.put("name","职能部门");
        db.insert("link",null,cv);
        cv.clear();
        cv.put("name","教师事务 ");
        db.insert("link",null,cv);
        cv.clear();
        cv.put("name","学生事务 ");
        db.insert("link",null,cv);
        cv.clear();
        cv.put("name","荔园生活");
        db.insert("link",null,cv);
        cv.clear();
        cv.put("name"," 网上服务 ");
        db.insert("link",null,cv);
        cv.clear();
        cv.put("name"," 教工区上网登录");
        db.insert("link",null,cv);
        cv.clear();
        cv.put("name"," 宿舍区上网登录");
        db.insert("link",null,cv);
        cv.clear();
        cv.put("name"," WebVPN");
        db.insert("link",null,cv);
        cv.clear();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

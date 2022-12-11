package com.example.rezki;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
public  static  final  String DBNAME = "login.db";
    public DBHelper(Context context ) {
        super(context, DBNAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL("create table  users (Username TEXT primary key,password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
db.execSQL("drop  table if exists users ");
    }
    public boolean insertData(String Username ,String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("Username",Username);
        values.put("password",password);
        long result = db.insert("users",null , values);

        if(result ==-1)return false ;
        else
            return true ;
    }
    public Boolean Checkuseranme(String Username){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c = db.rawQuery("select * from users where Username=?",new String[]{Username});
        if(c.getCount()>0)
            return true ;
        else return false ;
    }
    public boolean checkusernamepassword(String Username,String password){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c = db.rawQuery("select * from users where Username=?and password=?",new String[]{Username,password});
        if(c.getCount()>0)
            return true ;
        else return false ;
    }
}

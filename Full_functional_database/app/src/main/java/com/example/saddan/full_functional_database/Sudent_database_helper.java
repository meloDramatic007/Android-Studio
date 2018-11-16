package com.example.saddan.full_functional_database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Sudent_database_helper extends SQLiteOpenHelper
{
    public  static  final  String DATABASE_NAME="db_student";
    public static  final int version=2;

    public static final String STUDENT_TABLE_NAME="tbl_student";
    public static final String STUDENT_COL_ID="id";
    public static final String STUDENT_COL_NAME="name";
    public static final String STUDENT_COL_EMAIL="email";
    public static final String STUDENT_COL_PHONE="phone";
    public static final String STUDENT_COL_ADDRESS="address";

    public static final String CREAT_TABLE_STUDENT="CREATE TABLE "+
    STUDENT_TABLE_NAME+"("+
    STUDENT_COL_ID+ " INTEGER PRIMARY KEY,"+
    STUDENT_COL_NAME+ " TEXT,"+
    STUDENT_COL_EMAIL+ " TEXT,"+
    STUDENT_COL_PHONE+ " TEXT,"+
    STUDENT_COL_ADDRESS+ " TEXT)";


    public Sudent_database_helper(Context context)
    {
        super(context, DATABASE_NAME, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
              db.execSQL(CREAT_TABLE_STUDENT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}

package com.example.saddan.full_functional_database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLData;
import java.util.ArrayList;

public class Student_data_source {


    Sudent_database_helper student_database_helper;
    SQLiteDatabase db;
    public  Student_data_source(Context context)
    {
        student_database_helper=new Sudent_database_helper(context);
    }

    private void connectionOpen()
    {
        db=student_database_helper.getWritableDatabase();
    }

     private void closeConnection()
     {
         db.close();
     }
    public  boolean saveStudentInformation(Student student)
    {

        connectionOpen();

        ContentValues contentValues=new ContentValues();
        contentValues.put(student_database_helper.STUDENT_COL_NAME,student.getName());
        contentValues.put(student_database_helper.STUDENT_COL_EMAIL,student.getEmail());
        contentValues.put(student_database_helper.STUDENT_COL_PHONE,student.getPhone());
        contentValues.put(student_database_helper.STUDENT_COL_ADDRESS,student.getAdress());

        long numberAffected=db.insert(student_database_helper.STUDENT_TABLE_NAME,null,contentValues);
        closeConnection();
        if(numberAffected>0)
        {
            return true;
        }

        else {
            return false;

        }


    }

    public  boolean deleteStudent(int id)
    {
        connectionOpen();

        String whereClause=student_database_helper.STUDENT_COL_ID+"=?";
        String whereArgs[]={String.valueOf(id)};

        int rowAffected=db.delete(student_database_helper.STUDENT_TABLE_NAME,whereClause,whereArgs);
    closeConnection();
        if(rowAffected>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean updateStudent(int id)
    {
        connectionOpen();
        ContentValues contentValues=new ContentValues();
        contentValues.put(student_database_helper.STUDENT_TABLE_NAME,"Sefuda");
        String whereClause=student_database_helper.STUDENT_COL_ID+"=?";
        String whereArgs[]={String.valueOf(id)};
        int rowAffected=db.update(student_database_helper.STUDENT_TABLE_NAME,contentValues,whereClause,whereArgs);
        closeConnection();
        if(rowAffected>0)
        {
            return true ;
        }
        else
        {
            return  false;
        }
    }
    public ArrayList<Student>getAllStudent()
    {
        ArrayList<Student> StudentList=new ArrayList<>();
        connectionOpen();
        Cursor cursor=db.query(student_database_helper.STUDENT_TABLE_NAME,null,null,null,null,
                null,null);
        if(cursor!=null && cursor.getCount()>0)
        {
            cursor.moveToLast();

            do {
                int id = cursor.getInt(0);
                String name = cursor.getString(1);
                String email = cursor.getString(2);
                String phone = cursor.getString(3);
                String address = cursor.getString(4);

                Student student = new Student( name, email, phone, address,id);
                StudentList.add(student);
            }while (cursor.moveToLast());
        }
        closeConnection();
        return StudentList;
    }

}

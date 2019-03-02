package com.example.saddan.full_functional_database;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Student_Database_View extends AppCompatActivity
{
     ListView seeData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student__database__view);
        seeData=findViewById(R.id.listTV);

        Student_data_source student_data_source=new Student_data_source(this);
        final ArrayList<Student> studentList=student_data_source.getAllStudent();

        Student_List_Adapter adapter=new Student_List_Adapter(this,studentList);
        Toast.makeText(this, studentList.size()+"", Toast.LENGTH_SHORT).show();

        seeData.setAdapter(adapter);

    }
}

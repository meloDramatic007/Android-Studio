package com.example.user.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentListActivity extends AppCompatActivity
{
    ListView studentLV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        studentLV = findViewById(R.id.studentLV);

        ArrayList<Student> studentList = Student.getAllStudent();


        StudentListAdapter studentListAdapter = new StudentListAdapter(this, studentList);
        studentLV.setAdapter(studentListAdapter);



    }
}

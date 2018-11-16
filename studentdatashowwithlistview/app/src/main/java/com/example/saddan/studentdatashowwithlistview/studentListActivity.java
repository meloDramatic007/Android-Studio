package com.example.saddan.studentdatashowwithlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class studentListActivity extends AppCompatActivity
{
    ListView studentLV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        studentLV=findViewById(R.id.listView_id);
        ArrayList<Student> studentList= Student.getStudentList();


    }
}

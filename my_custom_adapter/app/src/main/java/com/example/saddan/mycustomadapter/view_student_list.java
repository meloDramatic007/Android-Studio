package com.example.saddan.mycustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class view_student_list extends AppCompatActivity
{
    ListView ListviewTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_student_list);

        ListviewTV=findViewById(R.id.Listview_TV);

        ArrayList<Student> students=Student.getAllStudent();
        StudentList_Adapter studentList_adapter=new StudentList_Adapter(this,students);

        ListviewTV.setAdapter(studentList_adapter);
    }
}

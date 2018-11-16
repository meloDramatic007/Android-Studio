package com.example.user.studentmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class StudentListActivity extends AppCompatActivity {
    ListView studentLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentlist);

        studentLV = findViewById(R.id.studentListLV);

        ArrayList<Student> studentList = Student.getStudentList();

        StudentListAdapter adapter = new StudentListAdapter(this, studentList);

        studentLV.setAdapter(adapter);

        studentLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Student student = Student.getStudentList().get(position);
               Intent intent = new Intent(StudentListActivity.this, StudentDetailsActivity.class);
               intent.putExtra("student", student);
               startActivity(intent);


            }
        });


    }

    public void addStudent(View view) {
        Intent intent = new Intent(this, AddStudentActivity.class);
        startActivity(intent);
    }
}

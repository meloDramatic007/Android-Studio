package com.example.user.studentmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class StudentDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        Intent intent = getIntent();
        Student student = (Student) intent.getSerializableExtra("student");

        Log.d("name", student.getName());
        Log.d("phone", student.getPhone());
        Log.d("email", student.getEmail());
        Log.d("dob", student.getDob());
        Log.d("division", student.getDivision());
        Log.d("gender", student.getGender());


    }
}

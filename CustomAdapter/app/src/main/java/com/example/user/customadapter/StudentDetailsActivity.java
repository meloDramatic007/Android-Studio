package com.example.user.customadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StudentDetailsActivity extends AppCompatActivity {
    TextView nameTV, emailTV, phoneTV, addressTV, departmentTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        nameTV = findViewById(R.id.nameTV);
        emailTV = findViewById(R.id.emailTV);
        phoneTV = findViewById(R.id.phoneTV);
        addressTV = findViewById(R.id.addressTV);
        departmentTV = findViewById(R.id.departmentTV);


        Intent intent = getIntent();
        Student student  = (Student) intent.getSerializableExtra("student");
        nameTV.setText(student.getName());
        emailTV.setText(student.getEmail());
        phoneTV.setText(student.getPhone());
        addressTV.setText(student.getAddress());
        departmentTV.setText(student.getDepartment());


    }
}

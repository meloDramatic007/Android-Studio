package com.example.saddan.mycustomadapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class StudentDetails extends AppCompatActivity
{
    TextView nameTV,emailTV,phoneTV,adressTV;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list__adapter);

        nameTV=findViewById(R.id.nameTV);
        emailTV=findViewById(R.id.emailTV);
        phoneTV=findViewById(R.id.phoneTV);
        adressTV=findViewById(R.id.addressTV);

        Intent intent=getIntent();
        Student student= (Student) intent.getSerializableExtra("student");
        nameTV.setText(student.getName());
        emailTV.setText(student.getEmail());
        phoneTV.setText(student.getPhone());
        adressTV.setText(student.getAddress());
    }

}

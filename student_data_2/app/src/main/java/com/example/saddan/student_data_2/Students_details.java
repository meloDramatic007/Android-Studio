package com.example.saddan.student_data_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Students_details extends AppCompatActivity
{
    TextView showName,showEmail,showPhone,showAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_details);

        showName=findViewById(R.id.name_id);
        showEmail=findViewById(R.id.email_id);
        showPhone=findViewById(R.id.phone_id);
        showAddress=findViewById(R.id.address_id);

        Intent intent=getIntent();

        Student student=(Student) intent.getSerializableExtra("student");

        String name=student.getName();
        String email=student.getEmail();
        String phone=student.getPhone();
        String address=student.getAddress();

        showName.setText(name);
        showEmail.setText(email);
        showPhone.setText(phone);
        showAddress.setText(address);
    }
}

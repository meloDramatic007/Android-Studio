package com.example.saddan.student_data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class View_Reg extends AppCompatActivity
{
    TextView showName,showEmail,showPhone,showDepartment;

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__reg);
        showName=findViewById(R.id.name_id);
        showEmail=findViewById(R.id.email_id);
        showPhone=findViewById(R.id.phone_id);
        showDepartment=findViewById(R.id.address_id);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String email=intent.getStringExtra("email");
        String phone=intent.getStringExtra("phone");
        String address=intent.getStringExtra("address");
        showName.setText(name);
        showEmail.setText(email);
        showPhone.setText(phone);
        showDepartment.setText(address);


    }
}

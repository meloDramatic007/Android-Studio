package com.example.saddan.user_info;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class view_info extends AppCompatActivity
{
     TextView showName,showEmail,showPhone,showAddress,showGender,showDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_info);
        showName=findViewById(R.id.name_view_id);
        showEmail=findViewById(R.id.email_view_id);
        showPhone=findViewById(R.id.phone_view_id);
        showAddress=findViewById(R.id.address_view_id);
        showGender=findViewById(R.id.gender_view_id);
        showDivision=findViewById(R.id.division_view_id);
        Intent intent=getIntent();
        String Name=intent.getStringExtra("name");
        String Email=intent.getStringExtra("email");
        String Phone=intent.getStringExtra("phone");
        String Address=intent.getStringExtra("address");
        String Gender=intent.getStringExtra("gender");
        String division=intent.getStringExtra("division");
        showName.setText(Name);
        showEmail.setText(Email);
        showPhone.setText(Phone);
        showAddress.setText(Address);
        showGender.setText(Gender);
        showDivision.setText(division);
    }
}

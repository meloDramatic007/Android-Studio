package com.example.saddan.student_data_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText nameEt,emailET,phoneET,addressET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEt=findViewById(R.id.name_et);
        emailET=findViewById(R.id.email_et);
        phoneET=findViewById(R.id.phone_et);
        addressET=findViewById(R.id.address_et);

    }

    public void get_register(View view)
    {

        String nameTV=nameEt.getText().toString();
        String emailTV=emailET.getText().toString();
        String phoneTV=phoneET.getText().toString();
        String addressTV=addressET.getText().toString();

        Student student=new Student(nameTV,emailTV,phoneTV,addressTV);

        Intent intent=new Intent(this,Students_details.class);

        intent.putExtra("student",student);

        startActivity(intent);
    }
}

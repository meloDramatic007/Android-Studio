package com.example.saddan.studentdatashowwithlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

    public void addStudentData(View view)
    {

        String nameTV=nameEt.getText().toString();
        String emailTV=emailET.getText().toString();
        String phoneTV=phoneET.getText().toString();
        String addressTV=addressET.getText().toString();

        Student student=new Student(nameTV,emailTV,phoneTV,addressTV);

       Student.addStudent(student);

        Toast.makeText(this, "Data Saved Successfully", Toast.LENGTH_SHORT).show();


    }

    public void viewStudentData(View view)
    {
        Intent intent=new Intent(this,Student.class);

        intent.putExtra("student",student);

        startActivity(intent);
    }
}

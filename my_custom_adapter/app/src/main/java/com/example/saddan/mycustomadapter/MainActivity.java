package com.example.saddan.mycustomadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
     EditText nameET,emailET,phoneET,adreessET;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameET=findViewById(R.id.name_et);
        emailET=findViewById(R.id.email_et);
        phoneET=findViewById(R.id.phone_et);
        adreessET=findViewById(R.id.address_et);
    }

    public void saveData(View view)
    {
        String name=nameET.getText().toString();
        String email=emailET.getText().toString();
        String phone=phoneET.getText().toString();
        String adress=adreessET.getText().toString();

        Student student=new Student(name,email,phone,adress);
        student.addStudent(student);
        Toast.makeText(this, "data saved", Toast.LENGTH_SHORT).show();
    }

    public void viewDaata(View view)
    {
        Intent intent =new Intent(this,view_student_list.class);
        startActivity(intent);
    }
}

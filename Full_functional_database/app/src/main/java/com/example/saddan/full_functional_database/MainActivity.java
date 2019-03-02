package com.example.saddan.full_functional_database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity
{
     EditText nameET,emailET,phoneET,addressET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameET=findViewById(R.id.nameET);
        emailET=findViewById(R.id.email_ET);
        phoneET=findViewById(R.id.phone_ET);
        addressET=findViewById(R.id.address_ET);
    }

    public void saveData(View view)
    {
        String name,email,phone,address;
        name=nameET.getText().toString();
        email=emailET.getText().toString();
        phone=phoneET.getText().toString();
        address=addressET.getText().toString();
        Student student=new Student(name,email,phone,address);

        Student_data_source student_data_source=new Student_data_source(this);

        boolean saved=student_data_source.saveStudentInformation(student);

        if(saved)
        {
            Toast.makeText(this, "your data is saved", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "your data is not saved", Toast.LENGTH_SHORT).show();
        }
    }

    public void viewStudent(View view)  {
        Student_data_source student_data_source=new Student_data_source(this);
        ArrayList<Student> studentList=student_data_source.getAllStudent();

        Gson gson=new Gson();
        String iputString=gson.toJson(studentList);
        Toast.makeText(this, iputString+"", Toast.LENGTH_SHORT).show();

        if(studentList.size()==0)
        {
            Toast.makeText(this, studentList.size() + "", Toast.LENGTH_SHORT).show();
        }
      else {
            Intent intent = new Intent(this, Student_Database_View.class);
            startActivity(intent);
        }
    }

    public void deleteData(View view)
    {
    Student_data_source student_data_source=new Student_data_source(this);
    boolean deleted=student_data_source.deleteStudent(3);
    if(deleted)
    {
        Toast.makeText(this, "deleted", Toast.LENGTH_SHORT).show();
    }
    else
    {
        Toast.makeText(this, "not deleted", Toast.LENGTH_SHORT).show();
    }
    }



    public void updateData(View view)
    {
        Student_data_source student_data_source=new Student_data_source(this);
        boolean updated=student_data_source.updateStudent(1);
        if(updated)
        {
            Toast.makeText(this, "updated successfully", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "not updated", Toast.LENGTH_SHORT).show();
        }
    }
}

package com.example.saddan.student_data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{   EditText nameEt,emailET,phoneET,departmentET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEt=findViewById(R.id.name_et);
        emailET=findViewById(R.id.email_et);
        phoneET=findViewById(R.id.phone_et);
        departmentET=findViewById(R.id.department_et);

    }

    public void get_register(View view)
    {
        String nameTV=nameEt.getText().toString();
        String emailTV=emailET.getText().toString();
        String phoneTV=phoneET.getText().toString();
        String departmentTV=departmentET.getText().toString();

        Intent intent=new Intent(this,View_Reg.class);
        intent.putExtra("name",nameTV);
        intent.putExtra("email",emailTV);
        intent.putExtra("phone",phoneTV);
        intent.putExtra("department",departmentTV);
        startActivity(intent);

    }
}

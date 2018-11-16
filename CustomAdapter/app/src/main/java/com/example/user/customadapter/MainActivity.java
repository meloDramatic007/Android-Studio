package com.example.user.customadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameET, emailET, phoneET, addressET, departmentET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameET = findViewById(R.id.nameET);
        emailET = findViewById(R.id.emailET);
        phoneET = findViewById(R.id.phoneET);
        addressET = findViewById(R.id.addresET);
        departmentET = findViewById(R.id.departmentET);
    }

    public void saveData(View view) {
        String name = nameET.getText().toString();
        String email = emailET.getText().toString();
        String phone = phoneET.getText().toString();
        String address = addressET.getText().toString();
        String department = departmentET.getText().toString();


        Student student = new Student(name, email, phone, address, department);

        Student.addStudent(student);

        Toast.makeText(this, "Data Saved Successfully", Toast.LENGTH_SHORT).show();
    }

    public void viewStudentList(View view)
    {
        Intent intent = new Intent(this, StudentListActivity.class);
        startActivity(intent);

    }
}

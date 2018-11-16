package com.example.user.studentmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class AddStudentActivity extends AppCompatActivity {
    EditText nameET, phoneET, emailET, dobET;
    Spinner divisionSP;
    RadioGroup genderRG;
    String division, gender;

    ArrayList<String> skillList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        nameET = findViewById(R.id.nameET);
        phoneET = findViewById(R.id.phoneET);
        emailET = findViewById(R.id.emailET);
        dobET = findViewById(R.id.dobET);
        divisionSP = findViewById(R.id.divisionSP);
        genderRG = findViewById(R.id.genderRG);

        final String divisionList[] = {"Dhaka",  "Barishal", "Chittagong", "Sylhet"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                divisionList);
        divisionSP.setAdapter(adapter);

        divisionSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                division = divisionList[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        genderRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton genderRB = findViewById(checkedId);
                gender = genderRB.getText().toString();
            }

        });
    }

    public void submitStudent(View view) {
        String name = nameET.getText().toString();
        String phone = phoneET.getText().toString();
        String email = emailET.getText().toString();
        String dob = dobET.getText().toString();

        Student student = new Student(name, phone, email, dob, division, gender, skillList);
        Student.addStudentIntheList(student);

        Toast.makeText(this, "Data Added Successfully!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, StudentListActivity.class);
        startActivity(intent);

    }

    public void selectSkill(View view) {
        CheckBox skillCB = (CheckBox) view;


        if(skillCB.isChecked()){
            skillList.add(skillCB.getText().toString());
        }
        else{
            skillList.remove(skillCB.getText().toString());
        }


    }
}

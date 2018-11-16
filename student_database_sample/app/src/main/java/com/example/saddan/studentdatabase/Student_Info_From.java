package com.example.saddan.studentdatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Student_Info_From extends AppCompatActivity
{
    EditText nameET,emailET,phoneET,addressEt;
    TextView genderET,languageET;
    RadioGroup radioGroup;
    RadioButton male,female,others;
    CheckBox checkC_Cplus,checkJava,checkPython;
    @Override
    protected void onCreate(Bundle savedInstanceState)




    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__info__from);

        nameET=findViewById(R.id.nameET);
        emailET=findViewById(R.id.emailET);
        phoneET=findViewById(R.id.phoneET);
        addressEt=findViewById(R.id.addressET);
        genderET=findViewById(R.id.genderET);
        radioGroup=findViewById(R.id.radioGroup);
        male=findViewById(R.id.maleET);
        female=findViewById(R.id.femaleET);
        others=findViewById(R.id.othersET);
        languageET=findViewById(R.id.languageET);



        checkC_Cplus=findViewById(R.id.c_cPlusET);

        checkJava=findViewById(R.id.javaET);

        checkPython=findViewById(R.id.pythonET);


    }





    public void get_submit(View view)
    {
        String name=nameET.getText().toString();
        String email=emailET.getText().toString();
        String phone=phoneET.getText().toString();
        String address=addressEt.getText().toString();
        String gender;

        if (male.isChecked())
        {
            gender=male.getText().toString();
        }
        else if (female.isChecked())
        {
            gender=female.getText().toString();
        }
        else
            {
               gender=others.getText().toString();
            }


            String skill,skills="";

        if(checkC_Cplus.isChecked())
        {
            skill=checkC_Cplus.getText().toString();
            if(skills=="")
            {
                skills+=skill;
            }
            else{
            skills+=","+skill;
            }
        }
        if(checkJava.isChecked())
        {
            skill=checkJava.getText().toString();
            if(skills=="")
            {
                skills+=skill;
            }
            else{
                skills+=","+skill;
            }
        }
        if(checkPython.isChecked())
        {
            skill=checkPython.getText().toString();
            if(skills=="")
            {
                skills+=skill;
            }
            else{
                skills+=","+skill;
            }
        }



        Student_details student=new Student_details(name,email,phone,address,gender,skills);
            student.addStudent(student);

            Toast.makeText(this, "Your data is saved", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity.class);

        Student_Info_From.this.finish();
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent startMain=new Intent(this,MainActivity.class);
        startActivity(startMain);
        Student_Info_From.this.finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

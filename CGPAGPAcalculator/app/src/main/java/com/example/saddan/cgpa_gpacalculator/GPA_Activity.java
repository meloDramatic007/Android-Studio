package com.example.saddan.cgpa_gpacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GPA_Activity extends AppCompatActivity
{
        EditText SubjectET,numberET;
        ListView listViewTV;
        TextView gpaTV;
    double total=0;
    int number_of_subject=0;
    String subject;
    double number;
    String grade="";
    double gradePoint;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_layout);
        SubjectET=findViewById(R.id.subjectInput);
        numberET=findViewById(R.id.numberInput);
        gpaTV=findViewById(R.id.gpaTV);
        listViewTV=findViewById(R.id.listviewTV);
    }

    public void AddClick(View view)
    {

        subject=SubjectET.getText().toString();
        number=Double.parseDouble(numberET.getText().toString());

        number_of_subject++;

        if(number>=80 && number<=100)
        {
            grade="A+";
            gradePoint=5.00;
        }
        else if(number>=70 && number<=79)
        {
            grade="A";
            gradePoint=4.00;
        }
        else if(number>=60 && number<=69)
        {
            grade="A-";
            gradePoint=3.50;
        }
        else if(number>=50 && number<=59)
        {
            grade="B";
            gradePoint=3.00;
        }
        else if(number>=40 && number<=49)
        {
            grade="C";
            gradePoint=2.00;
        }
        else if(number>=33 && number<=39)
        {
            grade="D";
            gradePoint=1.00;
        }
        else
        {
            grade="F";
            gradePoint=0.00;
        }

        total+=gradePoint;
        gpaTV.setText(total/number_of_subject+"");
        Grade_Point_Average grade_point_average=new Grade_Point_Average(subject,grade,gradePoint);
        grade_point_average.addGpa(grade_point_average);
        final ArrayList<Grade_Point_Average> gpa=Grade_Point_Average.getGpa();
        Subject_Grade_GP_adapter subject_grade_gp_adapter=new Subject_Grade_GP_adapter(this,gpa);
        listViewTV.setAdapter(subject_grade_gp_adapter);
         SubjectET.setText("");
         numberET.setText("");

    }


    public void optionalClick(View view)
    {

        subject=SubjectET.getText().toString();
        number=Double.parseDouble(numberET.getText().toString());



        if(number>=80 && number<=100)
        {
            grade="A+";
            gradePoint=5.00-2.00;
        }
        else if(number>=70 && number<=79)
        {
            grade="A";
            gradePoint=4.00-2.00;
        }
        else if(number>=60 && number<=69)
        {
            grade="A-";
            gradePoint=3.50-2.00;
        }
        else if(number>=50 && number<=59)
        {
            grade="B";
            gradePoint=3.00-2.00;
        }
        else if(number>=40 && number<=49)
        {
            grade="C";
            gradePoint=2.00-2.00;
        }
        else if(number>=33 && number<=39)
        {
            grade="D";
            gradePoint=0.0;
        }
        else
        {
            grade="F";
            gradePoint=0.00;
        }

        total+=gradePoint;
        gpaTV.setText(total/number_of_subject+"");
        Grade_Point_Average grade_point_average=new Grade_Point_Average(subject,grade,gradePoint);
        grade_point_average.addGpa(grade_point_average);

        final ArrayList<Grade_Point_Average> gpa=Grade_Point_Average.getGpa();
        Subject_Grade_GP_adapter subject_grade_gp_adapter=new Subject_Grade_GP_adapter(this,gpa);

        listViewTV.setAdapter(subject_grade_gp_adapter);
        SubjectET.setText("");
        numberET.setText("");

    }

    @Override
    public void onBackPressed()
    {

        Intent startMain=new Intent(this,MainActivity.class);
        startActivity(startMain);
        ArrayList<Grade_Point_Average> gpa=Grade_Point_Average.getGpa();
        gpa.clear();
        finish();
    }
}

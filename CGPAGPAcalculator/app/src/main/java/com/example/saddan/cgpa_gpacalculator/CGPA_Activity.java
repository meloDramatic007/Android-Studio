package com.example.saddan.cgpa_gpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CGPA_Activity extends AppCompatActivity
{
     EditText subjectET,creditET,gpaET;
     ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);
        subjectET=findViewById(R.id.subjectInput);
        creditET=findViewById(R.id.creditInput);
        gpaET=findViewById(R.id.gpaInput);
        listView=findViewById(R.id.listviewTV);
    }

    public void addClick(View view)
    {

        String subject=subjectET.getText().toString();
        int credit=Integer.parseInt(creditET.getText().toString());
        double gpa=Double.parseDouble(gpaET.getText().toString());

        String creditX=Integer.toString(credit);
        String gpaX=Double.toString(gpa);
        String total=Double.toString(credit*gpa);


        CGPA_model_Class cgpa_model_class=new CGPA_model_Class(subject,creditX,gpaX,total);
        cgpa_model_class.addCgpa(cgpa_model_class);

        final ArrayList<CGPA_model_Class> cgpa=CGPA_model_Class.getCgpa();

        CGPA_adapter adapter=new CGPA_adapter(this,cgpa);
        listView.setAdapter(adapter


        );



    }
}

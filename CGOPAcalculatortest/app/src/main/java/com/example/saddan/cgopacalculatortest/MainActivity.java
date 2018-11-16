package com.example.saddan.cgopacalculatortest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    EditText subjectET,creditET,gpaET;
    ListView listViewTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subjectET=findViewById(R.id.subjectET);
        creditET=findViewById(R.id.creditET);
        gpaET=findViewById(R.id.GPAET);
        listViewTV=findViewById(R.id.listviewTV);
    }

    public void addClick(View view)
    {
         String subject=subjectET.getText().toString();
         int credit=Integer.parseInt(creditET.getText().toString());
         double gpa=Double.parseDouble(gpaET.getText().toString());
         double total=gpa*credit;
         CGPA cgpa=new CGPA(subject,credit,gpa,total);
         cgpa.ADDcgps(cgpa);
         Toast.makeText(this, "data saved succesfully", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, subject+"", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, credit+"", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, gpa+"", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, total+"", Toast.LENGTH_SHORT).show();


         final ArrayList<CGPA> cgpaX=CGPA.getCGPA();
         CGPA_Adapter cgpa_adapter=new CGPA_Adapter(this,cgpaX);
         listViewTV.setAdapter(cgpa_adapter);
    }
}



package com.example.saddan.cgpa_gpacalculatorv12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        gpaET=findViewById(R.id.gpaET);

        listViewTV=findViewById(R.id.listViewTV);

    }

    public void AddClick(View view)
    {
          String subject=subjectET.getText().toString();
          int credit=Integer.parseInt(creditET.getText().toString());
          double gpa=Double.parseDouble(gpaET.getText().toString());

          String creditX=Integer.toString(credit);
          String gpaX=Double.toString(gpa);
          String total=Double.toString(credit*gpa);



        Grade_Point_Average grade_point_average=new Grade_Point_Average(subject,creditX,gpaX,total);
        grade_point_average.addCgpa(grade_point_average);
        final ArrayList<Grade_Point_Average> cgpx=Grade_Point_Average.getCgpa();
        Subject_Grade_GP_adapter adapter=new Subject_Grade_GP_adapter(this,cgpx);
        listViewTV.setAdapter(adapter);



        Toast.makeText(this, "your data is saved", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, subject+"", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, credit+"", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, gpa+"", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, total+"", Toast.LENGTH_SHORT).show();

    }
}

package com.example.saddan.random_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MinMax extends AppCompatActivity
{   EditText first_number,second_number;
    TextView  showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_max);
        first_number=findViewById(R.id.first_number);
        second_number=findViewById(R.id.second_number);
        showResult=findViewById(R.id.showResult);
    }

    public void compare_number(View view)
    {
        double FirstNumber=Double.parseDouble(first_number.getText().toString());
        double SecondNumber=Double.parseDouble(second_number.getText().toString());
        if(FirstNumber>SecondNumber)
        {
            showResult.setText("Bigger number is :");
            showResult.setText(Double.toString(FirstNumber));
        }
        else if(FirstNumber<SecondNumber)
        {
            showResult.setText("Smaller number is :");
            showResult.setText(Double.toString(SecondNumber));
        }
        else
        {
            showResult.setText("Both number's are equal");
        }

    }



}

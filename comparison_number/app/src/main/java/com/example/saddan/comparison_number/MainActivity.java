package com.example.saddan.comparison_number;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
     EditText first_number,second_number;
     TextView show_result;
     String msg="Both numbers are equal";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_number=findViewById(R.id.first_number);
        second_number=findViewById(R.id.second_number);
        show_result=findViewById(R.id.show_result);
    }

    public void comparison(View view) {
        double FirstNumber=Double.parseDouble(first_number.getText().toString());
        double SecondNumber=Double.parseDouble(second_number.getText().toString());
        if(FirstNumber>SecondNumber)
        {
            show_result.setText(Double.toString(FirstNumber));
        }
        else if(FirstNumber<SecondNumber)
        {
            show_result.setText(Double.toString(SecondNumber));
        }
        else
        {
            show_result.setText(msg);
        }

    }
}

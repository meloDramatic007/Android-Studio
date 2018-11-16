package com.example.saddan.random_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Odd_Even extends AppCompatActivity
 {
    EditText number;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odd__even);
        number=findViewById(R.id.number);
        result=findViewById(R.id.result);
    }

    public void find_type(View view)
    {
        int Number=Integer.parseInt(number.getText().toString());
        if(Number%2==0)
        {
            result.setText("This is a even number");
        }
        else
        {
            result.setText("This is a odd number");
        }
    }
}

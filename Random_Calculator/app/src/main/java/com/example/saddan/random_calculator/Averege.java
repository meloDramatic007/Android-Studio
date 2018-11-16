package com.example.saddan.random_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Averege extends AppCompatActivity
{
    EditText first_number,second_number;
    TextView showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_averege);
        first_number=findViewById(R.id.first_number);
        second_number=findViewById(R.id.second_number);
        showResult=findViewById(R.id.showResult);
    }
    public void find_averege(View view)
    {
        double FirstNumber=Double.parseDouble(first_number.getText().toString());
        double SecondNumber=Double.parseDouble(second_number.getText().toString());
        double total=(FirstNumber+SecondNumber)/2;
        showResult.setText(Double.toString(total));

    }
}

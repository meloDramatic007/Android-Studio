package com.example.saddan.my_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText first_number,second_number;
    TextView show_result;
    double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         first_number=findViewById(R.id.first_number);
         second_number=findViewById(R.id.second_number);
         show_result=findViewById(R.id.show_result);


    }
    public void operation(View view)
    {
        double FirstNumber=Double.parseDouble(first_number.getText().toString());
        double SecondNumber=Double.parseDouble(second_number.getText().toString());
        switch (view.getId())
        {
            case R.id.add:
                addition(FirstNumber,SecondNumber);
                break;
            case R.id.substract:
                substract(FirstNumber,SecondNumber);
                break;
            case R.id.multiply:
                multiyply(FirstNumber,SecondNumber);
                break;
            case R.id.divided:
                divided(FirstNumber,SecondNumber);

        }


    }
    private void addition(double FirstNumber,double SecondNumber)
    {
        total=FirstNumber+SecondNumber;
        show_result.setText(Double.toString(total));

    }
    private void substract(double FirstNumber,double SecondNumber )
    {
        total=FirstNumber-SecondNumber;
        show_result.setText(Double.toString(total));
    }
    private void multiyply(Double FirstNumber,Double SecondNumber )
    {
        total=FirstNumber*SecondNumber;
        show_result.setText(Double.toString(total));
    }
    private void divided(double FirstNumber,double SecondNumber )
    {
        total=FirstNumber/SecondNumber;
        show_result.setText(Double.toString(total));
    }
}

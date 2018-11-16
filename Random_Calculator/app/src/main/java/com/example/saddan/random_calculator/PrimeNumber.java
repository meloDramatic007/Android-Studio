package com.example.saddan.random_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeNumber extends AppCompatActivity
{
    EditText number;
    TextView showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_number);
        number=findViewById(R.id.number);
        showResult=findViewById(R.id.showResult);
    }

    public void find_prime(View view)
    {
        int Number=Integer.parseInt(number.getText().toString());
        if(isPrime(Number))
        {
            showResult.setText(Integer.toString(Number)+" : is a prime number");
        }
        else
        {
            showResult.setText(Integer.toString(Number)+" : is not a prime number");
        }
    }
    public static boolean isPrime(int Number)
    {
        if(Number<=1)
        {
            return false;
        }
        for(int i=2;i<Math.sqrt(Number);i++)
        {
            if(Number%i==0)
            {
                return false;
            }
        }
        return true;
    }
}

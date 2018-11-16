package com.example.saddan.random_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMinMax(View view)
    {
        Intent intent=new Intent(this,MinMax.class);
        startActivity(intent);
    }

    public void openAverege(View view)
    {
        Intent intent=new Intent(this,Averege.class);
        startActivity(intent);
    }

    public void openClalculator(View view)
    {
        Intent intent=new Intent(this,Calculator.class);
        startActivity(intent);
    }

    public void openPrimeNumber(View view)
    {
        Intent intent=new Intent(this,PrimeNumber.class);
        startActivity(intent);
    }

    public void openOddEven(View view)
    {
        Intent intent=new Intent(this,Odd_Even.class);
        startActivity(intent);
    }

    public void openStringLength(View view)
    {
        Intent intent=new Intent(this,StringLength.class);
        startActivity(intent);
    }

    public void openPallindrome(View view)
    {
        Intent intent=new Intent(this,Pallindrome
                .class);
        startActivity(intent);
    }
}

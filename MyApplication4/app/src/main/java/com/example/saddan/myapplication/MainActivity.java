package com.example.saddan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText firstNumberET,SecondNumberET;
    TextView showResultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumberET=findViewById(R.id.first_number);
        SecondNumberET=findViewById(R.id.second_number);
        showResultTV=findViewById(R.id.total);
    }
    public void Addition(View view)
    {

        int firstNumber=Integer.parseInt(firstNumberET.getText().toString());
        int SecondNumber=Integer.parseInt(SecondNumberET.getText().toString());
        int total=firstNumber+SecondNumber;
        showResultTV.setText(Integer.toString(total));
        Toast.makeText(this,total+"",Toast.LENGTH_SHORT).show();
    }
}

package com.example.saddan.random_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class StringLength extends AppCompatActivity
{
    EditText StringET;
    TextView  ResultET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_length);
        StringET=findViewById(R.id.string_id);
        ResultET=findViewById(R.id.result);
    }

    public void stringLength(View view)
    {
        int StringLength=StringET.length();
        ResultET.setText("String length is :"+Integer.toString(StringLength));
    }
}

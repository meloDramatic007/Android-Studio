package com.example.saddan.cgpa_gpacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openGPAactivity(View view)
    {
        Intent intent=new Intent(this,GPA_Activity.class);
       startActivity(intent);
       finish();
    }

    public void openCGPAactivity(View view)
    {
        Intent intent=new Intent(this,CGPA_Activity.class);
        startActivity(intent);

    }
}

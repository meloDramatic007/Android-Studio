package com.example.saddan.time_picker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
{
    TextClock current_time;
    TimePicker alarmTime;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        current_time=findViewById(R.id.Text_Clock);
        alarmTime=findViewById(R.id.timePicker);

        Timer timer=new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run()
            {
             if (current_time.getText().toString().equals(AlarmTime()))
             {

             }
            }
        },0,1000);


}

}

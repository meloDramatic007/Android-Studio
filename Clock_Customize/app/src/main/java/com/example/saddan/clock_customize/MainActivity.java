package com.example.saddan.clock_customize;

import android.app.TimePickerDialog;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextClock;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
{
    TextView alarm_timeTV;
    Button set_alarm;
    TimePickerDialog set_alarm_picker;
    TextClock current_time;
    String alarmTime;
    Integer hour;

    String AM_PM="";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alarm_timeTV=findViewById(R.id.alarm_timeTV);
        set_alarm=findViewById(R.id.setAlarm);
        current_time=findViewById(R.id.textclock);


        final Ringtone ringtone= RingtoneManager.getRingtone(getApplicationContext(),RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE));






        set_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePicker timePicker=new TimePicker(MainActivity.this);
                Integer hour=timePicker.getCurrentHour();
                Integer minute=timePicker.getCurrentMinute();
                 /*if(minute<10)
                 {
                     minutesString+=minute.toString();
                 }
                 else
                 {
                     minutesString=minute.toString();
                 }*/

                //Toast.makeText(MainActivity.this, minutesString+"", Toast.LENGTH_SHORT).show();





                set_alarm_picker=new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener()
                {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute)
                    {
                        if(hourOfDay==0)
                        {
                            hourOfDay=hourOfDay+12;
                            AM_PM=" am";
                        }
                        else if(hourOfDay==12)
                        {
                            AM_PM=" pm";
                        }
                        else if (hourOfDay>12)
                        {
                            hourOfDay=hourOfDay-12;
                            AM_PM=" pm";
                        }
                        else
                        {
                            AM_PM=" am";
                        }
                       if(minute<10)
                       {
                           alarmTime=hourOfDay+":0"+minute+AM_PM ;
                           alarm_timeTV.setText(hourOfDay+":0"+minute+AM_PM);
                       }

                       else{ alarmTime=hourOfDay+":"+minute+AM_PM ;

                        alarm_timeTV.setText(hourOfDay+":"+minute+AM_PM);
                       }

                    }
                },hour,minute,false);
                set_alarm_picker.show();
            }
        });


        Timer time=new Timer();

        time.scheduleAtFixedRate(new TimerTask()
        {



            @Override
            public void run() {

                if(current_time.getText().toString().equals(alarmTime))
                {
                      ringtone.play();
                }
                else
                {
                       ringtone.stop();
                }

            }
        },0,1000);



    }
}



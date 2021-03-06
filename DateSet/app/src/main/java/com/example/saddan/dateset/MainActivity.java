package com.example.saddan.dateset;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity

{
    TextView dateTV;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      dateTV=findViewById(R.id.selec_date);
        Locale locale = new Locale("bn");
        Locale.setDefault(locale);


        Calendar calendar=Calendar.getInstance();

        final int day=calendar.get(calendar.DAY_OF_MONTH);
        final int month=calendar.get(calendar.MONTH);
        final int year=calendar.get(calendar.YEAR);

      /*dateTV.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener()
              {
                  @Override
                  public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                      String date=dayOfMonth+"/"+month+"/"+year;
                      dateTV.setText(date);
                  }
              },
                      year, month, day
              );

              datePickerDialog.show();
          }
      });
*/
        DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener()
        {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String date=dayOfMonth+"/"+month+"/"+year;
                dateTV.setText(date);
            }
        },
                year, month, day
        );

        datePickerDialog.show();


    }


}

package com.example.shared_preferences_using_class;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shared_preferences_using_class.Helper.LocalHelper;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity
{
    private static final String PREFS_NAME ="My_Settings" ;
    TextView myLang;
    Button changLang;
     RadioButton bangla,english;
     String Language;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myLang=findViewById(R.id.LangTV);
        changLang=findViewById(R.id.ChangeID);
        Paper.init(this);

        Context context=getApplicationContext();
        MyPreferences myPreferences=new MyPreferences(context);


        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);

        if(settings.getBoolean("my_first_time",true))
        {
            firstTimeLaunch();
            Toast.makeText(context, "My first time", Toast.LENGTH_SHORT).show();
            settings.edit().putBoolean("my_first_time", false).commit();
        }

        Language=myPreferences.getData("Key");



        if(Language.equals("bn"))
        {
            Paper.book().write("language","bn");
            updateView((String)Paper.book().read("language"));
        }
        else if(Language.equals("en"))
        {
            Paper.book().write("language","en");

            updateView((String)Paper.book().read("language"));
        }
        else
        {

        }

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    private void updateView(String language)
    {
        Context context= LocalHelper.setLocale(this,language);
        Resources resources=context.getResources();

        myLang.setText(resources.getString(R.string.myLang));
    }

    private void firstTimeLaunch()
    {
        setContentView(R.layout.preference_layout);
        Button next=findViewById(R.id.nextID);
        bangla=findViewById(R.id.BanglaSelect);
        english=findViewById(R.id.EnglSelect);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LinearLayout layout=findViewById(R.id.prefference_layout);
                Context context=getApplicationContext();
                MyPreferences yourPrefrence = MyPreferences.getInstance(context);
                //SharedPreferences sp = getSharedPreferences("FILE_NAME", MODE_PRIVATE);
                if(bangla.isChecked())
                {
                    Language="bn";


                    yourPrefrence.saveData("Key","bn");

                    //String value = yourPreference.getData(YOUR_KEY);

                }
                else if(english.isChecked())
                {
                    //Language="en";

                    yourPrefrence.saveData("Key","en");


                }

                Intent intent = getIntent();
                finish();
                startActivity(intent);
                //layout.setVisibility(View.GONE);
                //setContentView(R.layout.activity_main);
            }
        });


    }

    public void ChangleLang(View view)
    {
        Context context=getApplicationContext();
        MyPreferences yourPrefrence = MyPreferences.getInstance(context);
        if(Language.equals("en"))
        {
            yourPrefrence.saveData("Key","bn");
        }
        else
            {
            yourPrefrence.saveData("Key","en");
            }

        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }
}

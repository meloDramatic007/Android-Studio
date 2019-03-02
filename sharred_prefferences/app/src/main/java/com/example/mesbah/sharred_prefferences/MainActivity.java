package com.example.mesbah.sharred_prefferences;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import io.paperdb.Paper;
import com.example.mesbah.sharred_prefferences.Helper.LocalHelper;

public class MainActivity extends AppCompatActivity {

    private RadioButton bangla,english;
    private String language;
    private String Language;
    private static String result;
    TextView textView;



    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)

    /*protected void attachBaseContext(Context newBase)
    {
        //language  = preferences.getString("Language", "");
        super.attachBaseContext(LocalHelper.onAttch(newBase,"en"));
    }*/


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.TextID);
        Paper.init(this);

        SharedPreferences sps = getSharedPreferences("FILE_NAME", MODE_PRIVATE);
        result = sps.getString("key", "");

        Toast.makeText(this, "My fuck="+result, Toast.LENGTH_SHORT).show();

        Paper.book().write("language",result);
        updateView((String)Paper.book().read("language"));

        final String PREFS_NAME = "MyPrefsFile";

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);

        if (settings.getBoolean("my_first_time", true))
        {

              ;
            //the app is being launched for first time, do something
            Log.d("Comments", "First time");

            Toast.makeText(this, "app launched for the first time", Toast.LENGTH_SHORT).show();

              // first time task

            setContentView(R.layout.set_laguage_prefferences);
            Button next=findViewById(R.id.nextID);
            bangla=findViewById(R.id.BanglaSelect);
            english=findViewById(R.id.EnglSelect);





            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    LinearLayout layout=findViewById(R.id.prefference_layout);
                    SharedPreferences sp = getSharedPreferences("FILE_NAME", MODE_PRIVATE);
                    if(bangla.isChecked())
                    {
                        Language="bn";

                        SharedPreferences.Editor edit = sp.edit();
                        edit.putString("key",Language);
                        edit.apply();
                        Toast.makeText(MainActivity.this, "Langu="+Language, Toast.LENGTH_SHORT).show();
                        Paper.book().write("language",Language);
                        updateView((String)Paper.book().read("language"));
                    }
                    else if(english.isChecked())
                    {
                        Language="en";
                        SharedPreferences.Editor edit = sp.edit();
                        edit.putString("key",Language);
                        edit.apply();
                        Toast.makeText(MainActivity.this, "Langu="+Language, Toast.LENGTH_SHORT).show();
                        Paper.book().write("language",Language);
                        updateView((String)Paper.book().read("language"));
                    }


                    layout.setVisibility(View.GONE);
                    setContentView(R.layout.activity_main);
                }
            });

            // record the fact that the app has been started at least once
            settings.edit().putBoolean("my_first_time", false).commit();
        }




    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void attachBaseContext(Context newBase)
    {
        super.attachBaseContext(LocalHelper.onAttch(newBase,result));
    }



    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    private void updateView(String language)
    {
        Context context=LocalHelper.setLocale(this,language);
        Resources resources=context.getResources();
        setTitle(resources.getString(R.string.app_name));
          textView.setText(resources.getString(R.string.Hello));


    }
}




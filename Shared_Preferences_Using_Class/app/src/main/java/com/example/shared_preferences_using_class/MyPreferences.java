package com.example.shared_preferences_using_class;

import android.content.Context;
import android.content.SharedPreferences;

import java.security.Key;

public class MyPreferences
{

    private static MyPreferences myPreference;
    private SharedPreferences sharedPreferences;

    public static MyPreferences getInstance(Context context)
    {
        if (myPreference== null)
        {
            myPreference = new MyPreferences(context);
        }
        return myPreference;
    }

    public MyPreferences(Context context)
    {
        sharedPreferences = context.getSharedPreferences("YourCustomNamedPreference",Context.MODE_PRIVATE);
    }

    public void saveData(String key,String value)
    {
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        prefsEditor .putString(key, value);
        prefsEditor.commit();
    }

    public String getData(String key) {
        if (sharedPreferences!= null) {
            return sharedPreferences.getString(key, "");
        }
        return "";
    }

    public boolean getBoolean(String key, boolean defValue)
    {
        return false;
    }
}

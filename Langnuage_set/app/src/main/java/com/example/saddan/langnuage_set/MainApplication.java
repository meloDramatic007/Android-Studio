package com.example.saddan.langnuage_set;

import android.app.Application;
import android.content.Context;

import com.example.saddan.langnuage_set.Helper.LocalHelper;

public class MainApplication extends Application
{
    @Override
    protected void attachBaseContext(Context base)
    {
        super.attachBaseContext(LocalHelper.onAttch(base,"en"));
    }
}

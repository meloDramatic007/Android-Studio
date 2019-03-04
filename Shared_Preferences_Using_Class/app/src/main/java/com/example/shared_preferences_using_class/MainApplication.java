package com.example.shared_preferences_using_class;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.widget.Button;
import android.widget.TextView;

import com.example.shared_preferences_using_class.Helper.LocalHelper;

public class MainApplication extends Application
{

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void attachBaseContext(Context base)
    {
        super.attachBaseContext(LocalHelper.onAttch(base,"en"));

    }
}

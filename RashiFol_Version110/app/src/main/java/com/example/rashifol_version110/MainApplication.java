package com.example.rashifol_version110;



import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.rashifol_version110.Helper.LocalHelper;

public class MainApplication extends Application
{
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void attachBaseContext(Context base)
    {
        super.attachBaseContext(LocalHelper.onAttch(base,"en"));

    }
}

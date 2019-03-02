package com.example.saddan.android_server;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import appapis.queryfiles.AppApis;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savd) {
        super.onCreate(savd);
        setContentView(R.layout.activity_main);




        androidhttpweb.TinyWebServer.startServer("localhost",9000, "/web/public_html");
        AppApis apis=new AppApis();
        apis.helloworld();
        //onDestroy();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        androidhttpweb.TinyWebServer.stopServer();
    }
}

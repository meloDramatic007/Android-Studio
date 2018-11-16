package com.example.saddan.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button firstFragment,secondFragment;
    FrameLayout frameLayout;
    TextView stdn_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragment=findViewById(R.id.firstFragment);
        secondFragment=findViewById(R.id.secondFragment);
        frameLayout=findViewById(R.id.frameLayout);
        stdn_msg=findViewById(R.id.stdnt_msg);

        String message=stdn_msg.getText().toString();
        stdn_msg.setText(message);

        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstFragment firstFragment=new firstFragment();
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,firstFragment);
                fragmentTransaction.commit();
            }
        });
        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondFragment secondFragment =new secondFragment();
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,secondFragment);
                fragmentTransaction.commit();
            }
        });
    }
}

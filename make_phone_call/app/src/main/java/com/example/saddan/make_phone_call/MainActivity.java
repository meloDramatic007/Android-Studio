package com.example.saddan.make_phone_call;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView phoneCallTV;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneCallTV=findViewById(R.id.txt);
        phoneCallTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: "+phoneCallTV.getText().toString()));
                if ((intent.resolveActivity(getPackageManager())!=null))
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "component doesnt found", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}

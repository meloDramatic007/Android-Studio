package com.example.saddan.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    ListView ListViewTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ListViewTV=findViewById(R.id.ListViewTV);

        String countryList []={"Bangladesh","Sweden","Nepal","Britain","Australia","Germany"};

       int flagList []={R.drawable.bangladesh,
       R.drawable.sweeden,
       R.drawable.nepal,
       R.drawable.britain,
       R.drawable.australia,
       R.drawable.germany};

        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countryList);

        ContryListAdapter adapter=new ContryListAdapter(this,countryList,flagList);
        ListViewTV.setAdapter(adapter);
    }
}

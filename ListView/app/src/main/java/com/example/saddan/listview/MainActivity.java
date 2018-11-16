package com.example.saddan.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView Listv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Listv=findViewById(R.id.list_id);
        ArrayList<String> nameList=new ArrayList<String>();
        nameList.add("sddddskjh");
        nameList.add("sddddskjh");
        nameList.add("sddddskjh");
        nameList.add("sddddskjh");
        nameList.add("sddddskjh");
        nameList.add("sddddskjh");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.activity_list_item,android.R.id.text1,nameList);
        Listv.setAdapter(adapter);

        Listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String name = (String) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        });

    }

}

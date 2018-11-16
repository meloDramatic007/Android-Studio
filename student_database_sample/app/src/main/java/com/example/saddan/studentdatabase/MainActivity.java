package com.example.saddan.studentdatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    TextView msgTV;
    Button AddButton;
    ListView listViewTV;
    String textmsg="There is no available student data";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddButton=findViewById(R.id.AddButton);
        listViewTV=findViewById(R.id.listViewTV);
        msgTV=findViewById(R.id.msgTV);

        final ArrayList<Student_details> students=Student_details.getAllStudent();
        Student_List_Adapter student_list_adapter=new Student_List_Adapter(this,students);
         if(student_list_adapter.getCount()==0)
        {
            msgTV.setText(textmsg);

        }



        listViewTV.setAdapter(student_list_adapter);
         listViewTV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id)
             {

                 Student_details student=Student_details.getAllStudent().get(position);
                 Intent intent=new Intent(view.getContext(),List_View_Item_Details.class);
                  intent.putExtra("student",student);

                   startActivityForResult(intent,position);


             }
         });
    }

    public void AddStudent(View view)
    {
        Intent intent=new Intent(this,Student_Info_From.class);
        startActivity(intent);
        MainActivity.this.finish();
    }


}

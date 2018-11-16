package com.example.saddan.studentdatabase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public  class Student_List_Adapter extends ArrayAdapter<Student_details>
{
    private Context context;
    private ArrayList<Student_details> students;
    public Student_List_Adapter(@NonNull Context context, ArrayList<Student_details> students)
    {
        super(context, R.layout.student_list_adapter,students);
        this.context=context;
        this.students=students;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
          convertView=inflater.inflate(R.layout.student_list_adapter,parent,false);

        TextView nameTV=convertView.findViewById(R.id.nameTV);
        TextView emailTV=convertView.findViewById(R.id.emailTV);


        nameTV.setText(students.get(position).getName());
        emailTV.setText(students.get(position).getEmail());


        return convertView;
    }
}

package com.example.saddan.mycustomadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentList_Adapter extends ArrayAdapter<Student>
{
    private Context context;
    private ArrayList<Student> students;
    public StudentList_Adapter(@NonNull Context context, ArrayList<Student> students)
    {
        super(context, R.layout.activity_student_list__adapter,students);
        this.context=context;
        this.students=students;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.activity_student_list__adapter,parent,false);
        TextView nameTV=convertView.findViewById(R.id.nameTV);
        TextView emailTV=convertView.findViewById(R.id.emailTV);
        TextView phoneTV=convertView.findViewById(R.id.phoneTV);
        TextView addressTV=convertView.findViewById(R.id.addressTV);

        nameTV.setText(students.get(position).getName());
        emailTV.setText(students.get(position).getEmail());
        phoneTV.setText(students.get(position).getPhone());
        addressTV.setText(students.get(position).getAddress());


        return convertView;
    }
}
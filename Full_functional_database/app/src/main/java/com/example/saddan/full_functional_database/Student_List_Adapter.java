package com.example.saddan.full_functional_database;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Student_List_Adapter extends ArrayAdapter<Student>
{
   private Context context;
   private ArrayList<Student> studnets;

    public Student_List_Adapter(@NonNull Context context,ArrayList<Student> students)
    {
        super(context,R.layout.student_list_adapter,students);
        this.context=context;
        this.studnets=students;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.student_list_adapter,parent,false);

        TextView idTV=convertView.findViewById(R.id.coloumn_id);
        TextView nameTV=convertView.findViewById(R.id.coloumn_name);
        TextView emailTV=convertView.findViewById(R.id.coloumn_email);
        TextView phoneTV=convertView.findViewById(R.id.coloumn_phone);
        TextView addressTV=convertView.findViewById(R.id.coloumn_address);

       idTV.setText(Integer.toString(studnets.get(position).getId()));
       nameTV.setText(studnets.get(position).getName());
       emailTV.setText(studnets.get(position).getEmail());
       phoneTV.setText(studnets.get(position).getPhone());
       addressTV.setText(studnets.get(position).getAdress());



       return convertView;
    }
}

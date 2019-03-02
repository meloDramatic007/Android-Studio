package com.example.user.customadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class StudentListAdapter extends {

    private Context context;
    private ArrayList<Student> studentList;

    public StudentListAdapter(@NonNull Context context, ArrayList<Student> studentList) {
        super(context, R.layout.activity_student_details, studentList);
        this.context = context;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.activity_student_details,parent, false );

        TextView nameTV = convertView.findViewById(R.id.nameTV);
        TextView emailTV = convertView.findViewById(R.id.emailTV);
        TextView addressTV = convertView.findViewById(R.id.addressTV);
        TextView phoneTV=convertView.findViewById(R.id.phoneTV);
        TextView departmentTV=convertView.findViewById(R.id.departmentTV);

        nameTV.setText(studentList.get(position).getName());
        emailTV.setText(studentList.get(position).getEmail());
        addressTV.setText(studentList.get(position).getAddress());
        phoneTV.setText(studentList.get(position).getPhone());
        departmentTV.setText(studentList.get(position).getDepartment());



      return convertView;
    }
}

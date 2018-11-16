package com.example.user.studentmanagement;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentListAdapter extends ArrayAdapter {
    private ArrayList<Student> studentList;
    private Context context;

    public StudentListAdapter(@NonNull Context context, ArrayList<Student> studentList) {
        super(context, R.layout.student_list_adapter, studentList);

        this.studentList = studentList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.student_list_adapter, parent, false);

        TextView nameTV = convertView.findViewById(R.id.nameTV);
        TextView emailTV = convertView.findViewById(R.id.emailTV);

        nameTV.setText(studentList.get(position).getName());
        emailTV.setText(studentList.get(position).getEmail());

        return convertView;
    }
}

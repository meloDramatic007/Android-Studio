package com.example.saddan.cgpa_gpacalculator;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Subject_Grade_GP_adapter extends ArrayAdapter<Grade_Point_Average>
{
    private Context context;
    private ArrayList<Grade_Point_Average> gpa;
    public Subject_Grade_GP_adapter(@NonNull Context context, ArrayList<Grade_Point_Average> gpa)
    {
        super(context,R.layout.activity_subject__grade__gp_adapter,gpa);
        this.context=context;
        this.gpa=gpa;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
       LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
       convertView=inflater.inflate(R.layout.activity_subject__grade__gp_adapter,parent,false);

        TextView subjectTV=convertView.findViewById(R.id.SubjectTV);
        TextView gradeTV=convertView.findViewById(R.id.gradeTV);
        TextView gradePointTV=convertView.findViewById(R.id.gradePointTV);

        subjectTV.setText(gpa.get(position).getSubject());
        gradeTV.setText(gpa.get(position).getGrade());
        gradePointTV.setText(gpa.get(position).getGradePoint().toString());

       return convertView;
    }
}



package com.example.saddan.cgpa_gpacalculatorv12;

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
  private ArrayList<Grade_Point_Average> cgpa;
    public Subject_Grade_GP_adapter(@NonNull Context context, ArrayList<Grade_Point_Average> cgpa)
    {
        super(context,R.layout.activity_subject__grade__gp_adapter,cgpa);
                   this.context=context;
                   this.cgpa=cgpa;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.activity_subject__grade__gp_adapter,parent,false);

        TextView subjectTV=convertView.findViewById(R.id.SubjectTV);
        TextView creditTV=convertView.findViewById(R.id.creditTV);
        TextView gpaTV=convertView.findViewById(R.id.gpaTV);
        TextView totalTV=convertView.findViewById(R.id.totalTV);


        subjectTV.setText(cgpa.get(position).getSubject());
        creditTV.setText(cgpa.get(position).getCreditX());
        gpaTV.setText(cgpa.get(position).getGpaX());
        totalTV.setText(cgpa.get(position).getTotal());

        return convertView;
    }
}

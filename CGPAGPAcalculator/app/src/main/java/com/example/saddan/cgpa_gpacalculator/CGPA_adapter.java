package com.example.saddan.cgpa_gpacalculator;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CGPA_adapter extends ArrayAdapter
{
    private Context context;
    private ArrayList<CGPA_model_Class> cgpa;

    public CGPA_adapter(@NonNull Context context, ArrayList<CGPA_model_Class> cgpa)
    {
        super(context,R.layout.cgpa_adapter,cgpa);
        this.context=context;
        this.cgpa=cgpa;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.cgpa_adapter,parent,false);


        TextView subjectTV=convertView.findViewById(R.id.SubjectTV);
        TextView creditTV=convertView.findViewById(R.id.creditTV);
        TextView gpaTV=convertView.findViewById(R.id.gpaTV);
        TextView totalTV=convertView.findViewById(R.id.totalTV);


        subjectTV.setText(cgpa.get(position).getSubject());
        creditTV.setText(cgpa.get(position).getCreditX());
        gpaTV.setText(cgpa.get(position).getTotal());

        return convertView;
    }
}

package com.example.saddan.cgopacalculatortest;

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
import java.util.zip.Inflater;

public class CGPA_Adapter extends ArrayAdapter<CGPA>
{
    private Context context;
    private ArrayList<CGPA> cgpas;
    public CGPA_Adapter(@NonNull Context context, ArrayList<CGPA> cgpas)
    {
        super(context,R.layout.activity_cgpa__adapter,cgpas);
        this.context=context;
        this.cgpas=cgpas;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.activity_cgpa__adapter,parent,false);

        TextView subjectTV=convertView.findViewById(R.id.subjectTV);
        TextView creditTV=convertView.findViewById(R.id.creditTV);
        TextView gpaTV=convertView.findViewById(R.id.gpaTV);
        TextView totalTV=convertView.findViewById(R.id.totalTV);

        subjectTV.setText(cgpas.get(position).getSubject());
        creditTV.setText(cgpas.get(position).getCredit());
        gpaTV.setText(cgpas.get(position).getGpa().toString());
        totalTV.setText(cgpas.get(position).getTotal().toString());

        return convertView;
    }
}

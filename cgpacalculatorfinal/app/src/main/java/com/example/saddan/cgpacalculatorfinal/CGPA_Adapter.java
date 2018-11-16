package com.example.saddan.cgpacalculatorfinal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CGPA_Adapter extends ArrayAdapter<CGPA>
{
    private Context context;
    private ArrayList<CGPA> cgpas;

    public CGPA_Adapter(@NonNull Context context, ArrayList<CGPA> cgpas)
    {
        super(context,R.layout.subject_credit_gpa_total_adapter,cgpas);
        this.context=context;
        this.cgpas=cgpas;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.subject_credit_gpa_total_adapter,parent,false);

        TextView subjectTV=convertView.findViewById(R.id.subjectTV);
        TextView creditTV=convertView.findViewById(R.id.creditTV);
        TextView gpaTV=convertView.findViewById(R.id.gpaTV);
        TextView totalTV=convertView.findViewById(R.id.totalTV);

        subjectTV.setText(cgpas.get(position).getSubject());
        creditTV.setText(cgpas.get(position).getCredit());
        gpaTV.setText(cgpas.get(position).getGpa().toString());
        totalTV.setText(cgpas.get(position).getSubject().toString());

        return convertView;
    }
}

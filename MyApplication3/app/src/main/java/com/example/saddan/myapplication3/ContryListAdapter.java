package com.example.saddan.myapplication3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ContryListAdapter extends ArrayAdapter
{
     private Context context;
    private String countryList[];
    private int flagList[];

    public ContryListAdapter(@NonNull Context context, String[] countryList,int flagList[])
    {
        super(context, R.layout.country,countryList);
        this.context=context;
        this.countryList=countryList;
        this.flagList=flagList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.country, parent, false);

        TextView countryTV=convertView.findViewById(R.id.countryNameTV);
        ImageView flagIV=convertView.findViewById(R.id.flagIV);

        flagIV.setImageResource(flagList[position]);
        countryTV.setText(countryList[position]);

        return convertView;
    }
}

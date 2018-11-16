package com.example.saddan.studentdatashowwithlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class studentListAdapter extends ArrayAdapter<Student>
{
    private Context context;
    private ArrayList<Student> studentList;
    public studentListAdapter(@NonNull Context context, ArrayList<Student> studentList)
    {
        super(context, R.layout.activity_student_list,studentList);
        this.context=context;
        this.studentList=studentList;
    }
}

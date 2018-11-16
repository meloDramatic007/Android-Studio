package com.example.saddan.studentdatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class List_View_Item_Details extends AppCompatActivity
{
    TextView list_view_item_nameTV,list_view_item_emailTV,list_view_item_phoneTV,list_view_item_addressTV,
            list_view_item_genderTV,list_view_item_skillsTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__view__item__details);


        list_view_item_nameTV=findViewById(R.id.list_view_item_nameTV);
        list_view_item_emailTV=findViewById(R.id.list_view_item_emailTV);
        list_view_item_phoneTV=findViewById(R.id.list_view_item_phoneTV);
        list_view_item_addressTV=findViewById(R.id.list_view_item_addressTV);
        list_view_item_genderTV=findViewById(R.id.list_view_item_genderTV);
        list_view_item_skillsTV=findViewById(R.id.list_view_item_skilsTV);

        Intent intent=getIntent();

        Student_details student= (Student_details) intent.getSerializableExtra("student");
        String name=student.getName();
        String email=student.getEmail();
        String phone=student.getPhone();
        String address=student.getAddress();
        String gender=student.getGender();
        String skills=student.getSkills();

        list_view_item_nameTV.setText(name);
        list_view_item_emailTV.setText(email);
        list_view_item_phoneTV.setText(phone);
        list_view_item_addressTV.setText(address);
        list_view_item_genderTV.setText(gender);
        list_view_item_skillsTV.setText(skills);


    }
}

package com.example.saddan.user_info;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity
{   EditText name,email,phone,address;
   RadioGroup radioGroup;
   RadioButton male,female,others,Radiobutton;
   Spinner divisionSP;
   String division;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name_id);
        email=findViewById(R.id.email_id);
        phone=findViewById(R.id.phone_id);
        address=findViewById(R.id.address_id);
        radioGroup=findViewById(R.id.RadialGroup);
        male=findViewById(R.id.ra_button_male);
        female=findViewById(R.id.ra_button_female);
        others=findViewById(R.id.ra_button_other);
        divisionSP=findViewById(R.id.spinner_id) ;
        String divisions[] ={"Dhaka","Chittagong","Barishal","Sylhet"};

        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,divisions);
        divisionSP.setAdapter(adapter);


        divisionSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                division=(String) adapterView.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            {

            }
        });

    }

    public void get_register(View view)
    {
        String Name=name.getText().toString();
        String Email=email.getText().toString();
        String Phone=phone.getText().toString();
        String Address=address.getText().toString();

        String Gender;

        if (male.isChecked())
        {
            Gender=male.getText().toString();
        }
        else if(female.isChecked())
        {
            Gender=female.getText().toString();
        }
        else
        {
            Gender=others.getText().toString();
        }
        Intent intent=new Intent(this,view_info.class);

        intent.putExtra("name",Name);
        intent.putExtra("email",Email);
        intent.putExtra("phone",Phone);
        intent.putExtra("address",Address);
        intent.putExtra("gender",Gender);
        intent.putExtra("division",division);
        startActivity(intent);


    }
}

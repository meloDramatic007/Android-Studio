package com.example.saddan.random_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Pallindrome extends AppCompatActivity
{
    EditText number;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pallindrome);
        number=findViewById(R.id.number);
        result=findViewById(R.id.result);
    }

    public void find_pallindrome(View view)
    {
        int Number=Integer.parseInt(number.getText().toString());



            int p,i=0,t=0,x=0;
        int dipo [];
        int fifo [];
        dipo=new int[20];
        fifo=new int [20];

            while(Number!=0)
            {
                p=Number%10;
                if(p>0)
                {
                    dipo[i]=p;

                }
                Number=Number/10;

                i++;
            }



            for( int j=i-1;j>=0;j--)
            {
                fifo[x]=dipo[j]   ;

                x++;
            }

            for(int q=0;q<i;q++)
            {

                if(dipo[q]==fifo[q])
                {
                    t++;
                }

            }

            if(t==i)
            {
                result.setText("This is pallindrome number");

            }
            else
            {
                result.setText("This is pallindrome not number");
            }

    }
}

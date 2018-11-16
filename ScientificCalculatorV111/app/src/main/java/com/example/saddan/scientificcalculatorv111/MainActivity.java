package com.example.saddan.scientificcalculatorv111;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity
{
    TextView calculation,answer;
    String sCalculation="",sAnswer="",number_one="",current_operator="";
    double Result=0.0,numberOne=0.0,temp=0.0;
    boolean operator_allow=true,delete_allow=true;

    NumberFormat format;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculation=findViewById(R.id.calculation);
        calculation.setMovementMethod(new ScrollingMovementMethod());
        answer=findViewById(R.id.answer);

        format=new DecimalFormat("#.#######");

    }

    public void updateCalculation()
    {
        calculation.setText(sCalculation);
        answer.setText(sAnswer);
    }
    public void onNumberClik(View view)
    {
        Button number=(Button) view;
        sCalculation+=number.getText();
        number_one+=number.getText().toString();
        numberOne=Double.parseDouble(number_one);
        switch (current_operator)
        {
            case "":
                temp=Result+numberOne;
                sAnswer=format.format(temp);
                break;
            case "+":
                temp=Result+numberOne;
                sAnswer=format.format(temp);
                break;
            case "-":
                temp=Result-numberOne;
                sAnswer=format.format(temp);
                break;
            case "x":
                temp=Result*numberOne;
                sAnswer=format.format(temp);
                break;
            case "/":
                try{
                temp=Result/numberOne;
                sAnswer=format.format(temp);}
                catch (Exception e)
                {
                    sAnswer=e.getMessage();
                }
                break;


        }
        operator_allow=true;
        updateCalculation();
    }

    public void onOperatorClik(View view)
    {
        Button operator=(Button) view;
        if(operator_allow) {
            if (sAnswer == "") {
                sCalculation = "0";
                sCalculation += operator.getText();
                current_operator = operator.getText().toString();


            } else if (sAnswer != "") {
                sCalculation += operator.getText();
                current_operator = operator.getText().toString();
            }
            operator_allow=false;
        }
        updateCalculation();
        number_one="";
        numberOne=0.0;
        Result=temp;
        temp=0.0;
    }

    public void onClearClik(View view)
    {
         sCalculation="";
         sAnswer="";
         number_one="";
         current_operator="";
         Result=0.0;
         numberOne=0.0;
         temp=0.0;
         operator_allow=true;
         delete_allow=true;
         updateCalculation();
    }

    public void onDeleteClick(View view)
    {
        if(delete_allow && sCalculation.length()>0)
        {




            sCalculation = sCalculation.substring(0, sCalculation.length() - 1);

            if(sCalculation.length()==0)
             {
                 delete_allow=false;
             }

             char c=getcharFromLast(sCalculation,1);
            Toast.makeText(this, c+"", Toast.LENGTH_SHORT).show();

             if(c!='+' || c!='-' || c!='x' || c!='/')
             {

                 Pattern regex=Pattern.compile("(\\d+(?:\\.\\d+)?)+$");
                 Matcher matcher=regex.matcher(sCalculation);
                 if(matcher.find())
                 {
                     numberOne=Double.parseDouble(matcher.group());
                     //Toast.makeText(this, numberOne+"", Toast.LENGTH_SHORT).show();
                 }

             }

            switch (current_operator)
            {
                case "":
                    temp=Result+numberOne;
                    sAnswer=format.format(temp);
                    break;
                case "+":
                    temp=Result+numberOne;
                    sAnswer=format.format(temp);
                    break;
                case "-":
                    temp=Result-numberOne;
                    sAnswer=format.format(temp);
                    break;
                case "x":
                    temp=Result*numberOne;
                    sAnswer=format.format(temp);
                    break;
                case "/":
                    try{
                        temp=Result/numberOne;
                        sAnswer=format.format(temp);}
                    catch (Exception e)
                    {
                        sAnswer=e.getMessage();
                    }
                    break;


            }



            updateCalculation();
        }
    }

    private char getcharFromLast(String s, int i)
    {
        char c=s.charAt(s.length()-i);
        return c;
    }
}

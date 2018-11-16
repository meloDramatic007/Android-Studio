package com.example.saddan.scientificcalculator2;

import android.graphics.Typeface;
import android.provider.DocumentsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity
{
    TextView calculation,answer;

    String sCalculation="0",sAnswer="",previous_ans;
    String number_one="",number_two="",current_operator="",doubleOperator="";
    Double Result=  0.0,numberOne=0.0,numberTwo=0.0,temp=0.0;
    NumberFormat format,longFormat;//answer format
    boolean dot_present,number_allow=true,operator_allow=true,root_allow=true,modulas_present=false;
    boolean root_present=false,power_allow=true,power_present=false,operator_present=false;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculation=findViewById(R.id.calculation);
        calculation.setMovementMethod(new ScrollingMovementMethod());// it helps to interect scrool view with user
        answer=findViewById(R.id.answer);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/digital-7.ttf");
        calculation.setTypeface(font);
        answer.setTypeface(font);
        format=new DecimalFormat("#.######");//set answer format upto four decimel
        longFormat=new DecimalFormat("0.######E0");


    }

    public void onNumberClik(View view)
    {

        if(number_allow && !modulas_present)
        {
            Button button = (Button) view;
            sCalculation += button.getText();
            number_one += button.getText();
            doubleOperator = "";
            numberOne = Double.parseDouble(number_one);
            if(!root_allow )
            {

                 double numberOne_1=Math.sqrt(numberOne);
                numberTwo*=numberOne_1;
                numberOne=numberTwo;
            }

             if(!power_allow)
            {
                numberOne=Math.pow(numberTwo,numberOne);

            }
            switch (current_operator)
            {
                case "":

                    temp = Result + numberOne;

                    sAnswer = format.format(temp).toString();



                    break;
                case "+":
                    temp = Result + numberOne;

                    sAnswer = format.format(temp).toString();




                    break;
                case "-":
                    temp = Result - numberOne;

                    sAnswer = format.format(temp).toString();


                    break;
                case "x":
                    temp = Result * numberOne;
                    sAnswer = format.format(temp).toString();


                    break;
                case "/":
                    try {
                        temp = Result / numberOne;
                        sAnswer = format.format(temp).toString();

                    } catch (Exception e) {
                        sAnswer = e.getMessage();
                    }

                    break;


            }
            root_present=false;
            power_present=false;
            operator_present=false;

            updateCalculation();

        }
    }


    public void onOperatorClik(View view)
    {




              Button opButton=(Button) view;
              if(operator_allow)
              {
                  root_allow=true;
                  modulas_present=false;
                  power_allow=true;

                  operator_present=true;
                  number_allow=true;


                  if(sAnswer=="")

                  {


                      if (root_present) {
                           sCalculation = sCalculation.substring(0, sCalculation.length() - 1);
                           root_present = false;
                       } else if (power_present) {

                           sCalculation = sCalculation.substring(0, sCalculation.length() - 1);
                           power_present = false;
                       }


                      /*else if(factorial_present)
                      {
                          sCalculation = sCalculation.substring(0, sCalculation.length() - 1);
                          factorial_present=false;
                      }*/

                      sCalculation = sCalculation+opButton.getText().toString();
                      number_one = "";
                      number_two="";
                      Result = temp;
                      current_operator = opButton.getText().toString();
                      sAnswer = format.format(Result).toString();
                      updateCalculation();
                      dot_present = false;

                  }


                  else if (sAnswer != "")
                  {



                      if (current_operator != "")
                      {

                          char c = getcharFromLast(sCalculation, 2);

                          if (c == '+' || c == '-' || c == 'x' || c == '/'  )
                          {
                              sCalculation = sCalculation.substring(0, sCalculation.length() - 1);

                          }
                          else if(root_present)
                          {
                              sCalculation = sCalculation.substring(0, sCalculation.length() - 3);
                              root_present=false;
                          }
                          else if(power_present)
                          {

                              sCalculation = sCalculation.substring(0, sCalculation.length() - 1);
                              power_present=false;
                          }

                      }


                      sCalculation = sCalculation+opButton.getText() + " ";
                      number_one = "";
                      number_two="";

                      Result = temp;

                      current_operator = opButton.getText().toString();
                      sAnswer = format.format(Result).toString();

                      updateCalculation();

                      dot_present = false;

                  }




              }

    }

    private char getcharFromLast(String s, int i)
    {
        char c=s.charAt(s.length()-i);
        return c;
    }

    public void onClearClik(View view)
    {
        sCalculation="";
        sAnswer="";
        current_operator="";
        number_one="";
        numberOne=0.0;
        number_two="";
        numberTwo=0.0;
        doubleOperator="";
        Result=0.0;
        temp=0.0;
        updateCalculation();
        dot_present=false;
        number_allow=true;
        operator_allow=true;
        root_allow=true;
        modulas_present=false;
        root_present=false;
        power_allow=true;
        root_present=false;
        power_present=false;
        operator_present=false;
        }


    public void updateCalculation()
    {
        calculation.setText(sCalculation);
        answer.setText(sAnswer);
    }

    public void dotClik(View view)
    {
        if(!dot_present)
        {
            if(current_operator==" " &&number_one.length()==0)
            {
                number_one="0.";
                sCalculation="0.";
                //sAnswer="0.";
                dot_present=true;
                updateCalculation();
            }

            else
            {
                number_one+=".";
                sCalculation+=".";
                //sAnswer+=".";
                dot_present=true;
                updateCalculation();
            }
        }
    }

    public void equalClick(View view)
    {
        if(sAnswer!="" && sAnswer!=previous_ans)
        {
            sCalculation+="\n"+"............................"+"\n"+"Ans= "+sAnswer+"\n";
            number_one="";
            numberOne=0.0;
            Result=temp;
            sAnswer=previous_ans;
            updateCalculation();

            dot_present=false;
            number_allow=true;
            operator_allow=true;
        }
    }




    public void onModuleClick(View view)
    {

        if(sAnswer!="" && getcharFromLast(sCalculation,1)!='%')
        {
            sCalculation+="%";
            switch (current_operator)
            {
                case"":
                    temp=temp/100;
                    break;
                case "+":
                    temp=Result+(Result*numberOne)/100;
                    break;
                case"-":
                    temp=Result-(Result*numberOne)/100;
                    break;

                case"x":
                    temp=Result*(Result*numberOne)/100;
                    break;

                case"/":
                    try {
                        temp=Result/(Result*numberOne)/100;
                    }
                    catch (Exception e)
                    {
                        sAnswer=e.getMessage();
                    }
                       break;

            }
            sAnswer=format.format(temp).toString();
            if(sAnswer.length()>9)
            {
                sAnswer=longFormat.format(temp).toString();
            }
            Result=temp;
            modulas_present=true;
            updateCalculation();

        }
    }

    public void onRootClick(View view)
    {
        Button root=(Button) view;

       root_present=true;
       if(root_allow)
       {
           sCalculation+=root.getText().toString();
           number_two=number_one;
           numberTwo=numberOne;
           root_present=true;
           number_one="";
           if(numberTwo==0 && root_present)
           {
               numberTwo=1.0;
           }
           root_allow=false;


           updateCalculation();
       }
    }


    public void onPowerClick(View view)
    {
        Button power=(Button) view;
        if( power_allow)
        {

            if(operator_present)
            {
                sCalculation = sCalculation.substring(0, sCalculation.length() - 2);
                operator_present=false;

            }
            sCalculation+=power.getText().toString();
            number_two=number_one;
            numberTwo=numberOne;

            number_one="";
            power_present=true;
            power_allow=false;
            updateCalculation();
        }
    }

    }


/*C:\Users\ACER\AndroidStudioProjects\ScientificCalculator2\app\build\outputs\apk\debug*/
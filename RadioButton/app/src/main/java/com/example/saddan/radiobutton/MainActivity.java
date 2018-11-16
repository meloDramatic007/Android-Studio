package com.example.saddan.radiobutton;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox java,py, c;
    TextView txt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt=findViewById(R.id.txt);
        btn=findViewById(R.id.btn);
        java=findViewById(R.id.java);
        c=findViewById(R.id.c);
        py=findViewById(R.id.python);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder str= new StringBuilder();

             if(java.isChecked()){
                 String m=java.getText().toString();
                 str.append(m +"is checked");

             }
             if(py.isChecked()){
                 String m=py.getText().toString();
                 str.append(m +"is checked");
             }
             if (c.isChecked()){
                 String m=c.getText().toString();
                 str.append(m +"is checked");
             }
             txt.setText(str);
            }
        });

    }


}

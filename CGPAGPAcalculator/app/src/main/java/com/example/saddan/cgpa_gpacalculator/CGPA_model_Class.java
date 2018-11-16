package com.example.saddan.cgpa_gpacalculator;

import java.io.Serializable;
import java.util.ArrayList;

public class CGPA_model_Class implements Serializable
{
    private String subject,creditX,gpaX,total;
    private static ArrayList<CGPA_model_Class> cgpa =new ArrayList<>();


    public CGPA_model_Class(String subject, String creditX, String gpaX, String total)
    {
        this.subject = subject;
        this.creditX = creditX;
        this.gpaX = gpaX;
        this.total = total;
    }

    public String getSubject() {
        return subject;
    }

    public String getCreditX() {
        return creditX;
    }

    public String getGpaX() {
        return gpaX;
    }

    public String getTotal() {
        return total;
    }

public void addCgpa(CGPA_model_Class cgpa_model_class)
{
    cgpa.add(cgpa_model_class);
}

public static ArrayList<CGPA_model_Class> getCgpa()
{
    return cgpa;
}
}

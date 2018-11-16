package com.example.saddan.cgpa_gpacalculatorv12;

import java.io.Serializable;
import java.util.ArrayList;

public class Grade_Point_Average implements Serializable
{
    private String subject,creditX,gpaX,total;

    private static ArrayList<Grade_Point_Average> cgpa=new ArrayList<>();

    public Grade_Point_Average(String subject,String creditX, String gpaX,String total)
    {
        this.subject=subject;
        this.creditX=creditX;
        this.gpaX=gpaX;
        this.total=total;
        }

    public String getSubject()
    {
        return subject;
    }

    public String getCreditX()
    {
        return creditX;
    }

    public String getGpaX()
    {
        return gpaX;
    }
    public String  getTotal(){return total;}

    public void addCgpa(Grade_Point_Average grade_point_average)
    {
           cgpa.add(grade_point_average);
    }
    public static ArrayList<Grade_Point_Average> getCgpa()
    {
        return cgpa;
    }
}

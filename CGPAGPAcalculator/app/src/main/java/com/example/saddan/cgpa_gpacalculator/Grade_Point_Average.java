package com.example.saddan.cgpa_gpacalculator;

import java.io.Serializable;
import java.util.ArrayList;

public class Grade_Point_Average implements Serializable
{

    private String subject,grade;
    private Double gradePoint;
    private static ArrayList<Grade_Point_Average> gpa=new ArrayList<>();

    public Grade_Point_Average(String subject, String grade, Double gradePoint)
    {
        this.subject=subject;
        this.grade=grade;
        this.gradePoint=gradePoint;
    }

    public String getSubject()
    {
        return subject;
    }

    public String getGrade()
    {
        return grade;
    }

    public Double getGradePoint()
    {
        return gradePoint;
    }

    public void addGpa(Grade_Point_Average grade_point_average)
    {
        gpa.add(grade_point_average);
    }
    public static ArrayList<Grade_Point_Average> getGpa()
    {
        return gpa;
    }
}

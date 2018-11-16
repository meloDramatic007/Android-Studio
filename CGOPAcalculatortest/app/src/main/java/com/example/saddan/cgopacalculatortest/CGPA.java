package com.example.saddan.cgopacalculatortest;

import java.io.Serializable;
import java.util.ArrayList;

public class CGPA implements Serializable
{
    private String subject;
    private int credit;
    private Double gpa;
   private Double total;
private static ArrayList<CGPA> cgpas=new ArrayList<>();
    public CGPA(String subject, int credit, Double gpa,Double total) {
        this.subject = subject;
        this.credit = credit;
        this.gpa = gpa;
        this.total = total;
    }

    public String getSubject() {
        return subject;
    }

    public int getCredit() {
        return credit;
    }

    public Double getGpa() {
        return gpa;
    }

    public Double getTotal() {
        return total;
    }
    public void ADDcgps(CGPA cgpa)
    {
         cgpas.add(cgpa);
    }
    public static ArrayList<CGPA> getCGPA()
    {
        return cgpas;
    }
}

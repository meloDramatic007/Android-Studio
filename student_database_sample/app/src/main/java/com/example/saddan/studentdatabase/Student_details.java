package com.example.saddan.studentdatabase;

import java.io.Serializable;
import java.util.ArrayList;

public class Student_details implements Serializable
{
   private String name,email,phone,address,gender,skills;
   private static ArrayList<Student_details> students=new ArrayList<>();

    public Student_details(String name, String email, String phone, String address, String gender, String skills)
    {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getSkills() {
        return skills;
    }
    public void addStudent(Student_details student)
    {
       students.add(student);
    }
    public static ArrayList<Student_details> getAllStudent()
    {
        return students;
    }
}

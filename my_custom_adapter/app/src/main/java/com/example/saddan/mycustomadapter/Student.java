package com.example.saddan.mycustomadapter;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable
{
    private String Name,Email,Phone,Address;
    private static  ArrayList<Student> students=new ArrayList<>();

    public Student(String name, String email, String phone, String address)
    {
        Name = name;
        Email = email;
        Phone = phone;
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public String getAddress() {
        return Address;
    }
    public void addStudent(Student student)
    {
         students.add(student);
    }
    public static ArrayList<Student> getAllStudent()
    {
      return students;
    }
}

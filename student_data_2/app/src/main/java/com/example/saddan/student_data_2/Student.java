package com.example.saddan.student_data_2;
import java.io.Serializable;

public class Student implements Serializable
{
   private  String name;
   private  String email;
   private String phone;
   private String address;

   public Student(String name,String email,String phone,String address)
   {
       this.name=name;
       this.email=email;
       this.phone=phone;
       this.address=address;
   }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhone()
    {
        return phone;
    }
    public String getAddress()
    {
        return address;
    }
}

package com.example.saddan.full_functional_database;

public class Student
{
  private String name,email,phone,adress;
  int id;

    public Student(String name, String email, String phone, String adress, int id) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
        this.id = id;
    }

    public Student(String name, String email, String phone, String adress) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public int getId() {
        return id;
    }
}

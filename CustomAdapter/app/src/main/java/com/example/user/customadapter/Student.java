package com.example.user.customadapter;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private String name, email, phone, address, department;

    private static ArrayList<Student> studentList = new ArrayList<Student>();

    public Student(String name, String email, String phone, String address, String department) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.department = department;
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

    public String getDepartment() {
        return department;
    }

    public static void addStudent(Student student){
        studentList.add(student);
    }

    public static ArrayList<Student> getAllStudent(){
        return studentList;
    }
}

package com.example.user.studentmanagement;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private String name, phone, email, dob, division, gender;

    ArrayList<String> skillList = new ArrayList<String>();

    private static ArrayList<Student> studentList = new ArrayList<Student>();


    public Student(String name, String phone, String email, String dob, String division, String gender, ArrayList<String> skillList) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.dob = dob;
        this.division = division;
        this.gender = gender;
        this.skillList = skillList;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getDob() {
        return dob;
    }

    public String getDivision() {
        return division;
    }

    public String getGender() {
        return gender;
    }

    public ArrayList<String> getSkillList() {
        return skillList;
    }

    public static void addStudentIntheList(Student student){
        studentList.add(student);
    }

    public static ArrayList<Student> getStudentList() {
        return studentList;
    }
}

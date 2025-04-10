package com.myproject.java_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    private String name;
    private int age;
    private String gender;
    private StudentAddress address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public StudentAddress getAddress() {
        return address;
    }

    @Autowired
    @Qualifier("studentAddress1")
    public void setAddress(StudentAddress address) {
        this.address = address;
    }

    public void getStudentDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Address: " + address.getStudentAddress());
    }
}

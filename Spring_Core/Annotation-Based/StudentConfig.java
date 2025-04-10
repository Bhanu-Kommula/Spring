package com.myproject.java_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StudentConfig {
    @Bean(name = "studentInfo")
    @Scope(value = "prototype")
    public Student student() {
        Student student = new Student();
        student.setName("BhanuPrasad");
        student.setAge(22);
        student.setGender("Male");
    return student;
    }

    @Bean
    public StudentAddress studentAddress() {
        return new StudentAddress("Dallas", "TX");

    }


    @Bean
    public StudentAddress studentAddress1() {
        return new StudentAddress("Palno", "TX");

    }
}

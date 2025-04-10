package com.myproject.java_spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemos {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
Student student = (Student) context.getBean("studentInfo");
System.out.println(student.getName());
        System.out.println(student.getAddress().getCity());

        System.out.println( "   ----------------- \n");

student.getStudentDetails();

Student student2 = (Student) context.getBean("studentInfo");
        System.out.println( "   ----------------- \n");


        System.out.println("First bean" + student);
        System.out.println("Second bean" + student2);

    }
}

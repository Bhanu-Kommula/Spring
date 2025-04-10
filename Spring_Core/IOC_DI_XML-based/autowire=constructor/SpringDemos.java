package com.myproject.java_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemos {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");
        Employee employee = (Employee) context.getBean("emp");
        System.out.println(employee.getName());
        System.out.println(employee.getAddress().getCity());
        System.out.println("Car Model is " + employee.getVehicle().getModel());
        System.out.println("    ----------------- \n");

employee.getEmployeeDetails();
    }
}

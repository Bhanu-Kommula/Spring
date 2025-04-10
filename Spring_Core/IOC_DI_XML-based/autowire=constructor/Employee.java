package com.myproject.java_spring;

public class Employee {
    private int id;
    private String name;
    private int age;
    private Address address;
    private EmployeeSalary salary;
    private Vehicle vehicle;

    public Employee(int id, String name, int age, Address address, EmployeeSalary salary, Vehicle vehicle) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public EmployeeSalary getSalary() {
        return salary;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee details - ID : " + getId() + "  name : " + getName() + " age : " + getAge() + " address : " + address.getAddress() + " salary : " + salary.getSalary() + " Vehicle :" + vehicle.getCarDetails());
    }
}

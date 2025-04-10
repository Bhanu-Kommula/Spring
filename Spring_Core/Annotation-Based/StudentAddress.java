package com.myproject.java_spring;

public class StudentAddress {
    private String city;
    private String state;

    public StudentAddress(String city, String state) {
        this.city = city;
       this.state = state;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }

    public String getStudentAddress(){
        return ("Student Address " + city + " " + state  );
    }
}

package com.example.employee_crud.model;

public class EmployeeCUD {

    private int id;
    private String name;
    private float salary;
    private int age;
    private String state;
    private String country;
    private int zipcode;
    private String profile_image;

    public EmployeeCUD(String name, float salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }
}

package com.example.employee_crud.model;

public class Employee {

    private int id;
    private String employee_name;
    private float employee_salary;
    private int employee_age;
    private String employee_state;
    private String employee_country;
    private int employee_zipcode;
    private String profile_image;

    public Employee(int id, String employee_name, float employee_salary, int employee_age, String employee_state, String employee_country, int employee_zipcode, String profile_image) {
        this.id = id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.employee_age = employee_age;
        this.employee_state = employee_state;
        this.employee_country = employee_country;
        this.employee_zipcode = employee_zipcode;
        this.profile_image = profile_image;
    }

    public Employee(int id, String employee_name, float employee_salary, int employee_age, String employee_state, String employee_country, int employee_zipcode) {
        this.id = id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.employee_age = employee_age;
        this.employee_state = employee_state;
        this.employee_country = employee_country;
        this.employee_zipcode = employee_zipcode;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployee_name() { return employee_name; }

    public void setEmployee_name(String employee_name) { this.employee_name = employee_name; }

    public float getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(float employee_salary) { this.employee_salary = employee_salary; }

    public int getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }

    public String getEmployee_state() { return employee_state; }

    public void setEmployee_state(String employee_state) {
        this.employee_state = employee_state;
    }

    public String getEmployee_country() { return employee_country; }

    public void setEmployee_country(String employee_country) { this.employee_country = employee_country; }

    public int getEmployee_zipcode() {
        return employee_zipcode;
    }

    public void setEmployee_zipcode(int employee_zipcode) {
        this.employee_zipcode = employee_zipcode;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }
}

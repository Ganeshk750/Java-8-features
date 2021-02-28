package com.java8;

/*
 * @created: 30/01/2021 - 5:07 PM
 * @author: Ganesh
 */


import java.util.List;

public class EmployeeEntity {
    private int id;
    private String name;
    private String email;
    private String grade;
    private double salary;
    private List<String> phoneNumbers;

    public EmployeeEntity(){ }

    public EmployeeEntity(int id, String name, String email, String grade, double salary, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.grade = grade;
        this.salary = salary;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}

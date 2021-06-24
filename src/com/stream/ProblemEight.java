package com.stream;


import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @created: 24/06/2021 - 9:40 AM
 * @author: Ganesh
 */


public class ProblemEight {

    public static void main(String[] args) {

        //Problem 8:- Get the details of youngest male employee in the product development?.
        List<Employee> employeeList = TestEmployeeDb.getAllEmployees();
        Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper =  employeeList.stream()
                    .filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
                    .min(Comparator.comparingInt(Employee::getAge));
        Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();
        System.out.println("==============================");
        System.out.println("ID: "+ youngestMaleEmployeeInProductDevelopment.getId());
        System.out.println("Name: "+ youngestMaleEmployeeInProductDevelopment.getName());
    }
}

package com.stream;


import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @created: 21/06/2021 - 2:39 PM
 * @author: Ganesh
 */


public class ThirdProblem {

    public static void main(String[] args) {

        // Problem 3 : What is the average age of Male and Female Employee?

        List<Employee> employeeList = TestEmployeeDb.getAllEmployees();
        Map<String,Double> avgAgeOfMaleAndFemale = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAgeOfMaleAndFemale);
    }
}

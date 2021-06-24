package com.stream;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @created: 24/06/2021 - 10:07 AM
 * @author: Ganesh
 */


public class ProblemEleven {

    public static void main(String[] args) {

        // Problem 11 :- What is the average salary of male and female employees ?
        List<Employee> employeeList = TestEmployeeDb.getAllEmployees();
        Map<String, Double> avgSalaryOfMaleAndFemale = employeeList.stream()
                      .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryOfMaleAndFemale);
    }
}

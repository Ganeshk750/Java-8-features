package com.stream;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @created: 21/06/2021 - 2:14 PM
 * @author: Ganesh
 */


public class ProblemFirst {

    public static void main(String[] args) {

        // Problem:- How Many Male And Female Employees are There in the Organization?

        List<Employee> testEmployee = TestEmployeeDb.getAllEmployees();
        Map<String, Long> numberOfMaleAndFemale = testEmployee.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(numberOfMaleAndFemale);

        // OutPut:- {Male=13, Female=7}
    }
}

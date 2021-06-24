package com.stream;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @created: 24/06/2021 - 9:56 AM
 * @author: Ganesh
 */


public class ProblemTen {

    public static void main(String[] args) {

        // Problem 10:- How Many male and female employees are there in the sales and marketing Department?
        List<Employee> employeeList = TestEmployeeDb.getAllEmployees();
        Map<String, Long> maleAndFemale = employeeList.stream()
                            .filter(e -> e.getDepartment() == "Sales And Marketing")
                            .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(maleAndFemale);
    }
}

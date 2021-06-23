package com.stream;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @created: 21/06/2021 - 2:49 PM
 * @author: Ganesh
 */


public class ProblemFour {

    public static void main(String[] args) {

        // Problem 4 :- Get The Details Of The Highest Paid Employee In The Organization?

        List<Employee> employeeList = TestEmployeeDb.getAllEmployees();
        Optional<Employee> maxEmpSal = employeeList.stream()
                                       .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(maxEmpSal.get().getSalary() +" | "+"Name: "+ maxEmpSal.get().getName());
    }
}

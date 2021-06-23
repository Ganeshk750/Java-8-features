package com.stream;


import java.util.List;

/**
 * @created: 23/06/2021 - 4:46 PM
 * @author: Ganesh
 */


public class ProblemFive {

    public static void main(String[] args) {

        // Problem 5 :- Get the name of all employees who have joined after 2015?

        List<Employee> employeeList = TestEmployeeDb.getAllEmployees();
        employeeList.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}

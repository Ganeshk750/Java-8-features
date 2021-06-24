package com.stream;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @created: 24/06/2021 - 9:49 AM
 * @author: Ganesh
 */


public class ProblemNine {

    public static void main(String[] args) {

        // Problem 9:- Who has the most working experience in the organization ?.
        List<Employee> employeeList = TestEmployeeDb.getAllEmployees();
        Optional<Employee> employeeWrapper = employeeList.stream()
                              .sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        Employee mostWorkingEmployee = employeeWrapper.get();
        System.out.println("===================");
        System.out.println("ID: "+ mostWorkingEmployee.getId());
        System.out.println("Name: "+ mostWorkingEmployee.getName());
    }
}

package com.stream;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @created: 24/06/2021 - 12:22 PM
 * @author: Ganesh
 */


public class ProblemFifteen {

    public static void main(String[] args) {

        // Problem 15:- Who is the oldest employee in the organization? what is the age and which
        // department he belongs to?
        List<Employee> employeeList = TestEmployeeDb.getAllEmployees();
        Optional<Employee> oldestEmployeeWrapper = employeeList.stream()
                .max(Comparator.comparingInt(Employee::getAge));
        Employee oldestEmployee = oldestEmployeeWrapper.get();
        System.out.println("Age: "+ oldestEmployee.getAge());
        System.out.println("Department: "+ oldestEmployee.getDepartment());
    }
}

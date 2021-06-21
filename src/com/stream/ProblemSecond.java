package com.stream;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @created: 21/06/2021 - 2:28 PM
 * @author: Ganesh
 */


public class ProblemSecond {

    public static void main(String[] args) {

        // Problem 2 :- Print The Name Of All Departments In The Organization?
        List<Employee> testEmployeeList = TestEmployeeDb.getAllEmployees();
        Set<String> listOfDepartMent = testEmployeeList.stream().map(e -> e.getDepartment()).collect(Collectors.toSet());
        listOfDepartMent.forEach(System.out::println);

        // 2nd Method
        System.out.println("=====Second Method=====");
        testEmployeeList.stream().map(e -> e.getDepartment()).distinct().forEach(System.out::println);
    }
}

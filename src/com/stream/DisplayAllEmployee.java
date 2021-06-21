package com.stream;


import java.util.List;

/**
 * @created: 21/06/2021 - 2:05 PM
 * @author: Ganesh
 */


public class DisplayAllEmployee {

    public static void main(String[] args) {
        List<Employee> testEmployee = TestEmployeeDb.getAllEmployees();
        System.out.println(testEmployee);
    }

}

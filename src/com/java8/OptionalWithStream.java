package com.java8;

/*
 * @created: 30/01/2021 - 7:38 PM
 * @author: Ganesh
 */


import java.util.List;

public class OptionalWithStream {


    public static EmployeeEntity getEmployeeById(String email) throws Exception {
        List<EmployeeEntity> testEmployee =  TempDb.getAllEmployees();
        return testEmployee.stream()
                .filter(employee -> employee.getEmail().equals(email))
                .findAny().orElseThrow(() -> new Exception("No Employee present with this email"));
    }

    public static void main(String[] args) throws Exception {
       getEmployeeById("abc");
    }
}

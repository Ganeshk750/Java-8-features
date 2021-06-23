package com.stream;


import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @created: 23/06/2021 - 4:53 PM
 * @author: Ganesh
 */


public class ProblemSix {

    public static void main(String[] args) {

        //Problem 6:- Count The Number Of Employees in each department?
        List<Employee> employeeList = TestEmployeeDb.getAllEmployees();
        Map<String, Long> numberOfEmployeeInDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(numberOfEmployeeInDept);
        System.out.println("=========================");
        Set<Map.Entry<String, Long>> entrySet = numberOfEmployeeInDept.entrySet();
        for (Map.Entry<String, Long> entry: entrySet){
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }
    }
}

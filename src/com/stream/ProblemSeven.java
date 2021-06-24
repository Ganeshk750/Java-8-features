package com.stream;


import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @created: 23/06/2021 - 5:03 PM
 * @author: Ganesh
 */


public class ProblemSeven {

    public static void main(String[] args) {

        // Problem 7:- What is the average salary of each department?
        List<Employee> employeeList = TestEmployeeDb.getAllEmployees();
        Map<String, Double> avgSalOfDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalOfDepartment);
        System.out.println("=======================");
        Set<Map.Entry<String, Double>> entrySet = avgSalOfDepartment.entrySet();
        for(Map.Entry<String, Double> entry: entrySet){
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }
    }
}

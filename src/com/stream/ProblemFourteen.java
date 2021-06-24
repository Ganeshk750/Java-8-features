package com.stream;


import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @created: 24/06/2021 - 12:14 PM
 * @author: Ganesh
 */


public class ProblemFourteen {

    public static void main(String[] args) {

        // Problem 14:- Separate the employees who are younger or equals to 25 years from
        // those employees who are older than 25 years.

        List<Employee> employeeList = TestEmployeeDb.getAllEmployees();
        Map<Boolean, List<Employee>> sepratedEmployeeAge = employeeList.stream()
                           .collect(Collectors.partitioningBy(e -> e.getAge() > 25));
        Set<Map.Entry<Boolean, List<Employee>>> entrySet = sepratedEmployeeAge.entrySet();
        for(Map.Entry<Boolean, List<Employee>> entry: entrySet){
            System.out.println("=========================");
            if(entry.getKey()){
                System.out.println("Employees older then 25 Year: ");
            }else{
                System.out.println("Employee Younger than or equal to 25 years : ");
            }
            System.out.println("==========================");
            List<Employee> list = entry.getValue();
            for(Employee emp : list){
                System.out.println(emp.getName());
            }
        }
    }
}

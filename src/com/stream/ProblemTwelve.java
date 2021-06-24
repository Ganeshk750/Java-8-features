package com.stream;


import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @created: 24/06/2021 - 10:16 AM
 * @author: Ganesh
 */


public class ProblemTwelve {

    public static void main(String[] args) {

        // Problem 12:- List Down the name of all the employees in each department?

        List<Employee> employeeList = TestEmployeeDb.getAllEmployees();
        Map<String, List<Employee>> employeeListByDepartMent = employeeList.stream()
                 .collect(Collectors.groupingBy(Employee::getDepartment));

        Set<Map.Entry<String, List<Employee>>> entrySet = employeeListByDepartMent.entrySet();
        for(Map.Entry<String, List<Employee>> entry: entrySet){
            System.out.println("============================");
            System.out.println("Employees In ##"+ entry.getKey() + " : ");
            System.out.println("============================");
            List<Employee> list = entry.getValue();
            for(Employee emp : list){
                System.out.println(emp.getName());
            }
        }
    }

}

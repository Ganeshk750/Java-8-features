package com.stream;


import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @created: 24/06/2021 - 10:31 AM
 * @author: Ganesh
 */


public class ProblemThirteen {

    public static void main(String[] args) {

        // Problem 13: - What is the average salary and total salary of the whole Organization?
        List<Employee> employeeList = TestEmployeeDb.getAllEmployees();
        DoubleSummaryStatistics doubleSummaryStatistics =  employeeList.stream()
                             .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Salary : "+ doubleSummaryStatistics.getAverage());
        System.out.println("Total Salary : "+ doubleSummaryStatistics.getSum());

    }
}

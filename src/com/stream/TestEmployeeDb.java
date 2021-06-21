package com.stream;


import com.java8.EmployeeEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @created: 21/06/2021 - 1:07 PM
 * @author: Ganesh
 */


public class TestEmployeeDb {

    public static List<Employee> getAllEmployees(){
        return Stream.of(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0),
        new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0),
        new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0),
        new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0),
        new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0),
        new Employee(177, "Manu Sharma", 35, "Male", "Account and Finance", 2016, 27000.0),
        new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 35500.0),
        new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0),
        new Employee(122, "Paul Niksui", 25, "Male", "Salse And Marketing", 2015, 18000.0),
        new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5),
        new Employee(211, "Jasan Kaur", 27, "Female", "Infrastructure", 2014, 15700.0),
        new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0),
        new Employee(233, "Jyoti Reddy", 27, "Female", "Account And Finance", 2013, 21300.0),
        new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.0),
        new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0),
        new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0),
        new Employee(277, "Anuj Chettair", 31, "Male", "Product Development", 2012, 35700.0),
        new Employee(288, "Bhushan Kumar", 28, "Male", "Product Support", 2012, 25000.0),
        new Employee(299, "Shashi Joshi", 32, "Male", "Product Support", 2014, 22000.0),
        new Employee(300, "Meggi Brein", 32, "Female", "HR", 2011, 28000))
                .collect(Collectors.toList());
    }

}

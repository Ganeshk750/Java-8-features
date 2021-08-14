package com.java8;


import java.util.List;
import java.util.stream.Collectors;

/**
 * @created: 14/08/2021 - 5:19 PM
 * @author: Ganesh
 */


public class StreamTest {

    public static void main(String[] args) {

        List<String> collect = StreamTempDb.getAllEmployees().stream()
                .filter(emp -> emp.getSalary() >= 30000)
                .map(StreamEmpEntity::getName)
                .distinct()
                .sorted()
                .skip(0)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}

package com.java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @created: 14/08/2021 - 5:29 PM
 * @author: Ganesh
 */


public class StreamTempDb {

    public static List<StreamEmpEntity> getAllEmployees(){
        return Stream.of(
                new StreamEmpEntity(101, "Ganesh", "A", 32000 ),
                new StreamEmpEntity(102, "Vishal", "B", 25000),
                new StreamEmpEntity(103, "Alock", "C", 18000),
                new StreamEmpEntity(104, "Bhushan", "A", 35000),
                new StreamEmpEntity(105, "Vishal",  "A", 31000))
                .collect(Collectors.toList());

    }

}

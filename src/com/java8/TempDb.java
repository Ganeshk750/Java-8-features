package com.java8;

/*
 * @created: 30/01/2021 - 5:13 PM
 * @author: Ganesh
 */


import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TempDb {

    public static List<EmployeeEntity> getAllEmployees(){
        return Stream.of(
                new EmployeeEntity(101, "Ganesh", "ganesh@gmail.com","A", 30000, Arrays.asList("9999888822","8888555533")),
                new EmployeeEntity(102, "Rohan", "rohan@gmail.com","B", 25000, Arrays.asList("9912348822","8888521433")),
                new EmployeeEntity(103, "Alock", "alock@gmail.com","C", 18000, Arrays.asList("9999881254","8875655533")),
                new EmployeeEntity(104, "Manish", "manish@gmail.com","A", 35000, Arrays.asList("9922558822","8825895533")),
                new EmployeeEntity(105, "Deepak", "deepak@gmail.com", "A", 31000, Arrays.asList("9999888800","8888555140")))
                .collect(Collectors.toList());

    }
}

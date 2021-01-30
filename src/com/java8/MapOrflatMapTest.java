package com.java8;

/*
 * @created: 30/01/2021 - 5:24 PM
 * @author: Ganesh
 */


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOrflatMapTest {

    public static void main(String[] args) {
        System.out.println("======Program start========");
        List<EmployeeEntity> sampleEmployeeData = TempDb.getAllEmployees();

        // Now We are try to use map operator to list all employee "email"
        // Map is used to one-to-one mapping i.e employee have one email
         List<String> listOfEmails = sampleEmployeeData.stream().map((employee) -> employee.getEmail()).collect(Collectors.toList());
        System.out.println(listOfEmails);

        //We can replace lambda to MethodReference
        System.out.println("===========MethodOfReference=============");
        List<String> listOfEmail = sampleEmployeeData.stream().map(EmployeeEntity::getEmail).collect(Collectors.toList());
        System.out.println(listOfEmails);

        // Now we can try to get "mobileNumbers" of employee
        List<List<String>> allPhoneNumbers = sampleEmployeeData.stream().map(EmployeeEntity::getPhoneNumbers).collect(Collectors.toList());
        System.out.println(allPhoneNumbers);

        // Now We are try to use flatMap operator to list employee "mobileNumbers"
        // flatMap is used to one-to-many mapping i.e employee have multiple mobileNumber
        List<String> allPhonNumbers = sampleEmployeeData.stream().flatMap((employee) -> employee.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(allPhonNumbers);


        System.out.println("======Program end========");
    }
}

package com.java8;

/*
 * @created: 30/01/2021 - 7:05 PM
 * @author: Ganesh
 */


import java.util.Arrays;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        EmployeeEntity emp = new EmployeeEntity(101, "Vikash", null, Arrays.asList("9999888822","8888555533"));

        Optional<Object> obj = Optional.empty();
        System.out.println(obj);

        /*Optional<String> optionalEmail = Optional.of(emp.getEmail());
        System.out.println(optionalEmail);*/

       // Optional<String> emailOptional = Optional.ofNullable(emp.getEmail());
       // System.out.println(emailOptional.get());

        Optional<String> emails = Optional.ofNullable(emp.getEmail());
        if(emails.isPresent()){
            System.out.println(emails.get()); //output: nothing
        }
           // System.out.println(emails.orElse("default@gmail.com")); //output: default@gmail.com
       // System.out.println(emails.orElseThrow(() -> new IllegalArgumentException("Email not present")));

        System.out.println(emails.map(String::toUpperCase).orElseGet(() -> "Default Email")); //output: Default Email

    }


}

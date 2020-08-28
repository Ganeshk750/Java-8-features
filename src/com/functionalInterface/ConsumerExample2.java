package com.functionalInterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {

        List<Instructor> instructors = Instructors.getAll();

        //Looping through all the instructor and printing out the value of the instructor

        Consumer<Instructor> c1 = (s1) -> System.out.println(s1);
        instructors.forEach(c1);

        System.out.println("-------------------");
        //Loop through all the instructor and only print out their name

        Consumer<Instructor> c2 = (s1) -> System.out.println(s1.getName());
        instructors.forEach(c2);

        System.out.println("========================");
        //Loop through all the instructor and print their name and their courses
        Consumer<Instructor> c3 = (s1) -> System.out.println(s1.getCourses());
        instructors.forEach(c2.andThen(c3));

        //Loop through all the instructor and print out their name if the years of experience is > 10
        System.out.println("-----------------------");
        instructors.forEach(s1 -> {
            if(s1.yearOfExperience > 10){
                c1.accept(s1);
            }
        });

        // Loop through all the instructor and print out their name and yearOfExperience if year of experience is > 5 and teaches course online
        System.out.println("======================");
        instructors.forEach(s1 ->{
            if(s1.yearOfExperience > 5 && !s1.isOnlineCourses()){
                c1.andThen(c2).accept(s1);
            }
        });

    }
}

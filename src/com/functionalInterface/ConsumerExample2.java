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
    }
}

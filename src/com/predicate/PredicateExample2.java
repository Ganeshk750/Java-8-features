package com.predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        //All Instructor who teaches online
        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses() == true;
        //Instructor experience is > years
        Predicate<Instructor> p2 = (i) -> i.getYearOfExperience() > 10;
        List<Instructor> instructors = Instructors.getAll();
        instructors.forEach(instructor -> {
            if(p1.test(instructor)){
                System.out.println(instructor);
            }
        });

        System.out.println("--------------------");

        //If Instructor teaches online and experience > 10
        instructors.forEach(instructor -> {
            if(p1.and(p2).test(instructor)){
                System.out.println(instructor);
            }
        });

    }
}


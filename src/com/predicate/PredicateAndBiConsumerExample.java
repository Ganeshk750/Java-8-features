package com.predicate;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExample {

    public static void main(String[] args) {

        List<Instructor> instructors = Instructors.getAll();

        //All Instructor who teaches online
        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses() == true;

        //Instructor experience is > 10
        Predicate<Instructor> p2 = (i) -> i.getYearOfExperience() > 10;

        //BiConsumer print name and courses
        BiConsumer<String, List<String>> biConsumer = (name, courses) ->
                System.out.println("Name is: "+ name + " Cources: "+ courses);

        instructors.forEach(instructor -> {
            if(p1.and(p2).test(instructor))
                biConsumer.accept(instructor.getName(), instructor.getCourses());
        });

    }
}

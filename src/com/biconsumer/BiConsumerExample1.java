package com.biconsumer;

import com.functionalInterface.Instructor;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample1 {
    public static void main(String[] args) {

        List<Instructor> instructors = Instructors.getAll();

        //print out name and gender of instructor
        BiConsumer<String, String> biConsumer = (name, gender) -> System.out.println("Name is: "+ name + " and gender is: "+ gender);
        instructors.forEach(instructor ->
                biConsumer.accept(instructor.getName(), instructor.getGender()));

        System.out.println("---------------------------");
        //print out name and list of courses
        BiConsumer<String, List<String>> biConsumer1 = (name, courses) -> System.out.println("Name is: "+ name + "courses: "+ courses);
        instructors.forEach(instructor -> {
            biConsumer1.accept(instructor.getName(), instructor.getCourses());
        });

        System.out.println("----------------------------");
        //print out name and gender of all instructors who teaches online
        instructors.forEach(instructor -> {
            if(instructor.isOnlineCourses()){
                biConsumer.accept(instructor.getName(), instructor.getGender());
            }
        });
    }
}

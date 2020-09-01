package com.predicate;

import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll() {
        Instructor instructor1 = new Instructor("Mike", 10, "Software Developer", "Male",
                true, Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));
        Instructor instructor2 = new Instructor("Jenny", 5, "Engineer", "Female",
                false, Arrays.asList("Multi.Threaded Programming", "CI/CD", "Unit Testing"));
        Instructor instructo3 = new Instructor("Gane", 6, "Manager", "Male",
                false, Arrays.asList("C Programming", "C++ Programming", "React Native"));
        Instructor instructor4 = new Instructor("Anthony", 15, "Senior Developer", "Male",
                true, Arrays.asList("Java Programming", "Angular Programming", "React Native"));
        Instructor instructor5 = new Instructor("syed", 15, "Software Developer", "Male",
                true, Arrays.asList("Java Programming", "Java Multi.Threaded Programming", "React Native"));

        List<Instructor> list = Arrays.asList(instructor1, instructor2, instructo3, instructor4, instructor5);
        return list;
    }
}

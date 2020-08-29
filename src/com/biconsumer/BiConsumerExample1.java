package com.biconsumer;

import com.functionalInterface.Instructor;

import java.util.List;

public class BiConsumerExample1 {
    public static void main(String[] args) {

        List<Instructor> instructors = Instructors.getAll();
        System.out.println(instructors);

    }
}

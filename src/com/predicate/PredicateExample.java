package com.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //If number is  > 10 return other false
        Predicate<Integer> p1 = (i) -> i > 10;
        System.out.println(p1.test(100));
    }
}

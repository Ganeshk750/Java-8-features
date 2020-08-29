package com.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        //Printing two numbers
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println("x: " + x +"y: "+ y);
        biConsumer.accept(10,20);

        //Calculating the sum of two Integer
        BiConsumer<Integer, Integer> biConsumer1 = (x, y) -> System.out.println("x+y: "+ (x+y));
        biConsumer1.accept(50,20);

        //Concatenate Two String
        BiConsumer<String, String> biConsumer2 = (s1, s2) -> System.out.println(s1+s2);
        biConsumer2.accept("Ganesh ", "Kumar");

    }
}

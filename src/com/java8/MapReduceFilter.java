package com.java8;

/*
 * @created: 28/02/2021 - 11:38 AM
 * @author: Ganesh
 */


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceFilter {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,7,8,5,5,9);
        int sum = 0;
        for(int num : numbers){
            sum = sum + num;
        }
        System.out.println("Total : "+ sum);
        System.out.println("---------Using Java 8-------------");
        int sum1 = numbers.stream().mapToInt(value -> value).sum();
        System.out.println("Total : "+ sum1);

        System.out.println("--------USING REDUCE METHOD-------------");
        int reduceSum = numbers.stream().reduce(0,(identity, accumulator) -> identity + accumulator);
        System.out.println("Total: "+ reduceSum);
        System.out.println("--------USING METHOD REFERENCE------");
        Optional<Integer> reduceWithMethodReference = numbers.stream()
                .reduce(Integer::sum);
        System.out.println("Total: "+ reduceWithMethodReference); //Total: Optional[37]
        System.out.println("Total: "+ reduceWithMethodReference.get()); // Total: 37
        System.out.println("--------------MULTIPLICATION RESULT----------");
        Integer multipleResult = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Multiplication Result: "+ multipleResult);
        System.out.println("---------MAX VALUE----------");
        Integer maxValue = numbers.stream().reduce(0,(a, b) -> a > b ? a : b);
        System.out.println("Max Value: "+ maxValue);
        System.out.println("---------USING ()REF-----------");
        Optional<Integer> max1 = numbers.stream().reduce(Integer::max);
        System.out.println("Max Value: "+ max1.get());
    }

}

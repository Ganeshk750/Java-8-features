package com.java8;

/*
 * @created: 28/02/2021 - 11:38 AM
 * @author: Ganesh
 */


import java.util.Arrays;
import java.util.List;

public class MapReduceFilter {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,7,8,5,5,9);
        int sum = 0;
        for(int num : numbers){
            sum = sum + num;
        }
        System.out.println("Total Sum: "+ sum);
    }

}

package com.java_array_level_zero;


import java.util.Arrays;
import java.util.OptionalDouble;

/**
 * @created: 11/09/2021 - 4:24 PM
 * @author: Ganesh
 */

/* Calculate the average of array
*  {1,2,3,4,5,6,7,8,9,10}
* */
public class CalculateAverage {

    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Initial Array: "+ Arrays.toString(arr));
        CalculateAverage.firstMethod(arr);
        System.out.println("=============SECOND METHOD================");
        CalculateAverage.secondMethod(arr);
    }

    public static void secondMethod(int[] arr) {
        OptionalDouble average = Arrays.stream(arr).average();
        System.out.println("Average: "+ average.getAsDouble());
    }

    public static void firstMethod(int[] arr) {
        int sum = 0 , last = arr[arr.length - 1];
        double average = 0.0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        average = sum / last ;
        System.out.println("Average: "+ average);
    }
}

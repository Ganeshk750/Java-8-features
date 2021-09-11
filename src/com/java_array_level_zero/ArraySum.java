package com.java_array_level_zero;


import java.util.Arrays;

/**
 * @created: 11/09/2021 - 4:17 PM
 * @author: Ganesh
 */

/* Find sum of element array
 *  {1,2,3,4,5,6,7,8,9,10}
 * */

public class ArraySum {

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        ArraySum.firstMethod(arr);
        System.out.println("============SECOND METHOD============");
        ArraySum.secondMethod(arr);

    }

    public static void secondMethod(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum: "+sum);
    }

    public static void firstMethod(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum: "+ sum);
    }
}

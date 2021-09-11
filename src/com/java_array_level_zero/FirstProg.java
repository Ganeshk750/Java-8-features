package com.java_array_level_zero;


import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @created: 11/09/2021 - 3:29 PM
 * @author: Ganesh
 */

/* How To Find Missing Number
 * {1,2,3,4,5,6,8,9,10}
 */

public class FirstProg {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        System.out.println("Initial Array: " + Arrays.toString(arr));
        FirstProg.firstMethod(arr);
        System.out.println("=============BY SECOND METHOD============");
        FirstProg.secondXORMethod(arr);
        System.out.println("=============BY IST IMPROVED=================");
        FirstProg.imporvedFirst(arr);

    }

    public static void firstMethod(int [] arr){
        int sum = 0, actual = 0, missingNumber = 0, lastNumber = arr[arr.length - 1];
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        actual = lastNumber * (lastNumber + 1) / 2;
        missingNumber = actual - sum ;
        System.out.println("Missing Number: "+ missingNumber);
    }

    public static void secondXORMethod(int arr[]){

        // Compute XOR of all the elements in the array
        int missingNumber = 0;
        for (int i: arr) {
            missingNumber = missingNumber ^ i;
        }

        // Compute XOR of all the elements from 1 to `n+1`
        for (int i = 1; i <= arr.length + 1; i++) {
            missingNumber = missingNumber ^ i;
        }
        System.out.println("Missing Number: "+ missingNumber);
      //  return missingNumber;

    }

    public static void imporvedFirst(int [] arr){
        int sum = 0, actual = 0, missingNumber = 0, lastNumber = arr[arr.length - 1];
        sum = Arrays.stream(arr).sum();
        actual = lastNumber * (lastNumber + 1) / 2;
        missingNumber = actual - sum ;
        System.out.println("Missing Number: "+ missingNumber);
    }
}

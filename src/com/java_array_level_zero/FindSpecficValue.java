package com.java_array_level_zero;


import java.util.Arrays;

/**
 * @created: 11/09/2021 - 5:04 PM
 * @author: Ganesh
 */

/* How To Find specific value in given array
 * {1,2,3,4,5,6,8,9,10}
 * if present --> YES
 * if not --> NO
 */

public class FindSpecficValue {
    
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,8,9,10};
        System.out.println("Initial :"+ Arrays.toString(arr));
        FindSpecficValue.firstMethod(arr, 4);
        
    }

    public static void firstMethod(int[] arr, int i) {
    }
}

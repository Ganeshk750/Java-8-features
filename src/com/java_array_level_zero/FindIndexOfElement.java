package com.java_array_level_zero;


import java.util.Arrays;

/**
 * @created: 11/09/2021 - 4:38 PM
 * @author: Ganesh
 */

/* How To Find indexOfElement in given array
 * {1,2,3,4,5,6,8,9,10}
 */

public class FindIndexOfElement {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,8,9,10};
        System.out.println("Initial :"+ Arrays.toString(arr));
        FindIndexOfElement.firstMethod(arr, 8);
        System.out.println("===============SECOND METHOD=================");
        FindIndexOfElement.secondMethod(arr, 8);

    }


    public static void secondMethod(int[] arr, int i) {
        int found = Arrays.stream(arr).filter(j -> arr[j] == i).findFirst().orElse(-1);
        System.out.println("Index of Given Element "+ i +": "+ found);
    }

    public static void firstMethod(int[] arr, int i) {
        int found = 0;
        for (int j = 0; j < arr.length; j++){
            if(arr[j] == i){
               found = j;
            }
        }
        System.out.println("Index of Given Element "+ i +": "+ found);
    }
}

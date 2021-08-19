package com.stringexample;


/**
 * @created: 19/08/2021 - 11:18 AM
 * @author: Ganesh
 */


public class Ques2 {

    public static void main(String[] args) {

        String str = "abcdef";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        String result = "";
        char ch [] = str.toCharArray();
        for(int i = ch.length - 1; i >= 0; i--){
            result += ch[i];
        }
        return  result;
    }
}

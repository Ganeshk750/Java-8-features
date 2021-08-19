package com.stringexample;


/**
 * @created: 19/08/2021 - 1:38 PM
 * @author: Ganesh
 */


public class Ques3 {

    public static void main(String[] args) {

        String str1 = "Core";
        String str2 = "Java";

        String s1 = str1 + str2;
        System.out.println(s1);

        String s2 = s1.concat(str2);
        System.out.println(s2);

        String s3 = new StringBuilder(str1).append(str2).toString();
        System.out.println(s3);
    }
}

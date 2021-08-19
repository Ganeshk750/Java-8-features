package com.stringexample;


/**
 * @created: 19/08/2021 - 1:55 PM
 * @author: Ganesh
 */


public class Ques5 {

    public static void main(String[] args) {

        String s = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";

        System.out.println(filterString(s)); // Welcome to core Java

    }

    private static String filterString(String str) {
        StringBuilder builder = new StringBuilder();
        if(str !=null && str.trim().length() > 0){
            char [] ch = str.trim().toCharArray();
            for(char c: ch){
                if(Character.isAlphabetic(c) || c == ' '){
                    builder.append(c);
                }
            }
        }
        return builder.toString();
    }
}

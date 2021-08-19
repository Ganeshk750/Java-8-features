package com.stringexample;


/**
 * @created: 19/08/2021 - 1:44 PM
 * @author: Ganesh
 */


public class Ques4 {

    private static String [] arr = {
            "    ",
            "A",
            "abcdefmQtpz",
            "a$bcddd",
            "wxfdskjf55",
            "zt+ts",
            null
    };

    public static void main(String[] args) {
        for(String s: arr){
            boolean result = hasAllAlphabets(s);
            if(result){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    private static boolean hasAllAlphabets(String s) {
        if(s != null && s.trim().length() > 0){
            for (int i = 0; i < s.length(); i++){
                if(!Character.isAlphabetic(s.charAt(i))){
                    return false;
                }
            }
            return  true;
        }else {
           return false;
        }
    }
}

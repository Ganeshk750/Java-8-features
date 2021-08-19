package com.stringexample;


/**
 * @created: 19/08/2021 - 10:14 AM
 * @author: Ganesh
 */


public class Ques1 {

    public static void main(String[] args) {

        String [] fullNames = {
                "Khattry, Udayan",
                "Schildt, Herbert",
                "Pitt, Brad",
                "Hanks, Tom"
        };
        System.out.println("Printing Family names: ");
        printFamilyNames(fullNames);
        System.out.println("*************************");
        System.out.println("Printing First names: ");
        printFirstName(fullNames);
    }

    private static void printFirstName(final String[] names) {
//      for(int i = 0; i <= names.length - 1; i++){
//          int index = names[i].indexOf(",");
//          names[i] = names[i].substring(index + 1);
//          System.out.println(names[i]);
//      }

        for (String name: names) {
             int index = name.indexOf(",");
            System.out.println(name.substring(index + 2));
        }
    }

    private static void printFamilyNames(final String[] names) {
//        for(int i = 0; i <= names.length - 1; i++){
//            int index = names[i].indexOf(",");
//            names[i] = names[i].substring(0, index);
//            System.out.println(names[i]);
//        }
        for (String name: names) {
            int index = name.indexOf(",");
            System.out.println(name.substring(0,index));
        }
    }
}

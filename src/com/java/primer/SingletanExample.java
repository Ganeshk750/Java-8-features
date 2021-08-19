package com.java.primer;


/**
 * @created: 19/08/2021 - 9:52 AM
 * @author: Ganesh
 */

public class SingletanExample {

    public static SingletanExample referenceVariable = null;

    private SingletanExample() {
        System.out.println("=== Object Created ===");
    }

    public static SingletanExample crateNewObject(){
        if(referenceVariable == null){
            referenceVariable = new SingletanExample();
        }
        return referenceVariable;
    }

    public static void main(String[] args) {

        System.out.println("=========Main Starts==========");
        SingletanExample s1 = SingletanExample.crateNewObject();
        SingletanExample s2 = SingletanExample.crateNewObject();
        System.out.println(s1);
        System.out.println(s2);

    }
}

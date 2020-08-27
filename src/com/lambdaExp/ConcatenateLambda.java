package com.lambdaExp;

public class ConcatenateLambda {
    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface = (s1, s2) -> s1 + " "+ s2;
        System.out.println(concatenateInterface.sconcat("Hello", "World"));
    }
}

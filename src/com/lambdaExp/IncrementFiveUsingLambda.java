package com.lambdaExp;

public class IncrementFiveUsingLambda {
    public static void main(String[] args) {
        IncrementInteface incrementInteface = (a) -> a + 5;
        System.out.println(incrementInteface.incrementByFive(2));
    }
}

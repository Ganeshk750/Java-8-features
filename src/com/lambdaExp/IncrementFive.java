package com.lambdaExp;

public class IncrementFive implements IncrementInteface{
    @Override
    public int incrementByFive(int a) {
        return a + 5;
    }

    public static void main(String[] args) {
        IncrementFive incrementFive = new IncrementFive();
        System.out.println(incrementFive.incrementByFive(2));
    }
}

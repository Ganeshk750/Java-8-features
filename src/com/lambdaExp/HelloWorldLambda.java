package com.lambdaExp;

public class HelloWorldLambda {
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = () -> "Hello Form Lambda!!";


        System.out.println(helloWorldInterface.sayHello());
    }
}

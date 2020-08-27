package com.lambdaExp;

public class HelloWorldLambda {
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = () -> {
          return "Hello Form Lambda!!";
        };

        System.out.println(helloWorldInterface.sayHello());
    }
}

package com.lambdaExp;

public class HelloWorldTest implements HelloWorldInterface {
    @Override
    public String sayHello() {
        return "Hello World!!";
    }

    public static void main(String[] args) {
        HelloWorldTest helloWorldTest = new HelloWorldTest();
        System.out.println(helloWorldTest.sayHello());
    }
}

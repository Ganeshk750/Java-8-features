package com.ganesh;

@FunctionalInterface
interface MyFunctionalInterface{
	//A method with no parameter
    public String sayHello();
}


public class LambdaExpressionWithNoParameter {

	public static void main(String[] args) {
		
		   // lambda expression
    	MyFunctionalInterface msg = () -> {
    		return "Hello From Java World!!";
    	};
    	
    	 System.out.println(msg.sayHello());
	}

}

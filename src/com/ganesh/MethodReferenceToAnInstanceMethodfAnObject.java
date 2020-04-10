package com.ganesh;


@FunctionalInterface 
interface MyInterface{  
    void display();  
}

public class MethodReferenceToAnInstanceMethodfAnObject {
	
	      public void myMethod(){  
			System.out.println("Instance Method");  
		    } 

	public static void main(String[] args) {
		
		MethodReferenceToAnInstanceMethodfAnObject obj = new MethodReferenceToAnInstanceMethodfAnObject();   
		// Method reference using the object of the class
		MyInterface ref = obj::myMethod;  
		// Calling the method of functional interface  
		ref.display(); 
	}

}

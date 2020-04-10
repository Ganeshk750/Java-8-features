package com.ganesh;

@FunctionalInterface
interface MyyInterface {

    Hello display(String say);
} 

class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
}

public class MethodReferenceToaConstructor {

	public static void main(String[] args) {
		
		//Method reference to a constructor
        MyyInterface ref = Hello::new;  
        ref.display("Hello World!");  

	}

}

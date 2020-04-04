package com.ganesh;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.LongConsumer;


public class M18 {

	public static void main(String[] args) {
		
	 ArrayList<Integer> list = new ArrayList<Integer>();
	 list.add(100);
	 list.add(800);
	 list.add(10);
	 list.add(9000);
	 list.forEach((element) -> {
		 System.out.println(element);
		 System.out.println(element);
		 System.out.println("<=============>");
		 
	       });
	 //Through lembda expression
		
	}
	
}


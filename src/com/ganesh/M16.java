package com.ganesh;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.LongConsumer;


public class M16 {

	public static void main(String[] args) {
		
	 ArrayList<Integer> list = new ArrayList<Integer>();
	 list.add(200);
	 list.add(20);
	 list.add(500);
	 list.add(10);
	 ListConsumer1 consumer = new ListConsumer1();
	 list.forEach(consumer);
		
	}
	
}
class ListConsumer1 implements Consumer<Integer> {

	@Override
	public void accept(Integer obj) {
		System.out.println(obj);
		
	}
	
}

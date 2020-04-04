package com.ganesh;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.LongConsumer;


public class M15 {

	public static void main(String[] args) {
		
	 ArrayList list = new ArrayList();
	 list.add(100);
	 list.add("ganesh");
	 list.add("10.20");
	 list.add(true);
	 ListConsumer consumer = new ListConsumer();
	 list.forEach(consumer);
		
	}
	
}
class ListConsumer implements Consumer {

	@Override
	public void accept(Object obj) {
		System.out.println(obj);
		
	}
	
}

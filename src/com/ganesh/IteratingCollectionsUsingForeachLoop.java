package com.ganesh;

import java.util.ArrayList;
import java.util.List;

public class IteratingCollectionsUsingForeachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<String> list=new ArrayList<String>();  
	       list.add("Rick");         
	       list.add("Negan");       
	       list.add("Daryl");         
	       list.add("Glenn");         
	       list.add("Carl");                
	       list.forEach(          
	           // lambda expression        
	           (names)->System.out.println(names)         
	       );     

	}

}

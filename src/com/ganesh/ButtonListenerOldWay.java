package com.ganesh;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerOldWay {
	
    public static void main(String[] args) {
//    	 Frame frame=new Frame("ActionListener Before Java8");  
//    	    
//         Button b=new Button("Click Here");  
//         b.setBounds(50,100,80,50);  
//    
//         b.addActionListener(new ActionListener(){  
//            public void actionPerformed(ActionEvent e){  
//      	     System.out.println("Hello World!"); 
//            }  
//         });  
//         frame.add(b);
//      
//         frame.setSize(200,200);  
//         frame.setLayout(null);  
//         frame.setVisible(true);
//    	
    	
    	  //now same code with lambda exp
    	
    	Frame frame=new Frame("ActionListener java8");  
        
        Button b=new Button("Click Here");  
        b.setBounds(50,100,80,50); 
    
        b.addActionListener(e -> System.out.println("Hello Ganesh!")); 
        frame.add(b);
    
        frame.setSize(200,200);  
        frame.setLayout(null);  
        frame.setVisible(true);  
    	
    	
	}
}

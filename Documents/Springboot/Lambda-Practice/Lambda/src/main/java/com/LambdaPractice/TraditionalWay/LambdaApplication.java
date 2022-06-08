package com.LambdaPractice.TraditionalWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class LambdaApplication {

	public static void main(String[] args) {
		
	//Method # 01	
	
	/*	MyIntImpl w = new MyIntImpl();
	  	w.sayhello();
	  
	  */
		
		
		//Method # 02 write MyInt at right side of = after new and click ctrl + spacebar
		
		/*
		 *  here is the new creating the object of the child class of the MyInt interface, because
		 *  we cannot create the object of the interface
		 */
		
		//First Implementation
	/*	MyInt i1 = new MyInt() {
			
			@Override
			public void sayhello() {
				System.out.println("From Anonymous Class 1");
				
			}
		};
		i1.sayhello();
		
		MyInt i2 = new MyInt() {
			
			@Override
			public void sayhello() {
				System.out.println ("From Anonymous Class 2");
				
			}
		};
		
		i2.sayhello();*/
		
		//Method # 03 Using Lambda expression ; replacing anonymous function [after 'MyInt i2 = ' ] with the lambda expression
		
		 MyInt iLambda1 = () -> System.out.println ("Lambda Expression 1"); 
		 iLambda1.sayhello();
		 
		 MyInt iLambda2 = () -> System.out.println ("Lambda Expression 2"); 
		 iLambda2.sayhello();
		 
		 
		 SumInterf sumI = (a, b) -> a +b  ;
		
		 System.out.println("Sum : " +sumI.sumInterf(50, 7));
		  
		 
		 LenthInt iStr = str -> str.length(); 
		 System.out.println("Length : " + iStr.lenStr("Samina"));
		 
	}

}

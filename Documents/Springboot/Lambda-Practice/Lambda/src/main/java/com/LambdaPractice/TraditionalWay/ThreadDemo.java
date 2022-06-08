package com.LambdaPractice.TraditionalWay;

import java.time.Duration;
import java.util.concurrent.Delayed;

//How to create thread using Lambda 
public class ThreadDemo {

	public static void main(String... args) {
		
		//First Thread
		/*
		 * First Thread using Runnable Interface , 
		 * as Runnable Interface is FuntionalInterface so we can used the Lambda
		 * Thread for -Jhon
		 */
		
		Runnable thread1 = () -> {
			for(int i=1; i<9 ;i++) {
				System.out.println("Thraed  :" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		 
		 Thread t = new Thread(thread1);
		 t.setName("Jhon");
		 t.start();
		
		 Runnable thread2 = () -> {
				for(int i=1; i<9 ;i++) {
					System.out.println("Thraed 2 :" + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			};
			 
			 Thread t2 = new Thread(thread2);
			 t2.setName("Josh");
			 t2.start();
		
	}

}

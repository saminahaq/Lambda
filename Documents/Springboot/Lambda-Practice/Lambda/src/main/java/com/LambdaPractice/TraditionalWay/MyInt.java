package com.LambdaPractice.TraditionalWay;

@FunctionalInterface
public interface MyInt {
	
	//by deafult abs is "public abstract" so don't need to put public here 
	public abstract void sayhello();
}

//Method # 01
//Create separate class MyIntImpl and implement this interface

//Method #02
/*
 * create anonymous class for implementing this interface at several time as you want, 
 * (1) no need of the MyIntImpl class
 * (2) can use several abs method in interfacce
 */


//Method # 02 
/*
 * use Lambda Expression, as long as you are using single abs method in interfacce
 * (1) no need of the MyIntImpl class and 
 * (2)no need of the anonymous function
 * (3) cannot use several abs method in interfacce 
 * 
 */
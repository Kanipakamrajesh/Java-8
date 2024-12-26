package com.raj.Lambda;

interface Greet
{
	void sayHello(String name);
}
public class FunctionalInterface 
{
	public static void main(String[] args) {
		Greet greet = name -> System.out.println("Hello "+name);
		greet.sayHello("Rajesh");
	}
	
}

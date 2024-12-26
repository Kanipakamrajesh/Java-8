package com.raj.Basic;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) 
	{
		LocalTime time = LocalTime.now();
		System.out.println("Local Time:"+time);
		LocalTime specificTime = LocalTime.of(14, 30);
		System.out.println("Specific Time:"+specificTime);
	}
}

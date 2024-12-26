package com.raj.Basic;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) 
	{
		LocalDate date = LocalDate.now();
		System.out.println("Current Date :"+date);
		LocalDate specificDate = LocalDate.of(2024, 12, 13);
		System.out.println("Specific Date :"+specificDate);
	}
}

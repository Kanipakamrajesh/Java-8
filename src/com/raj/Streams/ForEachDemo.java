package com.raj.Streams;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Rajesh","Ravi","Prakash","Ramu");
		
		names.stream()
				.forEach(name -> System.out.println("Name:"+name));
	}

}

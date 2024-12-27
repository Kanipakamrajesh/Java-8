package com.raj.Streams;

import java.util.Arrays;
import java.util.List;

public class AllMatchDemo {

	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Rajesh","Prakash","Ramu");
		boolean result = names.stream()
				.allMatch(name -> name.length()>2);
		System.out.println(result);
	}

}

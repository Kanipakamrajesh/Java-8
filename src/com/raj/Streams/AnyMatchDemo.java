package com.raj.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AnyMatchDemo {

	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Rajesh","Prakash","Ramu");
		boolean result = names.stream()
				.anyMatch(name -> name.startsWith("R"));
		System.out.println(result);
	}
}

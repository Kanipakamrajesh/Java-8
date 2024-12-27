package com.raj.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("Rajesh","Prakash","Ramu");
		List<String> matchedNames = names.stream()
				.filter(name -> name.startsWith("R")).collect(Collectors.toList());
		System.out.println(matchedNames);
	}
}

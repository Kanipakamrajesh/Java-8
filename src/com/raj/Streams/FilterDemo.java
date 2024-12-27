package com.raj.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo 
{
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Rajesh","Mahendra","Ramu","Naresh");
		List<String> filteredNames = names.stream()
				.filter(name -> name.length()>4).collect(Collectors.toList());
		System.out.println(filteredNames);
	}
}

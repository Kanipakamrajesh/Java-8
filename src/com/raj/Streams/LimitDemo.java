package com.raj.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitDemo 
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(10,24,10,30,24,40,34,20);
		List<Integer> limitNumbers = numbers.stream()
				.limit(4).collect(Collectors.toList());
		System.out.println(limitNumbers);
	}
}

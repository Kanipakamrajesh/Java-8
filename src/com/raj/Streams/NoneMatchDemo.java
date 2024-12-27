package com.raj.Streams;

import java.util.Arrays;
import java.util.List;

public class NoneMatchDemo {

	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1,2,4,9,15);
		boolean result = numbers.stream()
				.noneMatch(n -> n>10);
		System.out.println(result);
	}
}

package com.raj.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo 
{
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,76,25,58,47);
		List<Integer> sortedNumbers = numbers.stream()
				.sorted().collect(Collectors.toList());
		System.out.println(sortedNumbers);
	}

}

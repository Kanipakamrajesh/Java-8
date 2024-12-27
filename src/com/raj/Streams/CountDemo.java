package com.raj.Streams;

import java.util.Arrays;
import java.util.List;

class CountDemo
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(12,4,5,6,7,5,6,8,4,3,2,5);
		long length = numbers.stream().count();
		System.out.println(length);
	}
}

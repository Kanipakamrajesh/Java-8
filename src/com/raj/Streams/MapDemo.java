package com.raj.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo 
{
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Rajesh","Ramesh","Kesava","Rahul");
		List<String> upperCaseNames = names.stream()
				.map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseNames);
	}

}

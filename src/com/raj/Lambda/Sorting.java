package com.raj.Lambda;

import java.util.Arrays;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Rajesh","Prakash","Hema");
		names.sort((a,b)-> a.compareTo(b));
		names.forEach(System.out::println);
	}
}

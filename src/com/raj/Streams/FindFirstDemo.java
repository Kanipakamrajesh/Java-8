package com.raj.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstDemo {

	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("Rajesh","Prakash","Rahul","Guna");
		Optional<String> firstName = names.stream().findFirst();
		firstName.ifPresent(name -> System.out.println("Name:"+name));
	}
}

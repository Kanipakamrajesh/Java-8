package com.raj.Lambda;

import java.util.function.Function;

public class Square {

	public static void main(String[] args)
	{
		Function<Integer,Integer> square = x -> x*x;
		System.out.println(square.apply(5));
	}
}

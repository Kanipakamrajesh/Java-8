package com.raj.Lambda;

interface MathOperation
{
	int operate(int a,int b);
}
public class CustomFI {

	public static void main(String[] args) {
		MathOperation sum = (a,b) -> a+b;
		MathOperation mul = (a,b) -> a*b;
		System.out.println(sum.operate(10, 5));
		System.out.println(mul.operate(10, 5));
	}

}

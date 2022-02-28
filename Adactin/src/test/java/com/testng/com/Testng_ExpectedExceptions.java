package com.testng.com;


import org.testng.annotations.Test;

public class Testng_ExpectedExceptions
{
	@Test(expectedExceptions = ArithmeticException.class)
	public void calculation() {
		int a=10;
		int b=5/0;
		System.out.println(a+b);
		

	}
	@Test
	public void Calculation2() {
		int a=5, b=5;
		System.out.println(a+b);

	}
}

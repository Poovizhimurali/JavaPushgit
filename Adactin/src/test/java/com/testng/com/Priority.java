package com.testng.com;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = -1)
	public void Amethod() {
		System.out.println("this is method A");

	}
	@Test(priority = 2)
	public void Bmethod() {
		System.out.println("this is method B");

	}
	
	@Test(priority = 1)
	public void Cmethod() {
		System.out.println("this is method C");

	}
	@Test(priority = 3)
	public void Dmethod() {
		System.out.println("this is method D");

	}
}

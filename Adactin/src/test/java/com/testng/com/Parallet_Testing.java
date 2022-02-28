package com.testng.com;

import org.testng.annotations.Test;

public class Parallet_Testing {
	@Test
	public void Amethod() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("this is method A");

	}
	@Test
	public void Bmethod() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("this is method B");

	}
	
	
	@Test
	public void Cmethod() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("this is method C");

	}
	@Test

	public void Dmethod() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("this is method D");

	}

}

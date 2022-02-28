
package com.testng.com;

import org.testng.annotations.Test;

public class Timeout_Test {
	
	@Test
	public void Amethod() {
		System.out.println("this is method A");

	}
	@Test(timeOut = 1000)
	public void Bmethod() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("this is method B");

	}
	
	
	@Test
	public void Cmethod() {
		System.out.println("this is method C");

	}
	@Test

	public void Dmethod() {
		System.out.println("this is method D");

	}

}

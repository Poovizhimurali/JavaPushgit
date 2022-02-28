package com.testng.com;

import org.testng.annotations.Test;

public class Testng_Dependson {
	
	@Test(dependsOnMethods = "cmethod" )
	public void amethod() {

		System.out.println("Method A");

	}

	@Test
	public void bmethod() {

		System.out.println("Method B");

	}
	@Test(dependsOnMethods = "bmethod" )
	public void cmethod() {

		System.out.println("Method C");

	}
}

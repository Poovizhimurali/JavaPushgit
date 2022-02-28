package com.testng.com;

import org.testng.annotations.Test;

public class Testng_Grouping {
	
	
	@Test(groups = "IntegrationTest" )
	public void amethod() {

		System.out.println("Method A");

	}

	@Test(groups = "IntegrationTest1" )
	public void bmethod() {

		System.out.println("Method B");

	}
	@Test(groups = { "IntegrationTest" ,"IntegrationTest1" } )
	public void cmethod() {

		System.out.println("Method C");

	}
	
	@Test(groups = "IntegrationTest" )
	public void dmethod() {

		System.out.println("Method D");

	}
	
	@Test(groups = "IntegrationTest1" )
	public void emethod() {

		System.out.println("Method E");

	}

}

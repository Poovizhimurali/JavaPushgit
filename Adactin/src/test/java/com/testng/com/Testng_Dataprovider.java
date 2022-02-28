package com.testng.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng_Dataprovider {
	
	@Test(dataProvider = "data" )
	public void method1(String name, String pass ) {
		
		System.out.println("username= " +name + " password = " +pass);
	}
	
	@DataProvider(name = "data")
	public Object[][] testdata() {
		return new Object[][]
				{
			{"abc" ,"123"},{"def", "456"}
			
			};
				

	}

}

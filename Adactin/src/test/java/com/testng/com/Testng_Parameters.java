package com.testng.com;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng_Parameters {
	
	@Parameters({"username"})
	@Test
	public void method1(String user) {
	System.out.println("username " +user);

	}
	@Parameters({"password"})
	@Test
	public void method2(String pwd) {
		System.out.println("password " +pwd);

	}

}

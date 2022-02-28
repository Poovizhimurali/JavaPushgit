package com.testng.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pom.com.Loginpage;

public class Testnng {
	@BeforeSuite
	public void setup() {
		System.out.println("setting up");
	}
	@BeforeTest
	public void browserlaunch() {
		System.out.println("launch browser");
	}
	@BeforeClass
	public void url() {
		System.out.println("app url");

	}
	@BeforeMethod
	public void Login() {
		System.out.println("app login");

	}
	@Test
	public void searchmobile() {
		System.out.println("iphone");

	}
	@Test
	public void searchlap() {
		System.out.println("search Apple laptop");
	}
	@AfterMethod
	public void verify() {
		System.out.println("verify everything is displayed");

	}
	@AfterClass
	public void logout() {
		System.out.println("logout");

	}
	@AfterTest
	public void cloebrowser() {
		System.out.println("close browser");

	}
	
}

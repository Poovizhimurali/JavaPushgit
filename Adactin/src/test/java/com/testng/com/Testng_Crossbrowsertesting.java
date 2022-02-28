package com.testng.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

public class Testng_Crossbrowsertesting {
	public WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeClass()
	public void beforelog(String browser) {
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Poovizhi\\eclipse-newwork\\Adactin\\Driver1\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Poovizhi\\eclipse-newwork\\MavenProject\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}
	
	@Test
	public void login() {
		System.out.println("log");
	}
	
	@AfterClass
	public void logout() {
		//driver.quit();

	}
}
	
	
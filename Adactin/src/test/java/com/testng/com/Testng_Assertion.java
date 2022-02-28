package com.testng.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testng_Assertion {
	public WebDriver driver;
	
	@BeforeClass()
	public void beforelog() {
		
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Poovizhi\\eclipse-newwork\\Adactin\\Driver1\\chromedriver.exe");
	driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void mobiles() throws AWTException, InterruptedException {

		WebElement mobiles = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		Actions sc = new Actions(driver);
		sc.contextClick(mobiles).build().perform();
		Robot oi = new Robot();
		oi.keyPress(KeyEvent.VK_DOWN);
		oi.keyRelease(KeyEvent.VK_DOWN);
		oi.keyPress(KeyEvent.VK_ENTER);
		oi.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println("Titles are-----------");
			System.out.println(title);
		}		
	}	
	@Test
	public void hardassert() {
		String actual = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		String expected = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void softassert() {
		String actual = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		SoftAssert ref = new SoftAssert();
		ref.assertEquals(actual, expected);
		ref.assertAll();

		
	}
	
	@AfterClass
	public void logout() {
		//driver.quit();

	}
	
	
	

}

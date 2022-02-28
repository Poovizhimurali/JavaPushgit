package com.Runner.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.base.com.BaseClass;

public class miniproject extends BaseClass {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		driver = BrowserLaunch("chrome");
		launchurl("http://automationpractice.com/index.php");
		/*WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		rightclick(women);
		robotclass();
		WebElement dresses = driver.findElement(By.xpath("//a[text()='Dresses']"));
		rightclick(dresses);
		robotclass();
		gettitles();
		windowhandles("Women - My Store");
		scrolldown1500();
		WebElement printeddress = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[4]"));
		movetoelement(printeddress);

		WebElement dress = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[4]"));
		clickonelement(dress);
		WebElement addcrt = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		clickonelement(addcrt);
		threadsleep(3000);
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickonelement(checkout);
		threadsleep(3000);
		WebElement proceed = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickonelement(proceed);
		WebElement email = driver.findElement(By.cssSelector("input#email_create"));
		sendkeys(email, "poovizhiuday8@gmail.com");
		WebElement create = driver.findElement(By.cssSelector("button#SubmitCreate"));
		clickonelement(create);
		threadsleep(3000);
		scrolldown800();
		threadsleep(3000);
		driver.findElement(By.cssSelector("input#id_gender2")).click();
		WebElement firstname = driver.findElement(By.cssSelector("input#customer_firstname"));
		sendkeys(firstname, "poovizhi");
		WebElement lastname = driver.findElement(By.cssSelector("input#customer_lastname"));
		sendkeys(lastname, "murali");
		WebElement password = driver.findElement(By.cssSelector("input#passwd"));
		sendkeys(password, "PooMur249");
		threadsleep(3000);

		WebElement date = driver.findElement(By.id("days"));
		dropdown(date, "value", "24");
		threadsleep(3000);

		WebElement month = driver.findElement(By.id("months"));
		dropdown(month, "value", "9");
		threadsleep(3000);

		WebElement year = driver.findElement(By.id("years"));
		dropdown(year, "value", "1991");

		WebElement address = driver.findElement(By.id("address1"));
		sendkeys(address, "amani mallapuram post");// .sendKeys("amani mallapuram post");

		WebElement address2 = driver.findElement(By.id("address2"));
		sendkeys(address2, "Dharmapuri");// .sendKeys("Dharmapuri");

		WebElement city = driver.findElement(By.id("city"));
		sendkeys(city, "Dharmapuri"); // .sendKeys("Dharmapuri");
		threadsleep(3000);

		WebElement state = driver.findElement(By.id("id_state"));
		dropdown(state, "value", "14");

		WebElement postcode = driver.findElement(By.id("postcode"));
		sendkeys(postcode, "63680"); // .sendKeys("63680");//submitAccount
		threadsleep(3000);

		WebElement country = driver.findElement(By.id("id_country"));
		dropdown(country, "value", "21");

		WebElement phoneno = driver.findElement(By.id("phone_mobile"));
		sendkeys(phoneno, "9008547478"); // .sendKeys("9008547478");
		WebElement addr = driver.findElement(By.id("alias"));
		sendkeys(addr, "address"); // .sendKeys("address");
		threadsleep(3000);

		driver.findElement(By.id("submitAccount")).click();
		threadsleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.id("uniform-cgv")).click();
		threadsleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		threadsleep(3000);
		scrolldown300();
		threadsleep(3000);
		screenshot("C:\\Users\\Poovizhi\\eclipse-newwork\\MavenProject\\Screenshot\\mavenmniproj.png");*/

	}
}

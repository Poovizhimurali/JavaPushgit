package com.miniproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project1 {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Poovizhi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions sc = new Actions(driver);
		sc.contextClick(women).build().perform();
		Robot oi = new Robot();
		oi.keyPress(KeyEvent.VK_DOWN);
		oi.keyRelease(KeyEvent.VK_DOWN);
		oi.keyPress(KeyEvent.VK_ENTER);
		oi.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement dresses = driver.findElement(By.xpath("//a[text()='Dresses']"));
		sc.contextClick(dresses).build().perform();
		oi.keyPress(KeyEvent.VK_DOWN);
		oi.keyRelease(KeyEvent.VK_DOWN);
		oi.keyPress(KeyEvent.VK_ENTER);
		oi.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> windows = driver.getWindowHandles();
		for (String titles : windows) {

			String title1 = driver.switchTo().window(titles).getTitle();
			System.out.println(title1);
		}

		String tabtitle = "Women - My Store";
		for (String titles2 : windows) {
			if (driver.switchTo().window(titles2).getTitle().equals(tabtitle)) {
				break;
			}
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)", "");
		
		WebElement printeddress = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[4]"));
		sc.moveToElement(printeddress).build().perform();
		
		/*WebElement quickview = driver.findElement(By.xpath("(//a[@class='quick-view'])[4]"));
		quickview.click();
		driver.switchTo().frame("fancybox-frame1640191851711");
		List<WebElement> tag = driver.findElements(By.tagName("iframe"));
		System.out.println(tag.size());
		WebElement add = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		add.click();*/
		
		WebElement dress = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[4]"));
		dress.click();
		WebElement addcrt = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		addcrt.click();
		Thread.sleep(3000);
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		checkout.click();
		Thread.sleep(3000);
		WebElement proceed = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed.click();
		WebElement email = driver.findElement(By.cssSelector("input#email_create"));
		email.sendKeys("poovizhiuday8@gmail.com");
		WebElement create = driver.findElement(By.cssSelector("button#SubmitCreate"));
		create.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#id_gender2")).click();
		WebElement firstname = driver.findElement(By.cssSelector("input#customer_firstname"));
		firstname.sendKeys("poovizhi");
		WebElement lastname = driver.findElement(By.cssSelector("input#customer_lastname"));
		lastname.sendKeys("murali");
		WebElement password = driver.findElement(By.cssSelector("input#passwd"));
		password.sendKeys("PooMur249");

		Thread.sleep(3000);
		
		WebElement date = driver.findElement(By.id("days"));
		Select si = new Select(date);
		si.selectByValue("24");
		
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("months"));
		Select mon = new Select(month);
		mon.selectByValue("9");
		
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.id("years"));
		Select yea = new Select(year);
		yea.selectByValue("1991");
		
		driver.findElement(By.id("address1")).sendKeys("amani mallapuram post");
		
		driver.findElement(By.id("address2")).sendKeys("Dharmapuri");
		
		driver.findElement(By.id("city")).sendKeys("Dharmapuri");
		
		Thread.sleep(3000);
		WebElement state = driver.findElement(By.id("id_state"));
		Select sta = new Select(state);
		sta.selectByValue("14");
		
		driver.findElement(By.id("postcode")).sendKeys("63680");//submitAccount
		
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.id("id_country"));
		Select count = new Select(country);
		count.selectByValue("21");
		driver.findElement(By.id("phone_mobile")).sendKeys("9008547478");
		driver.findElement(By.id("alias")).sendKeys("address");
		
		Thread.sleep(3000);
		driver.findElement(By.id("submitAccount")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.id("uniform-cgv")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Poovizhi\\eclipse-newwork\\MavenProject\\Screenshot\\mini.png");
		FileUtils.copyFile(source, destination);
	}
}

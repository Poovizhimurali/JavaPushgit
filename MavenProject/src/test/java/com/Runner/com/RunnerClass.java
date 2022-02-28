package com.Runner.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.com.BaseClass;

public class RunnerClass extends BaseClass
{
	public static WebDriver driver	;
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		driver = BrowserLaunch("chrome");
		launchurl("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		sendkeys(email, "poovizhiuday1@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		sendkeys(password, "Poomurali123");
		WebElement loginbtn = driver.findElement(By.name("login"));
		clickonelement(loginbtn);
		threadsleep(3000);
		screenshot("C:\\Users\\Poovizhi\\eclipse-newwork\\MavenProject\\Screenshot\\facebook.png");
	}
	
}

package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Bookingconfirmatn 
{
	private WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	
	public Adactin_Bookingconfirmatn(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}
}

package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	private WebDriver driver;
	
	@FindBy(name ="email")
	private WebElement username;
	
	@FindBy(name ="pass")
	private WebElement password;
	
	@FindBy(name ="login")
	private WebElement loginbtn;
	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	
	public Loginpage(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}
}

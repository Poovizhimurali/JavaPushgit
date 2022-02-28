package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinloginpage 
{
	private WebDriver driver;
	
	@FindBy(name ="username")
	private WebElement username;
	
	@FindBy(name ="password")
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

	public Adactinloginpage(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}
	
}

package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	private WebDriver driver;
	
	@FindBy(name ="radiobutton_0")
	private WebElement radiobtn;

	@FindBy(name ="continue")
	private WebElement continuee;
	
	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContinuee() {
		return continuee;
	}

	public Select_Hotel(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}
	
	
}

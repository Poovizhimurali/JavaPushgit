package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Ahotel {
	
	private WebDriver driver;
	
	@FindBy(name ="first_name")
	private WebElement firstname;
	
	@FindBy(name ="last_name")
	private WebElement lastname;
	
	@FindBy(name ="address")
	private WebElement addres;
	
	@FindBy(name ="cc_num")
	private WebElement creditcard;
	
	@FindBy(name ="cc_type")
	private WebElement creditcardtype;
	
	@FindBy(name ="cc_exp_month")
	private WebElement expirydatemonth;
	
	@FindBy(name ="cc_exp_year")
	private WebElement expirydateyear;
	
	@FindBy(name ="cc_cvv")
	private WebElement cvv;
	
	@FindBy(name ="book_now")
	private WebElement booknow;
	
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddres() {
		return addres;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getExpirydatemonth() {
		return expirydatemonth;
	}

	public WebElement getExpirydateyear() {
		return expirydateyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public Search_Ahotel(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}
	
	
}

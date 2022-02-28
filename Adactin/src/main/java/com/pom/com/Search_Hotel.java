package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	private WebDriver driver;
	
	@FindBy(name ="location")
	private WebElement locatin;
	
	@FindBy(name ="hotels")
	private WebElement hotels;
	
	@FindBy(name ="room_type")
	private WebElement roomtype;
	
	@FindBy(name ="room_nos")
	private WebElement noofrooms;
	
	@FindBy(name ="datepick_in")
	private WebElement checkindate;
	
	@FindBy(name ="datepick_out")
	private WebElement checkoutdate;
	
	@FindBy(name ="adult_room")
	private WebElement adultsperroom;
	
	@FindBy(name ="child_room")
	private WebElement childperroom;
	
	@FindBy(name ="Submit")
	private WebElement search;
	
	
	public WebElement getLocatin() {
		return locatin;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRoomtype() {
		return roomtype;
	}


	public WebElement getNoofrooms() {
		return noofrooms;
	}


	public WebElement getCheckindate() {
		return checkindate;
	}


	public WebElement getCheckoutdate() {
		return checkoutdate;
	}


	public WebElement getAdultsperroom() {
		return adultsperroom;
	}


	public WebElement getChildperroom() {
		return childperroom;
	}


	public WebElement getSearch() {
		return search;
	}

	
	public Search_Hotel(WebDriver driver2) {
		
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}
	
}

package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager
{
	private  WebDriver driver;
	private Adactin_Bookingconfirmatn booking;
	private Adactinloginpage adactinlogin;
	private Search_Ahotel searchhotel;
	private Search_Hotel  searchpage;
	private Select_Hotel  selecthotel;
	private Loginpage fb ;
	
	public Loginpage get_Instance_Fb() {
		fb = new Loginpage(driver);
		return fb;
	}
	public Adactin_Bookingconfirmatn get_Instance_Booking() {
		booking = new Adactin_Bookingconfirmatn(driver);
		return booking;
	}
	public Adactinloginpage get_Instance_Adactinlogin() {
		adactinlogin = new Adactinloginpage(driver);
		return adactinlogin;
	}
	public Search_Ahotel get_Instance_Searchhotel() {
		searchhotel = new Search_Ahotel(driver);
		return searchhotel;
	}
	public Search_Hotel get_Instance_Searchpage() {
		searchpage = new Search_Hotel(driver);
		return searchpage;
	}
	public Select_Hotel get_Instance_Selecthotel() {
		selecthotel= new Select_Hotel(driver);
		return selecthotel;
	}
	
	public Page_Object_Manager(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}
	
}

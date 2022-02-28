package com.Adactin.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.base.com.BaseClass;
import com.pom.com.Page_Object_Manager;

public class Adactin_Runnerclass extends BaseClass

{
	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
	driver= BrowserLaunch("firefox");
	launchurl("https://adactinhotelapp.com/");
	threadsleep(3000);
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	sendkeys(pom.get_Instance_Adactinlogin().getUsername(), "poovizhi1");
	sendkeys(pom.get_Instance_Adactinlogin().getPassword(), "5G84OB");
	clickonelement(pom.get_Instance_Adactinlogin().getLoginbtn());
	dropdown(pom.get_Instance_Searchpage().getLocatin(), "value", "Melbourne");
	dropdown(pom.get_Instance_Searchpage().getHotels(), "value", "Hotel Sunshine");
	dropdown(pom.get_Instance_Searchpage().getRoomtype(), "value", "Super Deluxe");
	dropdown(pom.get_Instance_Searchpage().getNoofrooms(), "value", "2");
	dropdown(pom.get_Instance_Searchpage().getAdultsperroom(), "value", "2");
	dropdown(pom.get_Instance_Searchpage().getChildperroom(), "value", "2");
	clickonelement(pom.get_Instance_Searchpage().getSearch());
	clickonelement(pom.get_Instance_Selecthotel().getRadiobtn());
	clickonelement(pom.get_Instance_Selecthotel().getContinuee());
	sendkeys(pom.get_Instance_Searchhotel().getFirstname(), "poovizhi");
	sendkeys(pom.get_Instance_Searchhotel().getLastname(), "murali");
	sendkeys(pom.get_Instance_Searchhotel().getAddres(), "chennai");
	sendkeys(pom.get_Instance_Searchhotel().getCreditcard(), "1234567891234567");
	dropdown(pom.get_Instance_Searchhotel().getCreditcardtype(), "value", "MAST");
	dropdown(pom.get_Instance_Searchhotel().getExpirydatemonth(), "value", "9");
	dropdown(pom.get_Instance_Searchhotel().getExpirydateyear(), "value", "2019");
	sendkeys(pom.get_Instance_Searchhotel().getCvv(), "123");
	clickonelement(pom.get_Instance_Searchhotel().getBooknow());
	threadsleep(3000);
	clickonelement(pom.get_Instance_Booking().getLogout());	
	screenshot("C:\\Users\\Poovizhi\\eclipse-newwork\\Adactin\\screenshot\\adactin.png");
	}
}

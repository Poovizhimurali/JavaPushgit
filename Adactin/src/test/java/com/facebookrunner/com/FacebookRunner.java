package com.facebookrunner.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;

import com.base.com.BaseClass;
import com.pom.com.Loginpage;
import com.pom.com.Page_Object_Manager;

public class FacebookRunner extends BaseClass {
	
	private static WebDriver driver;
	
	public static void main(String[] args) {
		driver= BrowserLaunch("chrome");
		launchurl("https://www.facebook.com/");
		Loginpage fb = new Loginpage(driver);
		//Page_Object_Manager pom = new Page_Object_Manager(driver);
		
		WebElement username = fb.getUsername();
		sendkeys(username, "poovizhiuday@gmail.com");
		//sendkeys(pom.get_Instance_Fb().getUsername(), "poovizhiuday@gmail.com");
		sendkeys(fb.getPassword(), "pooovi1234");
		//sendkeys(pom.get_Instance_Fb().getPassword(), "pooovi1234");
		clickonelement(fb.getLoginbtn());
		//clickonelement(pom.get_Instance_Fb().getLoginbtn());
		System.out.println("success");
	}

}

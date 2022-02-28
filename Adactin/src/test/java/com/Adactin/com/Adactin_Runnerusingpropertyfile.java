package com.Adactin.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.base.com.BaseClass;
import com.filereadermanager.com.File_Reader_Manager;
import com.pom.com.Page_Object_Manager;

public class Adactin_Runnerusingpropertyfile extends BaseClass
{
	private static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
	
		driver= BrowserLaunch("chrome");
		
		launchurl(File_Reader_Manager.getInstanceFR().getInstanceCR().get_Url());
		threadsleep(3000);
		Page_Object_Manager pom = new Page_Object_Manager(driver);
		sendkeys(pom.get_Instance_Adactinlogin().getUsername(), File_Reader_Manager.getInstanceFR().getInstanceCR().get_username());
		sendkeys(pom.get_Instance_Adactinlogin().getPassword(), File_Reader_Manager.getInstanceFR().getInstanceCR().get_password());
		clickonelement(pom.get_Instance_Adactinlogin().getLoginbtn());
		
	}
	

}

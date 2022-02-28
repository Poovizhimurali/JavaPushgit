package com.filereadermanager.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader 

{
public static Properties p;
public Configuration_Reader() throws IOException 
{
	File f = new File("C:\\Users\\Poovizhi\\eclipse-newwork\\Adactin\\Configuration\\configuration.properties");
	FileInputStream fis = new FileInputStream(f);
	p = new Properties();
	p.load(fis);
	
}
public String get_Url()
{
	String url = p.getProperty("url");
	return url;
}
public String get_username()
{
	String username = p.getProperty("username");
	return username;
}
public String get_password()
{
	String password = p.getProperty("password");
	return password;
}
	
}

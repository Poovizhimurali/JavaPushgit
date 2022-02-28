package com.filereadermanager.com;

import java.io.IOException;

public class File_Reader_Manager 
{

	private File_Reader_Manager()
	{
		
	}
	
	public static File_Reader_Manager getInstanceFR()
	{
		File_Reader_Manager reader = new File_Reader_Manager();
		return reader;
	}
	
	public  Configuration_Reader getInstanceCR() throws IOException
	{
		Configuration_Reader helper = new Configuration_Reader();
		return helper;
	}
}

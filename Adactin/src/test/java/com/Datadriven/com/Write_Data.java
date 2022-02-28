package com.Datadriven.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	public static void writeparticulardata() throws IOException
	{
		File f = new File("C:\\Users\\Poovizhi\\eclipse-newwork\\Adactin\\TestData\\DataSet_For_write.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("newdata").createRow(0).createCell(0).setCellValue("email");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	public static void main(String[] args) throws IOException {
		writeparticulardata();
	}

}

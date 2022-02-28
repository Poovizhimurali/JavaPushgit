package com.Datadriven.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	public static void readparticulardata() throws IOException {
		
		File f = new File("C:\\Users\\Poovizhi\\eclipse-newwork\\Adactin\\TestData\\DataSet_For_Read.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook	wb = new XSSFWorkbook(fis)	;
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if(cellType.equals(cellType.STRING))
		{
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		}
		else if(cellType.equals(cellType.NUMERIC))
		{
			double numericCellValue = cell.getNumericCellValue();
			int value = (int)numericCellValue;
			System.out.println(numericCellValue);
		}
		else
		{
			System.out.println("wrong input");
		}
			
	}
	public static void main(String[] args) throws IOException 
	{
		readparticulardata();
	}

}

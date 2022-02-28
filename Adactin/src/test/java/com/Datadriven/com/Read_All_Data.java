package com.Datadriven.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_All_Data {
	public static void readalldata() throws IOException {

		File f = new File("C:\\Users\\Poovizhi\\eclipse-newwork\\Adactin\\TestData\\DataSet_For_Read.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < physicalNumberOfCells; j++) {

				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();

				if (cellType == (cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.print("  " +stringCellValue);
				} else if (cellType == (cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int value = (int)numericCellValue;
					System.out.println("  " +value);
				}

			}
			System.out.println();
		}

	}

	public static void main(String[] args) throws IOException {
		readalldata();
	}
}

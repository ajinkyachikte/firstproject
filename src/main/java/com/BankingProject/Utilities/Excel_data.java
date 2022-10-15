package com.BankingProject.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_data {
	public static String getdata(int i, int j) throws IOException {
		
	
	File file =new File ("C:/Users/user/OneDrive/Documents/New Microsoft Excel Worksheet1.xlsx");
	FileInputStream inputStream = new FileInputStream (file);
	
	@SuppressWarnings("resource")
	XSSFWorkbook wb =new XSSFWorkbook(inputStream);
	
	XSSFSheet sheet=wb.getSheet("sheet1");
	
	XSSFRow row2=sheet.getRow(i);
	
	XSSFCell cell=row2.getCell(j);
	String data =cell.getStringCellValue();
	
	return data;
	}
	
	

}

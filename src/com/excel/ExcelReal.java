package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReal {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		File f1 = new File("C:\\Users\\user\\workspace\\imp_IQ\\excel\\sampleTest.xlsx");
		
		FileInputStream fis = new FileInputStream(f1);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("TestData");
		
		String data0 = 	sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data from Excel:"+data0);
		
		String data1 = 	sheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("Data from Excel:"+data1);
		
		
		int rowcount = sheet.getLastRowNum();
		
		System.out.println("Total rows is :"+rowcount+1);
		
		for(int i=0;i<rowcount;i++)
		{
			String data2 = sheet.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("Data from row:"+data2);
		}
		
		workbook.close();

	}

}

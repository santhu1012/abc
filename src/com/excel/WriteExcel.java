package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		File f1 = new File("C:\\Users\\user\\workspace\\imp_IQ\\excel\\sampleTest.xlsx");
		
		FileInputStream fis = new FileInputStream(f1);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("TestData");
		
		sheet.getRow(0).createCell(2).setCellValue("pass");
		
		sheet.getRow(1).createCell(2).setCellValue("fail");
		
		sheet.getRow(2).createCell(2).setCellValue("14.2");
		
		FileOutputStream fio = new FileOutputStream(f1);
		
		workbook.write(fio);
		
		workbook.close();

	}

}

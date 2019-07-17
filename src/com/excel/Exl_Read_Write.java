package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exl_Read_Write 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		File f1 = new File("C:\\Users\\user\\workspace\\imp_IQ\\excel\\sampleTest.xlsx");
		
		FileInputStream fis = new FileInputStream(f1);
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet= book.getSheet("TestData");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(1);
		
		System.out.println(cell.getStringCellValue());
		
		cell = row.getCell(0);
		System.out.println(cell.getNumericCellValue());
		fis.close();
		
		FileOutputStream fio = new FileOutputStream(f1);
		row.createCell(2).setCellValue("pass");
		book.write(fio);
		fio.close();

	}

}

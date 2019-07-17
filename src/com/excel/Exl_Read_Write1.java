package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exl_Read_Write1 {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		
        File f1 = new File("C:\\Users\\user\\workspace\\imp_IQ\\excel\\sampleTest.xlsx");
		
		FileInputStream fis = new FileInputStream(f1);
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet= book.getSheet("TestData");
		
		XSSFRow row;
		XSSFCell cell;
		
		System.out.println(sheet.getLastRowNum());
		
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			row = sheet.getRow(i);
			cell = row.getCell(0);
			System.out.println(cell.getNumericCellValue());
			cell = row.getCell(1);
			System.out.println(cell.getStringCellValue());
			cell = row.createCell(2);
			cell.setCellValue("PASS");
		}
		
		FileOutputStream fio = new FileOutputStream(f1);
		book.write(fio);
		fis.close();
		fio.close();

	}

}

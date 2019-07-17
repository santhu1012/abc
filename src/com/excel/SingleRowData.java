package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SingleRowData
{

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("C:\\Users\\user\\workspace\\imp_IQ\\excel\\sampleTest.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet  = workbook.getSheetAt(0);
	//	String username = sheet.getCellComment(arg0)
		
		

	}

}

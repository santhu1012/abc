package com.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_To_Excel 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Blank Workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//Create a blank sheet
		XSSFSheet sheet = workbook.createSheet("TestData");
		
		//This data needs to be written (object[])
		Map<String,Object[]> data = new TreeMap<String,Object[]>();
		data.put("1", new Object[] {"ID","NAME","LASTNAME"});
		data.put("2", new Object[] {1 , "Santhosh","Gowda"});
		data.put("3", new Object[] {2,"Dinesh","vishwanath"});
		data.put("4", new Object[] {3,"sarvesh","ananda"});
		data.put("5", new Object[] {4,"harsha","Gowda"});
		
		
		//iterate over data and write to sheet
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for(String key : keyset)
		{
			Row row = sheet.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum = 0;
			for(Object obj : objArr)
			{
				Cell cell = row.createCell(cellnum++);
				if(obj instanceof String)
					cell.setCellValue((String)obj);
				else if(obj instanceof Integer)
					cell.setCellValue((Integer)obj);
			}
		}
		try
		{
			FileOutputStream out = new FileOutputStream(new File("C:\\Users\\user\\workspace\\imp_IQ\\excel\\sampleTest.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("sample test written successfully on desk");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}

package com.excel;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_In_All_formats 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		try
		{
			FileInputStream file = new FileInputStream("C:\\Users\\user\\workspace\\imp_IQ\\excel\\sampleTest.xlsx");
			
			
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			Iterator<Row> rowIterator = sheet.iterator();
			
			while(rowIterator.hasNext())
			{
				Row row = rowIterator.next();
				
				Iterator<Cell>  cellIterator = row.cellIterator();
				
				
				while(cellIterator.hasNext())
				{
					Cell cell = cellIterator.next();
					
					if(cell.getCellType()==cell.CELL_TYPE_STRING)
					{
					
						System.out.println(cell.getNumericCellValue() + "\t");
					}else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
					{	
						
						System.out.println(cell.getStringCellValue() + "\t");
						
						
					}	
						
					
				}
				System.out.println("");
			}
			
			file.close();
		}
		catch(Exception  e)
		{
			e.printStackTrace();
		}

	}

}

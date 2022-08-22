package com.cl.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;

	public ExcelDataProvider()
	{
		File src=new File("./TestData/Data.xlsx");
				try
		{
				FileInputStream fis=new FileInputStream(src);
				wb=new XSSFWorkbook(fis);
		} catch(Exception e)
		{
			System.out.println("Unable to read Excel File" + e.getMessage());
		}
		
		
	}
	
	public String getSringData(int SheetIndex, int row, int column)
	{
		return wb.getSheetAt(SheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getSringData(String SheetName, int row, int column)
	{
		return wb.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String SheetName, int row, int column)
	{
		return wb.getSheet(SheetName).getRow(row).getCell(column).getNumericCellValue();
	}
}

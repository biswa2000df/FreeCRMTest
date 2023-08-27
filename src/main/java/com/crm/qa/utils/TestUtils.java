package com.crm.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.crm.qa.base.TestBase;

public class TestUtils extends TestBase {
	
	public TestUtils() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static long PAGE_LODE_TIMEOUT=20;
	public static long IMPLICITY_WAIT=10;
	
	
	public void frameSwitch() {
		
		driver.switchTo().frame(0);	
	}
	
	
	public Object[][] readDatafromexcel(String sheetname) throws IOException {
		
		FileInputStream fs=new FileInputStream("hello.xlsx");//create file input stream object and add excelsheet path
		
		XSSFWorkbook workbook=new XSSFWorkbook(fs);  //to create the xssfworkbook object
		
		XSSFSheet sheet=workbook.getSheet(sheetname);  //get the sheetname
		
		int rows=sheet.getLastRowNum();
		
		int cols=sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		
		return data;
		
		
		
		
	}
	
	

}

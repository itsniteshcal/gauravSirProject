package com.actitime.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author nitish
 * This generic class is used to handle files like excel file,property file
 */
public class FibLib {
	/**
	 * This generic reusable method is used to read the data from the excel file
	 * @param path
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws Throwable
	 */
	public static String getCellData(String path,String sheet,int row,int cell) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String excelValue = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return excelValue;
	}
/**
 * This generic reusable method is used to count the number of rows present in excelSheet
 * @param path
 * @param sheet
 * @return
 * @throws Throwable
 */
public static int getRowCount(String path,String sheet) throws Throwable 
{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	int rowCount = wb.getSheet(sheet).getLastRowNum();
	return rowCount;
	}
/**
 *  This generic reusable method is used to read the data from property file
 * @param propPath
 * @param key
 * @return
 * @throws Throwable
 */
public String getPropKeyValue(String propPath,String key) throws Throwable {
	FileInputStream fis=new FileInputStream(propPath);
	Properties prop = new Properties();
	prop.load(fis);
	String PropValue = prop.getProperty(key, "Not a Valid Key");
	return PropValue;
	
}
/**
 *This generic reusable method is used to write the data into excel file 
 * @param path
 * @param sheet
 * @param row
 * @param cell
 * @param giveInput
 * @throws Throwable
 */
public void writeDataIntoExcel(String path,String sheet,int row,int cell,String giveInput) throws Throwable {
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(giveInput);
	FileOutputStream fos = new FileOutputStream(path);
	wb.write(fos);
	wb.close();
	System.out.println("done..........");
	
	
}


}
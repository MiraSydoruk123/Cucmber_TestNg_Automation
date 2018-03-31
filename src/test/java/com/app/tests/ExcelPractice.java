package com.app.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {
	public static void main(String[] args) throws IOException {
		File file = new File("FirstSheet.xlsx");//give a path
		System.out.println(file.exists());
		FileInputStream input = new FileInputStream(file);// actually opens a file 
		XSSFWorkbook wBook = new XSSFWorkbook(input);//having a file it self, loading it to a class XSSFWorkbook
		XSSFSheet sheet = wBook.getSheet("Sheet1");//what sheet do you want to point
		XSSFRow row1 = sheet.getRow(0);//
		XSSFCell cell1 = row1.getCell(0);
		
		System.out.println(sheet.getRow(0).getCell(1));
		System.out.println(cell1);
		
		XSSFCell cellToChange = sheet.getRow(1).getCell(3);
		System.out.println("Before: "+ cellToChange);
		cellToChange.setCellValue("221134928");
		
		FileOutputStream output = new FileOutputStream(file);
		wBook.write(output);
		output.close();
		
		
	}

}

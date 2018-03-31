package com.app.tests;

import com.app.utilities.ExcelUtils;

public class ExcelTest2 {
	public static void main(String[] args) {
		ExcelUtils.openExcelFile("FirstSheet.xlsx", "Sheet1");
		String data = ExcelUtils.getCellData(1, 12);
		System.out.println(data);
		
		ExcelUtils.setCellData("New Value", 1, 12);
		String data2 = ExcelUtils.getCellData(1, 12);
		System.out.println(data2);
	}

}

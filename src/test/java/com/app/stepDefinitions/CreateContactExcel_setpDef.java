package com.app.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.app.pages.SuiteCRMDashboardPage;
import com.app.utilities.Browser;
import com.app.utilities.ExcelUtils;

import cucumber.api.java.en.Given;

public class CreateContactExcel_setpDef {
	SuiteCRMDashboardPage dsh = new SuiteCRMDashboardPage();
	String dastan = "hi";
	@Given("^I validate contacts with data in excel sheet \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_validate_contacts_with_data_in_excel_sheet_and(String path, String sheet) {
	   ExcelUtils.openExcelFile(path, sheet);
	   for(int i = 0; i< ExcelUtils.getUsedRowsCount(); i++) {
		   if(ExcelUtils.getCellData(i, 1).equals("y")) {
			   dsh.search.click();
			  dsh.searchSendKeys.sendKeys(ExcelUtils.getCellData(i, 0)+Keys.ENTER);
			  String xpath = "//table[@class='list View']//a[.='"+ExcelUtils.getCellData(i, 0)+"']";
			List <WebElement> list = Browser.getDriver().findElements(By.xpath(xpath)); 
			if(list.size() > 0) {
				ExcelUtils.setCellData("pass", i, 2);
			}
			else {
				ExcelUtils.setCellData("fail", i, 2);
			}
			
		   }
		   else {
			   ExcelUtils.setCellData("Skipped", i, 2);
		   }
	   }
	}

}

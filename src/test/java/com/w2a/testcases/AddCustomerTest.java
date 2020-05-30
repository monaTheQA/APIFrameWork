package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.BaseClass;

public class AddCustomerTest  extends BaseClass{
	@Test(dataProvider="getData")
	public void addCustomerTest(String firstName, String lastName, String postCode) {
		driver.findElement(By.xpath(OR.getProperty("addCustomer"))).click();
		driver.findElement(By.xpath(OR.getProperty("firstname"))).sendKeys(firstName);;
		driver.findElement(By.xpath(OR.getProperty("lastname"))).sendKeys(lastName);
		driver.findElement(By.xpath(OR.getProperty("postcode"))).sendKeys(postCode);
		driver.findElement(By.xpath(OR.getProperty("addCustomerBtn"))).click();
		
	}
	@DataProvider
	public Object[][] getData(){
		String sheetName= "AddCustomerTest";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][cols];
		
		for(int rowNum=2; rowNum<=rows; rowNum++) {
			for(int colNum=0; colNum<cols;colNum++) {
				data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		return data;
	}
}

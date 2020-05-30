package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.BaseClass;

public class BankManagerLoginTest extends BaseClass{
	
	@Test(dataProvider="getData")
	public void loginBankManager(String firstName, String lastName, String postCode) throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("bml"))).click();
		Assert.assertEquals(OR.getProperty("addCustomer"), "/html/body/div[3]/div/div[2]/div/div[1]/button[1]");
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("addCustomer"))).click();
		driver.findElement(By.xpath(OR.getProperty("firstname"))).sendKeys(firstName);
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("lastname"))).sendKeys(lastName);
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("postcode"))).sendKeys(postCode);
		Thread.sleep(3000);
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

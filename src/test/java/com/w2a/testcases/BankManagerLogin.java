package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.BaseClass;

public class BankManagerLogin extends BaseClass{
	@Test
	public void loginBankManager() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("bml"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("addCustomer"))).click();
		Thread.sleep(3000);
		log.debug("Login successfully");

	}
	
	
}

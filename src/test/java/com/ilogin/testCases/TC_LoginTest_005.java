package com.ilogin.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ilogin.pageObjects.LoginPage;

public class TC_LoginTest_005 extends BaseClass{

	// Verify if the login lands in home page
	@Test
	public void landingPage() throws IOException {
		
		logger.info("url is opened");
		
		 LoginPage lp = new LoginPage(driver);
		 
		 lp.setUserName(username);
		 lp.setPassword(password);
		 
		 lp.clickSubmit();
		 
		 if(driver.getTitle().equals("Swag Labs")) {
			 Assert.assertTrue(true);
			 logger.info("landed on home page");
		 }
		 else {
			 captureScreen(driver,"LoginTest");
			 Assert.assertTrue(false);
			 logger.warn("login failed");
		 }
	}
}

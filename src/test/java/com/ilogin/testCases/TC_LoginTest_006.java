package com.ilogin.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ilogin.pageObjects.LoginPage;

public class TC_LoginTest_006 extends BaseClass{

	// Verify if the logout redirects to login page
	@Test
	public void landingPage() throws IOException, InterruptedException {
		logger.info("url is opened");
		
		 LoginPage lp = new LoginPage(driver);
		 
		 lp.setUserName(username);
		 lp.setPassword(password);
		 
		 lp.clickSubmit();
		 Thread.sleep(2000);
		 lp.clickLogout();
		 
		 if(lp.txtPassword.isDisplayed()) {
			 Assert.assertTrue(true);
			 logger.info("redirected to login page");
		 }
		 else {
			 captureScreen(driver,"LoginTest");
			 Assert.assertTrue(false);
			 logger.warn("logout did not redirect to login");
		 }
	}
}

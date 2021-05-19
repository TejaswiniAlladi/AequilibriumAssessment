package com.ilogin.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ilogin.pageObjects.LoginPage;
import com.ilogin.testCases.BaseClass;

public class TC_LoginTest_001 extends BaseClass{

	// Verify if the user is able to login successfully
	@Test
	public void loginTest() throws IOException{
				
		logger.info("url is opened");
		
		 LoginPage lp = new LoginPage(driver);
		 
		 lp.setUserName(username);
		 lp.setPassword(password);
		 
		 lp.clickSubmit();
		 
		 logger.info("clicked on login");
		 
		 logger.info("login success");
	}
}

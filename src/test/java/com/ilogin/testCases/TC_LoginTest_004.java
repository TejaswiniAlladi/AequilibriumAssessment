package com.ilogin.testCases;

import org.testng.annotations.Test;

import com.ilogin.pageObjects.LoginPage;

public class TC_LoginTest_004 extends BaseClass{

	// Verify the login page by pressing ‘Back button’ of the browser. 
	// It should not allow you to enter into the system once you log out.
	@Test
	public void browserNav() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		
		 lp.setUserName(username);
		 lp.setPassword(password);
		 
		 lp.clickSubmit();
		 
		 lp.clickLogout();
		 
		 driver.navigate().back();
		 Thread.sleep(3000);
	}
}

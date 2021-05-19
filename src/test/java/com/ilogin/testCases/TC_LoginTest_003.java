package com.ilogin.testCases;

import org.testng.annotations.Test;

import com.ilogin.pageObjects.LoginPage;

public class TC_LoginTest_003 extends BaseClass{

	// Verify if the password is in masked format
	@Test
	public void maskPwd() {
	LoginPage lp = new LoginPage(driver);
	
	if (lp.txtPassword.getAttribute("type") == "password"){
		logger.info("password is masked");
	}else {
		logger.warn("password is unmasked");
	}
}
}

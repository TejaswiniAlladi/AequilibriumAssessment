package com.ilogin.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ilogin.pageObjects.LoginPage;
import com.ilogin.utilities.XLUtils;

public class TC_LoginTest_002 extends BaseClass{

	// Verify if a user will be able to login with a valid username and valid password
	// Verify if a user cannot login with a valid username and an invalid password and vice-versa
	// Verify the login page for one or both the fields is blank and Login button is clicked
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.reset();
		lp.setUserName(user);
		logger.info("user name provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickSubmit();
		
		Thread.sleep(2000);
		
		if(driver.getTitle().equals("Swag Labs")) {
			 Assert.assertTrue(true);
			 logger.info("login success");
			 lp.clickLogout();
		 }
		 else {
			 captureScreen(driver,"LoginTest");
			 Assert.assertTrue(false);
			 logger.warn("login failed");
		 }
		 
		
	}
	
	// Fetch credentils from excel sheet in testData package
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException{
		String path = System.getProperty("user.dir")+"/src/test/java/com/ilogin/testData/LoginDetails.xlsx";
		
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}
}

package com.ilogin.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	// Login page constructor
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	// Identify web elements in login page
	@FindBy(id="user-name")
	WebElement txtUserName;
	
	@FindBy(id="password")
	public
	WebElement txtPassword;
	
	@FindBy(id="login-button")
	WebElement btnLogin;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement btnMenu;
	
	@FindBy(id="logout_sidebar_link")
	WebElement btnLogout;
	
	// Action methods for feilds to pass inputs to elements identified
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit() {
		btnLogin.click();
	}
	
	public void  clickLogout() {
		btnMenu.click();
		btnLogout.click();
	}
	
	public void reset() {
		txtUserName.clear();
		txtPassword.clear();
	}
	
}

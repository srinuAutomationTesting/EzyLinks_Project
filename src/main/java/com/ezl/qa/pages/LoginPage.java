package com.ezl.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ezl.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	
	// Page Factory - OR

	@FindBy(id="txtUserName")
     WebElement username;
	
	@FindBy(id="txtPassword")
    WebElement password;
	

	@FindBy(xpath="//button[@id='btnLogin']")
    WebElement login;
	
	@FindBy(xpath="//span[contains(@title,'Bristol Quality')]")
    WebElement clickOnButtonForLogoutLink;
	
	@FindBy(xpath="//a[@id='LogoutLink' and @role='menuitem']")
    WebElement logoutLink;
	

	@FindBy(xpath="//img[@alt='EZLynx']")
    WebElement logo;
	
		//Initilaization the OR

	public LoginPage() throws IOException {

		PageFactory.initElements(driver, this);
		
	}

	//Action Methods()
	
	public String validateTitle() {
		return driver.getTitle();
		
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String un,String pwd) throws IOException, InterruptedException {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click(); // After clicking on Login Button it's moveing to HomePage
		Thread.sleep(3000);
		return new HomePage();
		
	}
	 
	
	
}

package com.ezl.qa.testcases;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ezl.qa.base.BaseClass;
import com.ezl.qa.pages.HomePage;
import com.ezl.qa.pages.LoginPage;

public class LoginPageTest extends BaseClass  {
	
	
	public static LoginPage loginPage ;
	public static HomePage homePage;
	
	
	
	public LoginPageTest() throws IOException {
		super();
	
	}
	
@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		loginPage = new LoginPage();
	}
	
@Test(priority=1)
public void validateTitleTest() {
	String title =loginPage.validateTitle();
	Assert.assertEquals(title, "EZLynx - Login");
	
	
}
@Test(priority=2)
public void validateLogoTest() {
	boolean logo1 = loginPage.validateLogo();
	Assert.assertTrue(logo1);
}
@Test(priority=3)
public void loginTest() throws IOException, InterruptedException {
	
	homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
}  

@AfterMethod
public void closeBrowser() {
	driver.close();
}


}

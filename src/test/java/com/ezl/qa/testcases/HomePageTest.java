package com.ezl.qa.testcases;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ezl.qa.base.BaseClass;
import com.ezl.qa.pages.HomePage;
import com.ezl.qa.pages.LoginPage;
import com.ezl.qa.pages.PersonalLinesApplicantPage;
import com.ezl.qa.util.TestUtil;

public class HomePageTest extends BaseClass {
	
	public static LoginPage loginPage ;
	public static HomePage homePage;
	public static TestUtil testUtil;


	public HomePageTest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		initialization();
		loginPage = new LoginPage();//we can access login page methods
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		//testUtil = new TestUtil();
		//homePage = new HomePage();
	}

//	@Test(priority=1)
//	public void validateHomePageTitleTest() {
//		String title = homePage.validateHomePageTitle();
//	
//		Assert.assertEquals(title, "EZLynx - Dashboard");
//	}

	@Test(priority=1)
	public void movingcursorOnObjectTest() throws InterruptedException, IOException {
		
	//testUtil.switchToFrame();
		
	homePage.movingcursorOnObject();
	
	
		System.out.println("clicked");

	}
	
	

	@AfterMethod
	public void closeBrowser() {
		//driver.close();
	}

}

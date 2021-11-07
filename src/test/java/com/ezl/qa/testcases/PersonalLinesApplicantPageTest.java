package com.ezl.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ezl.qa.base.BaseClass;
import com.ezl.qa.pages.HomePage;
import com.ezl.qa.pages.LoginPage;
import com.ezl.qa.pages.PersonalLinesApplicantPage;

public class PersonalLinesApplicantPageTest extends BaseClass {

	public static LoginPage loginPage;
	public static HomePage homePage;
	public PersonalLinesApplicantPage pla;

	public PersonalLinesApplicantPageTest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		initialization();
		loginPage = new LoginPage();// we can access login page methods
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

		homePage = new HomePage();
		homePage.movingcursorOnObject();

		pla = new PersonalLinesApplicantPage();

	}

	@Test(priority = 1)
	public void ApplicationInfoFieldsTest() throws InterruptedException, IOException {

		pla.ApplicationInfoFields();

	}

}

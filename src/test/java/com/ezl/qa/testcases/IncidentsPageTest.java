package com.ezl.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ezl.qa.base.BaseClass;
import com.ezl.qa.pages.DriversPage;
import com.ezl.qa.pages.HomePage;
import com.ezl.qa.pages.IncidentsPage;
import com.ezl.qa.pages.LoginPage;
import com.ezl.qa.pages.PersonalLinesApplicantPage;
import com.ezl.qa.pages.PolicyInfoPage;
import com.ezl.qa.pages.VehiclePage;

public class IncidentsPageTest extends BaseClass {
	
	
	public static LoginPage loginPage;
	public static HomePage homePage;
	public PersonalLinesApplicantPage pla;
	public static PolicyInfoPage pip;
	public static DriversPage driverpage;
	public static VehiclePage vPage;
	public static IncidentsPage ipage;
	

	public IncidentsPageTest() throws IOException {
		super();
		
	}
	
	
	@BeforeMethod()
	public void setUP() throws IOException, InterruptedException {

		initialization();

		loginPage = new LoginPage();// we can access login page methods
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

		homePage = new HomePage();
		homePage.movingcursorOnObject();

		pla = new PersonalLinesApplicantPage();
		pla.ApplicationInfoFields();

		pip = new PolicyInfoPage();
		pip.policyInfoFields();

		driverpage = new DriversPage();
		driverpage.driverFields();

		vPage = new VehiclePage();
		vPage.vehicleFields();
		
		ipage = new IncidentsPage();
		

	}

	@Test
	public void incidentsFieldsTest() throws InterruptedException, IOException {

		ipage.violationFields();
	}
}

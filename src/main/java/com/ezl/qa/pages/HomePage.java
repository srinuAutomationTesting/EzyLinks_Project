package com.ezl.qa.pages;

import java.io.IOException;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.ezl.qa.base.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//div[@title='Applicants']")
	WebElement applicants;

	@FindBy(linkText = "Create New Applicant")
	WebElement createNewApplicants;
	
	
	

	public HomePage() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}

	public String validateHomePageTitle() {

		return driver.getTitle();

	}

	public PersonalLinesApplicantPage movingcursorOnObject() throws InterruptedException, IOException {

		Actions action = new Actions(driver);

		action.moveToElement(applicants).build().perform();
		Thread.sleep(2000);

		createNewApplicants.click();
		
		
	return new PersonalLinesApplicantPage();

	}
	
	
}



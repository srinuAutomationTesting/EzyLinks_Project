package com.ezl.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ezl.qa.base.BaseClass;

public class IncidentsPage extends BaseClass {

	// Locators

//AddViolation button	

	@FindBy(xpath = "//span[text()=' Add Violation ']")

	WebElement addViolationButton;

//Date
	@FindBy(xpath = "//input[@id='violationDate-0']")

	WebElement date;

//Driverselection
	@FindBy(xpath = "//label[@aria-owns='violation-driver-0']")

	WebElement driverSelection;

//Driver1
	@FindBy(xpath = "//span[text()='1: srinu bwtestb']")

	WebElement driver1;

//Discription selection

	@FindBy(xpath = "//label[@aria-owns='violationDescription-0']")

	WebElement discriptionSel;

//carelessDriving
	@FindBy(xpath = "//span[text()=' Careless Driving ']")

	WebElement cDriving;

//coverage button
	@FindBy(xpath = "//span[text()=' Coverage ']")

	WebElement covButton;

	public IncidentsPage() throws IOException {

		PageFactory.initElements(driver, this);
	}

	public CoveragePage violationFields() throws IOException {
		
		addViolationButton.click();
		date.sendKeys("11/1/2021");
		
		
		    
		WebElement drivSel = driverSelection;
	     JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();",drivSel );
			driver1.click();
			
			WebElement disSel = discriptionSel;
		     JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].click();",disSel );
				cDriving.click();
			
		//driverSelection.click();
		//driver1.click();
			
			
			
		//discriptionSel.click();
		//cDriving.click();
		covButton.click();
		
		return new CoveragePage();
		
		
		
		
		
		
		
		
	}
	
}

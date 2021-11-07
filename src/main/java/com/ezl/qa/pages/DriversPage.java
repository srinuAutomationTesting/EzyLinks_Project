package com.ezl.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ezl.qa.base.BaseClass;

public class DriversPage extends BaseClass {

	@FindBy(xpath = "//span[text()='Student']")
	WebElement occIndustry;

	@FindBy(xpath = "//span[text()='Other ']")
	WebElement occTitle;

	@FindBy(xpath = "//span[text()=' Add Driver ']//parent::button[@id='add-driver-btn']")
	WebElement addDriver;

	@FindBy(xpath = "//*[@id=\"driver-1-first-name\"]")
	WebElement firstName;

	@FindBy(xpath = "//input[contains(@id,'driver-1-last-name')]")
	WebElement lastName;

	@FindBy(xpath = "//input[contains(@id,'driver-1-dob')]")
	WebElement dob;

	@FindBy(xpath = "//mat-option[contains(@id,'mat-option')]/span[text()='Male']")
	WebElement male;

	@FindBy(xpath = "//span[text()=' Single ']")
	WebElement ms;

	@FindBy(xpath = "//span[text()=' Other ']")
	WebElement relationship;
	
	@FindBy(xpath = "//mat-option[contains(@id,'mat-option')]/span[text()='Student']")
	WebElement occIndustry1;

	@FindBy(xpath = "//mat-option[contains(@id,'mat-option')]/span[text()='High school ']")
	WebElement occTitle1;
	
	@FindBy(xpath = "//span[text()=' Vehicles ']")
	WebElement vehicle;


	public DriversPage() throws IOException {

		PageFactory.initElements(driver, this);

	}

	public VehiclePage driverFields() throws InterruptedException, IOException {

		
		// occupationIndustry
				WebElement occupationIndustry = driver
						.findElement(By.xpath("//label[@aria-owns='driver-0-occupationIndustry']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", occupationIndustry);
				occIndustry.click();

				// ocupationTitle
				WebElement ocupationTitle = driver.findElement(By.xpath("//label[@aria-owns='driver-0-occupationTitle']"));
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].click();", ocupationTitle);
				occTitle.click();
				Thread.sleep(2000);
		
		
		//Adddriver
		
		WebElement addingDriver = addDriver;
		JavascriptExecutor js32 = (JavascriptExecutor) driver;
		js32.executeScript("arguments[0].click();", addingDriver);
		Thread.sleep(2000);
        //addDriver.click();
		
		
	
	

		// firstName
	
      
		firstName.sendKeys("vikram");

		// lastName
		lastName.sendKeys("bwtestb");

		// DOB
		dob.sendKeys("10/20/2005");

		// Gender

		WebElement gender = driver.findElement(By.xpath("//label[@aria-owns='driver-1-gender']"));
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();", gender);
		male.click();

		// Marrital Status

		WebElement mStatus = driver.findElement(By.xpath("//label[@aria-owns='driver-1-maritalStatus']"));
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("arguments[0].click();", mStatus);
		ms.click();

		// Relarionship

		WebElement relation = driver.findElement(By.xpath("//label[@aria-owns='driver-1-relationship']"));
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("arguments[0].click();", relation);
		relationship.click();

		// occupationIndustry1
		
		WebElement occupationIndustry1 = driver
				.findElement(By.xpath("//label[@aria-owns='driver-1-occupationIndustry']"));
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("arguments[0].click();", occupationIndustry1);
		occIndustry1.click();
		

		// ocupationTitle1
		WebElement ocupationTitle1 = driver.findElement(By.xpath("//label[@aria-owns='driver-1-occupationTitle']"));
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript("arguments[0].click();", ocupationTitle1);
		occTitle1.click();
		Thread.sleep(2000); 
		

		//Vehicles
		
		vehicle.click();
		
	     return new VehiclePage();

	}

}

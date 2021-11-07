package com.ezl.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ezl.qa.base.BaseClass;

public class PersonalLinesApplicantPage extends BaseClass {

	@FindBy(xpath = "//input[@id='applicant-first-name']")
	WebElement firstName11;

	@FindBy(xpath = "//input[@id='applicant-last-name']")
	WebElement lastName11;

	@FindBy(xpath = "//span[text()='FL']")
	WebElement addressState;

	@FindBy(xpath = "//input[@name='postalCode']")
	WebElement postalCode;

	@FindBy(xpath = "//span[text()='Male']")
	WebElement genderr;

	@FindBy(xpath = "//input[@id='applicant-date-of-birth']")
	WebElement dob;

	@FindBy(xpath = "//span[text()=' Single ']")
	WebElement mStatuss;

	@FindBy(xpath = "//span[text()='Student']")
	WebElement industryy;

	@FindBy(xpath = "//input[@id='applicant-primary-address-address1']")
	WebElement address;

	@FindBy(xpath = "//input[@id='applicant-primary-address-addressCity']")
	WebElement city;

	@FindBy(xpath = "//span[text()='Gulf']")
	WebElement countryy;

	@FindBy(xpath = "//*[@id=\"applicant-primary-address-postalCode\"]")
	WebElement postalCodee;

	@FindBy(xpath = "//span[text()='4 ' ]")
	WebElement years;

	@FindBy(xpath = "//input[@id='Home_PhoneType-number']")
	WebElement phoneNum;

	@FindBy(xpath = "//span[text()=' Save ']")
	WebElement save;

	@FindBy(xpath = "//span[contains(text(),'Go to Auto')]")
	WebElement gotoAuto;
	
	@FindBy(xpath = "//span[text()=' Policy Info ']")
	WebElement policyInfo;
	
	

//	@FindBy(xpath="//*[@id=\"Header\"]/div/div[2]/ez-avatar/span")
//	WebElement bq;
//	
//	@FindBy(xpath="//div[@class='mat-ripple mat-menu-ripple']//parent::a[@id='LogoutLink']")
//	WebElement logoutLink;

	public PersonalLinesApplicantPage() throws IOException {

		PageFactory.initElements(driver, this);

	}

	public PolicyInfoPage ApplicationInfoFields() throws InterruptedException, IOException {

		// firstname and lastname

		firstName11.sendKeys("srinu");
		lastName11.sendKeys("bwtestb");

		// address State

		WebElement addState = driver.findElement(By.xpath("//label[@aria-owns='applicant-rating-state']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addState);
		addressState.click();

		// postal code
		postalCode.sendKeys("33853");

		// Gender

		WebElement gender = driver.findElement(By.xpath("//label[@aria-owns='applicant-gender']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", gender);
		genderr.click();

		// DOB

		dob.sendKeys("1/2/2002");

		// Marital Status

		WebElement mStatus = driver.findElement(By.xpath("//mat-select[@id='applicant-marital-status']"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", mStatus);
		Thread.sleep(2000);
		mStatuss.click();

		// Industry

		
		try {
		WebElement industry = driver.findElement(By.xpath("//label[@aria-owns='applicant-industry']"));
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();", industry);
		industryy.click();
		}catch(org.openqa.selenium.StaleElementReferenceException ex){
			WebElement industry = driver.findElement(By.xpath("//label[@aria-owns='applicant-industry']"));
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("arguments[0].click();", industry);
			industryy.click();	
		}

		// Address
		address.sendKeys("411 Emerald Ave Lake Wales");

		// City
		city.sendKeys("Wales");

		// country
		WebElement country = driver
				.findElement(By.xpath("//label[@aria-owns='applicant-primary-address-addressCounty']"));
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("arguments[0].click();", country);
		countryy.click();

		// postalCode
		postalCodee.sendKeys("33853");

		// years at address
		WebElement yaaddress = driver
				.findElement(By.xpath("//label[@aria-owns='applicant-primary-address-yearsAtAddress']"));
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("arguments[0].click();", yaaddress);
		years.click();

		// phoneNumber
		phoneNum.sendKeys("9876543210");

		// Save
		save.click();
		Thread.sleep(2000);

		// GotoAuto

		gotoAuto.click();

		Thread.sleep(2000);
		

		//Enable BristolWest
		
		WebElement enableButton = driver.findElement(By.xpath("//span[text()='Bristol West']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",enableButton );
		Thread.sleep(2000);
		
		//policyInfo
		
		policyInfo.click();
		
		return new PolicyInfoPage();
		
		
		
		

		// logout
//		bq.click();
//		logoutLink.click();
//		

	}
}

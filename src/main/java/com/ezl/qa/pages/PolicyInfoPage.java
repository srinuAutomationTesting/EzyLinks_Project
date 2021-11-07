package com.ezl.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ezl.qa.base.BaseClass;

public class PolicyInfoPage extends BaseClass{
	
	@FindBy(xpath = "//span[contains(text(),'No Prior Insurance ')]")
	WebElement policyCarrierr;
	

	@FindBy(xpath = "//span[contains(text(),' Driving A Car Owned By A Relative ')]")
	WebElement reasonNoPriorr;
	
	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	WebElement creditCheck;
	
	
	@FindBy(xpath = "//span[contains(text(),'6 Month')]")
	WebElement policyTerm;
	
	@FindBy(xpath = "//mat-option[contains(@id,'mat-option-')]/span[text()='Yes']")
	WebElement packagee;
	
	@FindBy(xpath = "//input[@id='effectiveDateNewPolicy']")
	WebElement effDate;
	
	@FindBy(xpath = "//div[contains(@id,'emailBridge-panel')]/mat-option/span[text()='Yes']")
	WebElement carrierQuestions;
	
	@FindBy(xpath = "//span[text()=' Drivers ']")
	WebElement drivers;
	
	
	
	
	public PolicyInfoPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public DriversPage policyInfoFields() throws IOException, InterruptedException {
		
		//policyCarrier
		
		WebElement policyCarrier = driver.findElement(By.xpath("//label[@aria-owns='priorCarrier']"));
		JavascriptExecutor js7 = (JavascriptExecutor)driver;
		js7.executeScript("arguments[0].click()", policyCarrier);
		policyCarrierr.click();
		
		//ReasonNoPriorr
		
		WebElement reasonNoPrior = driver.findElement(By.xpath("//label[@aria-owns='reasonNoPrior']"));
		JavascriptExecutor js8 = (JavascriptExecutor)driver;
		js8.executeScript("arguments[0].click()",reasonNoPrior );
		reasonNoPriorr.click();
		
		//CreditCheckAuthorized
		
		WebElement 	creditCheckAuthorized = driver.findElement(By.xpath("//label[@aria-owns='creditCheckAuthorized']"));
		JavascriptExecutor js9 = (JavascriptExecutor)driver;
		js9.executeScript("arguments[0].click()",creditCheckAuthorized  );
		creditCheck.click();
		
		//NewPolicyTerm
		
		WebElement 	newPolicyTerm = driver.findElement(By.xpath("//label[@aria-owns='newPolicyTerm']"));
		JavascriptExecutor js10 = (JavascriptExecutor)driver;
		js10.executeScript("arguments[0].click()",newPolicyTerm  );
		policyTerm.click();
		
		//Package
		
		WebElement 	package1 = driver.findElement(By.xpath("//label[@aria-owns='package']"));
		JavascriptExecutor js11 = (JavascriptExecutor)driver;
		js11.executeScript("arguments[0].click()",package1);
		packagee.click();
		
		//Eff date
		
		effDate.sendKeys("11/2/2021");
		
		//Additional Carrier Quetions
		
		WebElement 	sites = driver.findElement(By.xpath("//span[text()='No']"));
		JavascriptExecutor js12 = (JavascriptExecutor)driver;
		js12.executeScript("arguments[0].click()",sites);
	    carrierQuestions.click();
	    
	    
	    drivers.click();
	    Thread.sleep(2000);
	    
	    return new DriversPage();
		
		
		
		
	}

}

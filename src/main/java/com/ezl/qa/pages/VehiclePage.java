package com.ezl.qa.pages;

import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ezl.qa.base.BaseClass;

public class VehiclePage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"VIN-0\"]")
	
	WebElement vin;
	
	//1N4AL3AP8DN468498
	
   @FindBy(xpath="//div[contains(@class,'-inserted')]//child::button[@id='vin-lookup-btn-0']//span//mat-icon[text()='search']")
	
	WebElement search;
   
   //PurchaseDate
   
   @FindBy(xpath="//input[@id='vehiclePurchaseDate-0']")
	
	WebElement date;
   

   
   //vehicle use
   
   @FindBy(xpath="//label[@aria-owns='selected-use-0']")
	
	WebElement vehicleuse;
   
   @FindBy(xpath="//span[text()='Pleasure']")
	
  	WebElement pleasure;
   
   //Anual miles
   
   
//   @FindBy(xpath="//label[@aria-owns='annual-miles-0']")
//	
// 	WebElement annnualmiles;
   
   @FindBy(xpath="//*[@id=\"annual-miles-0\"]")
	
	WebElement miles;
   
   @FindBy(xpath="//*[@id=\"annual-miles-0\"]")
	
	WebElement dropup;
   
 //*[@id="annual-miles-0"]
 
   //incidentsPage
   
   
   @FindBy(xpath="//span[text()=' Incidents ']")
	
 	WebElement incidentPage;
   
   //Ownershiptype
   
   @FindBy(xpath="//label[@aria-owns='selected-ownershipType-0']")
	
	WebElement owner;
   
   @FindBy(xpath="//span[text()='Owned ']")
	
	WebElement own;
   
 
   


	public VehiclePage() throws IOException {
		
		PageFactory.initElements(driver,this);
		
		
	}

	public IncidentsPage  vehicleFields() throws InterruptedException, IOException {
		
		//vin
		
		
		
		
	
	vin.sendKeys("1N4AL3AP8DN468498");
    
       
       //searchbutton
       
       
       search.click();
       
       Thread.sleep(3000);
       
       //date
       
       date.sendKeys("10/14/2021");
       
       //vehicleuUse
       
       WebElement vehicleUse = vehicleuse;
       
       JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", vehicleUse);
		pleasure.click();
		Thread.sleep(4000);
		
		//Annnualmiles
		
	   
	    
		    
     Actions action = new Actions(driver);
     action.moveToElement(dropup);
     action.build().perform();
     action.sendKeys("1000");
  
		
		
		
		//OwnershipType
		
		 
	       WebElement OwnershipType = owner;
	       
	       JavascriptExecutor js11 = (JavascriptExecutor) driver;
			js11.executeScript("arguments[0].click();", OwnershipType);
			own.click();
		
		//IncidentPage
		
		incidentPage.click();
		
		return new IncidentsPage();
		
	}
	
	
	
}

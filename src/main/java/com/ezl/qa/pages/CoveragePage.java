package com.ezl.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ezl.qa.base.BaseClass;

public class CoveragePage extends BaseClass {

	// Locators

	// BI
	@FindBy(xpath = "//label[@aria-owns='bodily-injury']")

	WebElement biSel;

	@FindBy(xpath = "//span[text()=' 10/20 ']") 

	WebElement biVal;

	// PD
	@FindBy(xpath = "//label[@aria-owns='property-damage']")

	WebElement pdSel;

	@FindBy(xpath = "//span[text()=' 15000 ']")

	WebElement pdVal;

	// MP
	@FindBy(xpath = "//label[@aria-owns='medical-payments']")

	WebElement mpSel;

	@FindBy(xpath = "//span[text()=' 1000 ']")

	WebElement mpVal;

	// PIDed
	@FindBy(xpath = "//label[@aria-owns='FLPIPDeductible']")

	WebElement pidedSel;

	@FindBy(xpath = "//span[text()='250']")

	WebElement pideVal;

	// PIP
	@FindBy(xpath = "//label[@aria-owns='FLPIPOptions']")

	WebElement pipSel;

	@FindBy(xpath = "//span[text()='Basic']")

	WebElement pipVal;

	// WL
	@FindBy(xpath = "//label[@aria-owns='FLWageLoss']")

	WebElement wlSel;

	@FindBy(xpath = "//span[text()='Included']")

	WebElement wlVal;

	// PIPA
	@FindBy(xpath = "//label[@aria-owns='FLPIPApplies']")

	WebElement pipaSel;

	@FindBy(xpath = "//span[text()='Named Insured']")

	WebElement pipaVal;

	// residence
	@FindBy(xpath = "//label[@aria-owns='residence']")

	WebElement resSel;

	@FindBy(xpath = "//span[text()='Condo (owned)']")

	WebElement resVal;

	// vehicle-0-comprehensive
	@FindBy(xpath = "//label[@aria-owns='vehicle-0-comprehensive']")

	WebElement comSel;

	@FindBy(xpath = "//span[text()=' 100 ']")

	WebElement comVal;

	// vehicle-0-collision
	@FindBy(xpath = "//label[@aria-owns='vehicle-0-collision']")

	WebElement collSel;

	@FindBy(xpath = "//span[text()=' 200 ']")

	WebElement collVal;

	// CarrierButton

	@FindBy(xpath = "//span[text()=' Carrier Questions ']")

	WebElement carrierButton;
   
	
	@FindBy(xpath = "//span[text()=' Finish ']")

	WebElement finishButton ;
	
	public CoveragePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// Actoin Methods
	
	public void coverageFields() throws InterruptedException {
		
   
		WebElement bSel = biSel;
	     JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();",bSel );
			 try {
			biVal.click();
    }
    catch(org.openqa.selenium.StaleElementReferenceException ex) {
    	
    	biVal.click();
    	
	}
	
        
           
       	WebElement pdSele = pdSel;
	     JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("arguments[0].click();",pdSele );
          pdVal.click();
          
      	WebElement mpS = mpSel;
	     JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("arguments[0].click();",mpS );
          mpVal.click();
          
      	WebElement pideS = pidedSel;
	     JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("arguments[0].click();",pideS );
			pideVal.click();
          
      	WebElement pipSele = pipSel;
	     JavascriptExecutor js4 = (JavascriptExecutor) driver;
			js4.executeScript("arguments[0].click();",pipSele );
			pipVal.click();
          
      	WebElement wlSele = wlSel;
	     JavascriptExecutor js5 = (JavascriptExecutor) driver;
			js5.executeScript("arguments[0].click();",wlSele );
			wlVal.click();
          
      	WebElement pipaSele = pipaSel;
	     JavascriptExecutor js6 = (JavascriptExecutor) driver;
			js6.executeScript("arguments[0].click();",pipaSele );
			pipaVal.click();
          
      	WebElement resSele = resSel;
	     JavascriptExecutor js7 = (JavascriptExecutor) driver;
			js7.executeScript("arguments[0].click();",resSele );
			resVal.click();
          
      	WebElement comSele = comSel;
	     JavascriptExecutor js8 = (JavascriptExecutor) driver;
			js8.executeScript("arguments[0].click();",comSele );
			comVal.click();
          
      	WebElement collSele = collSel;
	     JavascriptExecutor js9 = (JavascriptExecutor) driver;
			js9.executeScript("arguments[0].click();",collSele );
			
			 try {
					collVal.click();
		    }
		    catch(org.openqa.selenium.StaleElementReferenceException ex) {
		    	
		    	collVal.click();
		    	
			}
		
          
    
			carrierButton.click();
			Thread.sleep(2000);
			finishButton.click();
		
			
      }
	
	
    }
    
    
	
	


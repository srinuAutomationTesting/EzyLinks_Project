package com.ezl.qa.base;	

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ezl.qa.util.TestUtil;

public class BaseClass {

	public static WebDriver driver; //we can use inside the chiled classes also
	public static Properties prop;  //we can use inside the chiled classes also

	public BaseClass() throws IOException { 
		
	
		try {
			prop = new Properties();
			FileInputStream fip = new FileInputStream("C:\\Users\\asrinu\\eclipse-workspace"
					+ "\\PageObjectModel_Ezl\\src\\main\\java\\com\\ezl\\qa\\config\\config.properties");
			prop.load(fip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\asrinu\\OneDrive - Capgemini\\Desktop\\SeleniumTesting\\Drivers\\chromedriver.exe");

		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT, TimeUnit.SECONDS); 
		   driver.get("https://app.vtpezlynx.com/auth/account/login");
		}
		
		
		
	}
	

}

package com.ezl.qa.util;

import java.io.IOException;

import com.ezl.qa.base.BaseClass;

public class TestUtil extends BaseClass {
	
     public TestUtil() throws IOException {
		super();
		
	}

	public static long PAGE_LOAD_TIMEOUT =40;
	 public static long IMPLICITLY_WAIT =30;

	 public void switchToFrame() {
		 
		 driver.switchTo().frame("mainpanel");
	 }
	 
}

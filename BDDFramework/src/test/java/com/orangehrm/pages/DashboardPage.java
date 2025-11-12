package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;

import com.orangehrm.base.BaseTest;

public class DashboardPage extends BasePage{
	
	static WebDriver driver;
	
	public DashboardPage() {
		super(driver=BaseTest.getDriver());
		
	}
	
	
}
package com.orangehrm.steps;

import org.junit.After;
import org.junit.Before;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.BasePage;
import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SteoDefinitiona extends BaseTest{
	
	BasePage page;
	@Before
	public void setUp() {
		
		BaseTest.launchApplication();
		
	}
	
	
	@After
	public void tearDownn() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	
	@Given("user is on {string}")
	public void user_is_on(String pageName) {
		
		switch (pageName) {
		case "LoginPage": page= new LoginPage();
			
			break;
		case "DashboardPage": page= new DashboardPage();
			break;
		default:
			break;
		}
	    
	}

	@Given("validateTitle to be {string}")
	public void validate_title_to_be(String expTitle) {
		
		page.validateTitle(expTitle);
	}

	@When("user enters text into textbox {string} {string}")
	public void user_enters_text_into_textbox(String logicalName, String text) {
		
		page.type(logicalName, text);
	  
	}

	@When("user clicks {string}")
	public void user_clicks(String text) {
		
		page.click(text);
	    
	}

	


	
}
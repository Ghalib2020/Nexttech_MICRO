package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.DellcontactPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellcontact {
	WebDriver driver; //we need to declare webdriver driver,driver as a global driver
	@Given("^user visit dell homepage$")
	public void user_visit_dell_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us/");
		Thread.sleep(3000);
	    
	}

	@When("^user clicks contact us$")
	public void user_clicks_contact_us() throws Throwable {
		DellcontactPOM obj1=new DellcontactPOM(driver);
		obj1.clickcontact().click();
		Thread.sleep(3000);
	    
	}

	@When("^user clicks Contact Technical support$")
	public void user_clicks_Contact_Technical_support() throws Throwable {
		DellcontactPOM obj2=new DellcontactPOM(driver);
		obj2.techsupport().click();
		Thread.sleep(3000);
		obj2.Choosemodel().click();
		
	   
	}

	@Then("^user able to directed to contact technical support page$")
	public void user_able_to_directed_to_contact_technical_support_page() throws Throwable {
	    
	}


}

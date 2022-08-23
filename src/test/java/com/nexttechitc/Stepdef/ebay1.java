package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.ebay1POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ebay1 {
	WebDriver driver;
	
	@Given("^user visit ebay homepage$")
	public void user_visit_ebay_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	   
	}

	@When("^user click sell$")
	public void user_click_sell() throws Throwable {
		ebay1POM ob=new ebay1POM(driver);
		ob.ClickSell().click();
		Thread.sleep(3000);
		
		
	}

	@When("^user click List an Item$")
	public void user_click_List_an_Item() throws Throwable {
		ebay1POM ob1=new ebay1POM(driver);
		ob1.ClickListanItem().click();
		
	    
	}

	@When("^user click question mark$")
	public void user_click_question_mark() throws Throwable {
	    
	}

	@Then("^user able to see another window$")
	public void user_able_to_see_another_window() throws Throwable {
	    
	}


	
}

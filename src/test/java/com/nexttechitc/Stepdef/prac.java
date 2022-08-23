package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.pracPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class prac {
	WebDriver driver;
	@Given("^user visit amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
	   driver.get("https://www.amazon.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	   
	}

	@When("^user clicks amazon basics$")
	public void user_clicks_amazon_basics() throws Throwable {
		pracPOM obj1=new pracPOM(driver);
		obj1.Clickamazonbasics().click();
		 Thread.sleep(6000);
		
	}

	@When("^user clicks diy$")
	public void user_clicks_diy() throws Throwable {
		pracPOM obj2=new pracPOM(driver);
		obj2.ClickDIY().click();
	    
	}

	@When("^user clicks add to card (\\d+)st item$")
	public void user_clicks_add_to_card_st_item(int arg1) throws Throwable {
	  
	}

	@When("^user click the cart$")
	public void user_click_the_cart() throws Throwable {
	    
	}

	@When("^user clicks delete$")
	public void user_clicks_delete() throws Throwable {
	    
	}

	@Then("^item is removed from the cart$")
	public void item_is_removed_from_the_cart() throws Throwable {
	  
	}



}

package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellDealPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellDeal {
	WebDriver driver;
	@Given("^user visit dell deal homepage$")
	public void user_visit_dell_deal_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.dell.com/");
		Thread.sleep(3000);
	    
	}

	@When("^user goto deal dropdown and goto laptop deals and click for home$")
	public void user_goto_deal_dropdown_and_goto_laptop_deals_and_click_for_home() throws Throwable {
		DellDealPOM ab=new DellDealPOM(driver);
		//Actions bc=new Actions(driver);
		ab.ClickDeal().click();
		ab.ClickLaptopdeal().click();
	
		/*bc.moveToElement(ab.ClickDeal()).build().perform();
		Thread.sleep(3000);
		bc.moveToElement(ab.ClickLaptopdeal()).build().perform();
		Thread.sleep(3000);
		ab.ClickHome().click();*/
		
		
	    
	}

	@Then("^user able to see home laptop deals$")
	public void user_able_to_see_home_laptop_deals() throws Throwable {
	    
	}



}

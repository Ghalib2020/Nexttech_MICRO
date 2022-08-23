package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.WalmartPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Walmart {
	WebDriver driver;
	@Given("^user visit walmart homepage$")
	public void user_visit_walmart_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //implicit wait
		
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize(); 
	   
	}

	@When("^user typess \"([^\"]*)\"$")
	public void user_typess(String arg1) throws Throwable {
		WalmartPOM ob=new WalmartPOM(driver);
		ob.TypeProduct().sendKeys(arg1);
		Thread.sleep(4000);
	    
	}

	@When("^user click search item icon$")
	public void user_click_search_item_icon() throws Throwable {
		WalmartPOM ob1=new WalmartPOM(driver);
		ob1.ClickSearch().click();
	    
	}

	@Then("^user able to see products$")
	public void user_able_to_see_products() throws Throwable {
	    
	}



}

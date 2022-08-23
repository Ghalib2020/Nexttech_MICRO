package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.TwitterLogin1POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterLogin1 {
	WebDriver driver;
	@Given("^user visit twitter login page$")
	public void user_visit_twitter_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //implicit wait
		
		driver.get("https://twitter.com/i/flow/login");
		driver.manage().window().maximize(); 
	    
	}

	@When("^user type valid \"([^\"]*)\" and click next$")
	public void user_type_valid_and_click_next(String arg1) throws Throwable {
		TwitterLogin1POM obj=new TwitterLogin1POM(driver);
		obj.TypePhnEmailUserN().sendKeys(arg1);
		Thread.sleep(3000);
		obj.ClickNext().click();
	    
	}

	@When("^user type valid \"([^\"]*)\" and click login$")
	public void user_type_valid_and_click_login(String arg1) throws Throwable {
	  
	}

	@Then("^user able to login twitter account$")
	public void user_able_to_login_twitter_account() throws Throwable {
	   
	}



}

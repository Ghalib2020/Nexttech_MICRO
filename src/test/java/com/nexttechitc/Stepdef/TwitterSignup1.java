package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.Pageobjectmodel.TwitterPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterSignup1 {
	WebDriver driver;
	@Given("^user visit twitter signup pag$")
	public void user_visit_twitter_signup_pag() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //implicit wait
		
		driver.get("https://twitter.com/i/flow/signup");
		driver.manage().window().maximize(); 
	   
	}

	@When("^user clicks signup with phone or emails$")
	public void user_clicks_signup_with_phone_or_emails() throws Throwable {
		TwitterPOM obj1=new TwitterPOM(driver);
		obj1.ClickSignupwithPhnEmail().click();
		Thread.sleep(3000);
	 
	}

	@When("^user type \"([^\"]*)\", \"([^\"]*)\" , Select month, date & year$")
	public void user_type_Select_month_date_year(String arg1, String arg2) throws Throwable {
		TwitterPOM obj2=new TwitterPOM(driver);
		obj2.TypeName().sendKeys(arg1);
		Thread.sleep(3000);
		obj2.TypePhone().sendKeys(arg2);
		Thread.sleep(3000);
		Select se1=new Select(obj2.SelMonth());
		se1.selectByIndex(8);
		Thread.sleep(3000);
		Select se2=new Select(obj2.SelDate());
		se2.selectByValue("20");
		Thread.sleep(3000);
		Select se3=new Select(obj2.SelYear());
		se3.selectByVisibleText("2000");
		Thread.sleep(3000);
		
	   
	}

	@When("^user click Next and click next and click signup$")
	public void user_click_Next_and_click_next_and_click_signup() throws Throwable {
		TwitterPOM obj3=new TwitterPOM(driver);
		obj3.ClickNext().click();
		Thread.sleep(3000);
		obj3.ClicAgainkNext().click();
		
	    
	}

	@Then("^user able to signs up twitter account$")
	public void user_able_to_signs_up_twitter_account() throws Throwable {
	  
	}



}

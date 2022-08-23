package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.Pageobjectmodel.TwitterPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterSignup2 {
	WebDriver driver;
	@Given("^user visit twitter signup page$")
	public void user_visit_twitter_signup_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //implicit wait
		
		driver.get("https://twitter.com/i/flow/signup");
		driver.manage().window().maximize(); 
	    
	}

	@When("^user clicks signup with phone or email and click use email instead$")
	public void user_clicks_signup_with_phone_or_email_and_click_use_email_instead() throws Throwable {
		TwitterPOM obj=new TwitterPOM(driver);
		obj.ClickSignupwithPhnEmail().click();
		Thread.sleep(3000);
		obj.ClickUseemailInstead().click();
		Thread.sleep(3000);
	   
	}

	@When("^user type valid name \"([^\"]*)\",  valid \"([^\"]*)\" , Select month, date & year$")
	public void user_type_valid_name_valid_Select_month_date_year(String arg1, String arg2) throws Throwable {
		TwitterPOM obj1=new TwitterPOM(driver);
		obj1.TypeName().sendKeys(arg1);
	   obj1.TypeEmail().sendKeys(arg2);
	   Select sel=new Select(obj1.SelMonth());
	   sel.selectByIndex(8);
	   Thread.sleep(3000);
	   
	   Select sel1=new Select(obj1.SelDate());
	   sel1.selectByValue("20");
	   Thread.sleep(3000);
	   Select sel2=new Select(obj1.SelYear());
	   sel2.selectByVisibleText("2000");
	   Thread.sleep(3000);
	  
	}

	@When("^user clicks Next and click next and click signup$")
	public void user_clicks_Next_and_click_next_and_click_signup() throws Throwable {
		TwitterPOM obj2=new TwitterPOM(driver);
		obj2.ClickNext().click();
		Thread.sleep(3000);
		obj2.ClicAgainkNext().click();
		Thread.sleep(3000);
	  
	}

	@Then("^user able to sign up twitter account$")
	public void user_able_to_sign_up_twitter_account() throws Throwable {
		driver.close();
	}



}

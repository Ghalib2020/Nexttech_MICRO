package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.blogloginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bloglogin {
	WebDriver driver;
	@Given("^user visits blog homepage$")
	public void user_visits_blog_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.somewhereinblog.net/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Thread.sleep(3000);
	    
	}

	@When("^user types \"([^\"]*)\"$")
	public void user_types(String arg1) throws Throwable {
		blogloginPOM ob=new blogloginPOM(driver);
		ob.TypeUsername().sendKeys(arg1);
	   
	}

	@When("^user types \"([^\"]*)\" and click login$")
	public void user_types_and_click_login(String arg1) throws Throwable {
		blogloginPOM ob1=new blogloginPOM(driver);
		ob1.TypePW().sendKeys(arg1);
		ob1.clicklogin().click();
	
	    
	}

	@Then("^user ables to login$")
	public void user_ables_to_login() throws Throwable {
		Thread.sleep(7000);
		driver.close();
	   
	}



}

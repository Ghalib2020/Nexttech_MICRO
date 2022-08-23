package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbsignup {
	WebDriver driver;
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
		//open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//how to open url
		driver.get("https://www.facebook.com/reg");
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.HOURS);
		//softwait(10)
	}

	@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		
		
		FbsigninPOM obj=new FbsigninPOM(driver);
		//obj.TypeFirstname().sendKeys(arg1);
		obj.TypeFirstname().sendKeys(arg1);
		obj.TypeLastname().sendKeys(arg2);
		obj.TypeEmail().sendKeys(arg3);
		Thread.sleep(4000);
		obj.RetypeEmail().sendKeys(arg3);
		obj.TypePW().sendKeys(arg4);
		obj.SelectGender().click();
		
	   
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		
		Thread.sleep(3000);
		FbsigninPOM obj1=new FbsigninPOM(driver);
		Select sel=new Select(obj1.DromdownMonth());
		sel.selectByIndex(2);
		
		Select sel1=new Select(obj1.selectDate());
		sel1.selectByValue("2");
		Select sel2=new Select(obj1.selectYear());
		sel2.selectByVisibleText("2000");
		obj1.ClickSignup().click();
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		
	}
	



}

package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellactionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellpractice {
	WebDriver driver;
	@Given("^user visit dell prac home page$")
	public void user_visit_dell_prac_home_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver_win32\\\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.get("https://www.dell.com/en-us");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}

	@When("^user click in a dropdon$")
	public void user_click_in_a_dropdon() throws Throwable {
		Actions A=new Actions(driver);
		DellactionPOM obj=new DellactionPOM(driver);
		A.moveToElement(obj.ClickSolutions()).build().perform();
		Thread.sleep(3000);
		A.moveToElement(obj.ClickIndustrySolution()).build().perform();
		Thread.sleep(3000);
		obj.ClickEnergyClimate().click();
		Thread.sleep(3000);
		A.moveToElement(obj.ClickSolutions()).build().perform();
		Thread.sleep(3000);
		A.moveToElement(obj.ClickIndustrySolution()).build().perform();
		Thread.sleep(3000);
		obj.ClickHealthandLife().click();

	   
	}

	@When("^user click on a option$")
	public void user_click_on_a_option() throws Throwable {
		DellactionPOM obj1=new DellactionPOM(driver);
		Actions ac=new Actions (driver);
		//obj1.ClickDellHome().click();
		Thread.sleep(3000);
		ac.moveToElement(obj1.ClickSolutions()).build().perform();
		Thread.sleep(3000);
		ac.moveToElement(obj1.ClickIndustrySolution()).build().perform();
		Thread.sleep(3000);
		obj1.ClickHealthandLife().click();

		
		
	   
	}

	@Then("^user see a result$")
	public void user_see_a_result() throws Throwable {
		Thread.sleep(3000);
		driver.close();
	    
	}



}

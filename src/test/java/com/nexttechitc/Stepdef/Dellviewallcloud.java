package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellactionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellviewallcloud {
	WebDriver driver;
	@Given("^user visit Dell home  page$")
	public void user_visit_Dell_home_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver_win32\\\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.dell.com/");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    Thread.sleep(4000);
	}

	@When("^user click solution$")
	public void user_click_solution() throws Throwable {
		Actions act=new Actions(driver);
		DellactionPOM obj=new DellactionPOM(driver);
		act.moveToElement(obj.ClickSolutions()).build().perform();
		 Thread.sleep(4000);
	    
	}

	@When("^user cloud solution$")
	public void user_cloud_solution() throws Throwable {
		Actions act1=new Actions(driver);
		DellactionPOM obj1=new DellactionPOM(driver);
       act1.moveToElement(obj1.ClicCloudSoln()).build().perform();
       
	    
	}

	@When("^user click view all cloud solutions$")
	public void user_click_view_all_cloud_solutions() throws Throwable {
		//Actions act2=new Actions(driver);
		DellactionPOM obj2=new DellactionPOM(driver);
		
		
		Thread.sleep(4000);
    obj2.ClicViewAllCloudSoln().click();
	    
	}

	@Then("^user able to see all cloud soln page$")
	public void user_able_to_see_all_cloud_soln_page() throws Throwable {
		Thread.sleep(4000);
		driver.close();
	   
	}


	

}

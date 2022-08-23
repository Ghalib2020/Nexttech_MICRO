package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellactionPOM;
import com.nexttechitc.Pageobjectmodel.bestsellerPOM;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {
	WebDriver driver;
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
		//open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//how to open url
		driver.get("https://dell.com/");
		Thread.sleep(4000);
		
		
	    
	    
	}

	@When("^user go to Solutions dropdown menu and able to see View All Solutions$")
	public void user_go_to_Solutions_dropdown_menu_and_able_to_see_View_All_Solutions() throws Throwable {
		Actions act =new Actions(driver);
		DellactionPOM obj=new DellactionPOM(driver);
		act.moveToElement(obj.ClickSolutions()).build().perform();
		act.moveToElement(obj.ClickSolutions()).build().perform();
		
		
		
		Thread.sleep(4000);
		obj.Clickviewallsolutions().click();
		
		
	   
	    
	}

	@Then("^user redirects to solution portfolio$")
	public void user_redirects_to_solution_portfolio() throws Throwable {
	    
	    
	}



}

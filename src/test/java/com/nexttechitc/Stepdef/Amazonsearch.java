package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.amazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsearch {
	WebDriver driver;
	@Given("^user visits Amazon homepages$")
	public void user_visits_Amazon_homepages() throws Throwable {
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //implicit wait
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize(); //to maximize the window
		//Thread.sleep(300);  //Hard wait
		}
		catch (Exception e) {
			System.out.println("Error in browser opening");
		}
	   
	}

	@When("^user type \"([^\"]*)\"$")
	public void user_type(String arg1) throws Throwable {
		try {
		amazonsearchPOM obj =new amazonsearchPOM(driver);
		obj.typeamazonsearch().sendKeys(arg1);
		Thread.sleep(300);
		WebDriverWait Wait=new WebDriverWait(driver,20); //Explicit wait also called as webdriver wait
		}
		catch (Exception e) {
			System.out.println("Error in type search");
		}
	   
	}

	@When("^user click search icon$")
	public void user_click_search_icon() throws Throwable {
		amazonsearchPOM obj1 =new amazonsearchPOM(driver);
		obj1.clickearch().click();
	   
	}

	@Then("^user should be able to see the product$")
	public void user_should_be_able_to_see_the_product() throws Throwable {
		driver.close();//only the current browser will close
		
		driver.quit();//each and every driver open by automation will be close
	    
	}



}

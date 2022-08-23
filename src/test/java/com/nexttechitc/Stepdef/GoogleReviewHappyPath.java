package com.nexttechitc.Stepdef;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.GooglePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleReviewHappyPath {
	WebDriver driver;
	@Given("^user visit google homepage$")
	public void user_visit_google_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	    
	}

	@When("^user type \"([^\"]*)\" in search and click search icon$")
	public void user_type_in_search_and_click_search_icon(String arg1) throws Throwable {
		GooglePOM ob1=new GooglePOM(driver);
		ob1.TypegoogleSearch().sendKeys(arg1);
		//Thread.sleep(3000);
		
		ob1.ClickgoogleSearch().click();
		Thread.sleep(3000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,500)");
	   
	}

	@When("^user click write a review$")
	public void user_click_write_a_review() throws Throwable {
		GooglePOM ob2=new GooglePOM(driver);
		ob2.ClickWriteaReview().click();
	   
	}

	@When("^user click star icon and write a \"([^\"]*)\" in review field$")
	public void user_click_star_icon_and_write_a_in_review_field(String arg1) throws Throwable {
	   
	}

	@When("^user click post$")
	public void user_click_post() throws Throwable {
	    
	}

	@Then("^user able to post a review$")
	public void user_able_to_post_a_review() throws Throwable {
	    
	}


}

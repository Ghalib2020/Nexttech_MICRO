package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.BestbuyPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bestbuy {
	WebDriver driver;
	@Given("^user go to bestbuy home page$")
	public void user_go_to_bestbuy_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
	    
	}

	@When("^user click deal of the day and click bestbuyhome$")
	public void user_click_deal_of_the_day_and_click_bestbuyhome() throws Throwable {
		BestbuyPOM obj=new BestbuyPOM(driver);
		Thread.sleep(10000);
		obj.DealofTheDay().click();
		//Thread.sleep(3000);
		//obj.BBHome().click();
		Thread.sleep(3000);
	  
	}

	@When("^user Search \"([^\"]*)\" product name and click search and click to beast by home$")
	public void user_Search_product_name_and_click_search_and_click_to_beast_by_home(String arg1) throws Throwable {
		/*BestbuyPOM obj1=new BestbuyPOM(driver);
		obj1.TypeProductName().sendKeys(arg1);
		Thread.sleep(3000);
		obj1.ClickSearch().click();
		Thread.sleep(3000);
		obj1.BBHome().click();
		Thread.sleep(3000);*/
		
		
		
	}

	@When("^user go to More and click gift cards$")
	public void user_go_to_More_and_click_gift_cards() throws Throwable {
		BestbuyPOM obj2=new BestbuyPOM(driver);
		//Actions ac=new Actions(driver);
		//ac.moveToElement(obj2.HoverMore()).build().perform();
		/*obj2.HoverMore().click();
		Thread.sleep(3000);
		obj2.ClickGiftCard().click();
		Thread.sleep(3000);*/
	    
	}

	@When("^user type another \"([^\"]*)\" P name and click search$")
	public void user_type_another_P_name_and_click_search(String arg2) throws Throwable {
		BestbuyPOM obj3=new BestbuyPOM(driver);
		obj3.TypeProductName().sendKeys(arg2);
		Thread.sleep(10000);
		obj3.ClickSearch().click();
	}

	@Then("^user able to see the product list page$")
	public void user_able_to_see_the_product_list_page() throws Throwable {
	    
	}


}

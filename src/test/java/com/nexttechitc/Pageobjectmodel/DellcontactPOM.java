package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellcontactPOM {
	WebDriver driver;
	
	public DellcontactPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		
		@FindBy(xpath="//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[1]/div/a/span/span")
		WebElement click_contactus;
		public WebElement clickcontact() {
			return click_contactus;
		}
		@FindBy(xpath="//*[@id=\"us-en-dhs-19-fcca82af-9bb0-4ca0-a440-2bbb2a2cf418-tech_it_help\"]/div/div[2]/div/a")
		WebElement click_techsupport;
		public WebElement techsupport() {
			return click_techsupport;
		}
		

		@FindBy(xpath="//*[@id=\"browseallprod\"]")
		WebElement choose_model;
		public WebElement Choosemodel() {
			return choose_model;
		}
	

}

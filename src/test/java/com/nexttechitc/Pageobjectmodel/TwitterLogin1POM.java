package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterLogin1POM {
	WebDriver driver;
	 
	public TwitterLogin1POM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@autocomplete=\"username\"]")
	WebElement Type_PhnEmailUName;
	public WebElement TypePhnEmailUserN() {
		
		return Type_PhnEmailUName;
	}
	
	@FindBy(xpath="//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div")
	WebElement Click_Next;
	public WebElement ClickNext() {
		
		return Click_Next;
	}
	
	
	
	
}

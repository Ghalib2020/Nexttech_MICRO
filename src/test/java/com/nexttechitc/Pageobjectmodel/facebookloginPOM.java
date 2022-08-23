package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookloginPOM {
	WebDriver driver;
	//this is a constructor
	//it dosent have any return type
	public facebookloginPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement type_email;
	public WebElement typeemail() {
		return type_email;
	}
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement type_PW;
	public WebElement typePw() {
		return type_PW;
	}

	
}

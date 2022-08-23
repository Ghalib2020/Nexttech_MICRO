package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterPOM {
	WebDriver driver;
	 
	public TwitterPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/div/span/span")
	WebElement Click_SignupwithPhnEmail;
	public WebElement ClickSignupwithPhnEmail() {
		return Click_SignupwithPhnEmail;
	}
	
	@FindBy(xpath="//input[@autocomplete=\"name\"]")
	WebElement Type_Name;
	public WebElement TypeName() {
		return Type_Name;
	}
	
	@FindBy(xpath="//input[@autocomplete=\"tel\"]")
	WebElement Type_Phone;
	public WebElement TypePhone() {
		return Type_Phone;
	}
	
	@FindBy(xpath="//*[@id=\"SELECTOR_1\"]")
	WebElement Sel_Month;
	public WebElement SelMonth() {
		return Sel_Month;
	}
	
	@FindBy(xpath="//*[@id=\"SELECTOR_2\"]")
	WebElement Sel_Date;
	public WebElement SelDate() {
		return Sel_Date;
	}
	@FindBy(xpath="//*[@id=\"SELECTOR_3\"]")
	WebElement Sel_Year;
	public WebElement SelYear() {
		return Sel_Year;
	}
	///html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div")
	WebElement Click_Next;
	public WebElement ClickNext() {
		return Click_Next;
	}
	////div[@data-testid="ocfSettingsListNextButton"]
	@FindBy(xpath="//div[@style=\"color: rgb(255, 255, 255);\"]")
	WebElement Click_AgainNext;
	public WebElement ClicAgainkNext() {
		return Click_AgainNext;
	}
	@FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[3]/span")
	WebElement Click_UseemailInstead;
	public WebElement ClickUseemailInstead() {
		return Click_UseemailInstead;
	}
	////input[@autocomplete="email"]
	@FindBy(xpath="//input[@autocomplete=\"email\"]")
	WebElement Type_Email;
	public WebElement TypeEmail() {
		return Type_Email;
	}
	
	
	
}




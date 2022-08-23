package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class blogloginPOM {
	WebDriver driver;
	public blogloginPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	
	////input[@class="input-text form-control username"] username
	////*[@id="account-login"]/form/div[2]/input pw
	////*[@id="account-login"]/form/div[3]/div[2]/input
	
	@FindBy(xpath="//input[@class=\"input-text form-control username\"]")
	WebElement type_username;
	public WebElement TypeUsername() {
		return type_username;
	}
	@FindBy(xpath="//*[@id=\"account-login\"]/form/div[2]/input")
	WebElement type_pw;
	public WebElement TypePW() {
		return type_pw;}
	
	@FindBy(xpath="//*[@id=\"account-login\"]/form/div[3]/div[2]/input")
	WebElement click_login;
	public WebElement clicklogin() {
		return click_login;}
		
	

}

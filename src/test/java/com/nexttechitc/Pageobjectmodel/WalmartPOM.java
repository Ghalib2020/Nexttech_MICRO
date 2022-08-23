package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WalmartPOM {
	////*[@id="__next"]/div[1]/div/span/header/form/div/input
	////*[@id="__next"]/div[1]/div/span/header/form/div/button/i
	
	WebDriver driver;
	public WalmartPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[1]/div/span/header/form/div/input")
	WebElement type_product;
	public WebElement TypeProduct() {
		return type_product;
	}
	@FindBy(xpath="//*[@id=\"__next\"]/div[1]/div/span/header/form/div/button/i")
	WebElement click_search;
	public WebElement ClickSearch() {
		return click_search;}
	
	
}

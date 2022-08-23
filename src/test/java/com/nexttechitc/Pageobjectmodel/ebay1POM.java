package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ebay1POM {
	WebDriver driver;
	public ebay1POM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	////a[@_sp="m570.l1528"]
	
	@FindBy(xpath="//a[@_sp=\"m570.l1528\"]")
	WebElement Click_sell;
	public WebElement ClickSell() {
		return Click_sell;
	}
	
	////*[@id="image_banner_1"]/div/div/a
	@FindBy(xpath="//*[@id=\"image_banner_1\"]/div/div/a")
	WebElement Click_Listanitem;
	public WebElement ClickListanItem() {
		return Click_Listanitem;
	}
	
	
	
	
	
	

}

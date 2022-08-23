package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pracPOM {
	WebDriver driver;
	 
	public pracPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href=\"/stores/node/20648519011?channel=discovbar?field-lbr_brands_browse-bin=AmazonBasics&ref_=nav_cs_amazonbasics\"]")
	WebElement amzn_basics;
	public WebElement Clickamazonbasics() {
		return amzn_basics;
	}
	
	@FindBy(xpath="//*[@id=\"Header-JpnClKg\"]/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/nav/ul/li[4]/a")
	WebElement click_DIY;
	public WebElement ClickDIY() {
		return click_DIY;
	}
	
	 @FindBy(xpath="//*[@id=\"ProductGrid-JHDIzno\"]/div/div/div/div/ul/li[1]/div[2]/div[4]/div[2]/div/button")
	 WebElement Click_addtocart;
	 public WebElement Click_addtocart() {
		 return Click_addtocart;
	 }
	 
	 @FindBy(xpath="//*[@id=\"nav-cart-count\"]")
	 WebElement Click_cart;
	 public WebElement Click_cart() {
		 return Click_cart;
	 }
	 
	 @FindBy(xpath="//input[@name=\"submit.delete.C6a87a7a2-4091-4140-95f3-50b87af176e7\"]")
	 WebElement click_dltcart;
	 public WebElement click_dltcart() {
		 return click_dltcart;
	 }
	
	

}

package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestbuyPOM {
	WebDriver driver;
	public BestbuyPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//*[@id=\"shop-header-60256157\"]/div/div[1]/header/div[2]/nav/div/ul/li[2]/a")
	WebElement DealOfTheDay;
	public WebElement DealofTheDay() {
		return DealOfTheDay;
	}
	@FindBy(xpath="//*[@id=\"shop-header-13540857\"]/div/div[1]/header/div[1]/div/a")
	WebElement BB_Home;
	public WebElement BBHome() {
		return BB_Home;
	}
	@FindBy(xpath="//input[@id=\"gh-search-input\"]")
	WebElement Type_productName;
	public WebElement TypeProductName() {
		return Type_productName;
	}
	@FindBy(xpath="//*[@id=\"shop-header-10474516\"]/div/div[1]/header/div[1]/div/div[1]/div/form/button[2]")
	WebElement Click_Search;
	public WebElement ClickSearch() {
		return Click_Search;
	}
	@FindBy(xpath="//*[@id=\"shop-header-13540857\"]/div/div[1]/header/div[2]/nav/div/div/button/span")
	WebElement Hover_More;
	public WebElement HoverMore() {
		return Hover_More;
	}
	
	@FindBy(xpath="//*[@id=\"shop-header-13540857\"]/div/div[1]/header/div[2]/nav/div/div/div/div/div[1]/ul/li[1]/a")
	WebElement Click_GiftCard;
	public WebElement ClickGiftCard() {
		return Click_GiftCard;
	}
	

}

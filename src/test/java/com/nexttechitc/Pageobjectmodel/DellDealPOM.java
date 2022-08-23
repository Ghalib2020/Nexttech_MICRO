package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellDealPOM {
	WebDriver driver;
	public DellDealPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[6]/button/span")
	WebElement Click_Deal;
	public WebElement ClickDeal() {
		return Click_Deal;
		
		}
	@FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[6]/ul/li[3]/button")
	WebElement Click_LaptopDeals;
	public WebElement ClickLaptopdeal() {
		return Click_LaptopDeals;
		
		}
	//
	@FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[6]/ul/li[3]/ul/li[3]/a")
	WebElement Click_Home;
	public WebElement ClickHome() {
		return Click_Home;
		
		}
	
	

}

package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellactionPOM {
	WebDriver driver;
	public DellactionPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	////*[@id="unified-masthead-navigation"]/nav/ul/li[3]/button/span
	////*[@id="unified-masthead-navigation"]/nav/ul/li[3]/ul/li[3]/a
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/button/span")
	WebElement click_solutions;
	public WebElement ClickSolutions() {
		return click_solutions;
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[3]/a")
	WebElement click_Viewallsolutions;
	public WebElement Clickviewallsolutions() {
		return click_Viewallsolutions;
	}
	////*[@id="unified-masthead-navigation"]/nav/ul/li[3]/ul/li[4]/button
	////*[@id="unified-masthead-navigation"]/nav/ul/li[3]/ul/li[4]/ul/li[3]/a
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[4]/button")
	WebElement click_cloudsoln;
	public WebElement ClicCloudSoln() {
		return click_cloudsoln;
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[4]/ul/li[3]/a")
	WebElement click_ViewAllCloudSln;
	public WebElement ClicViewAllCloudSoln() {
		return click_ViewAllCloudSln;
	}
	///html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/ul/li[7]/button
	@FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/ul/li[7]/button")
	WebElement click_IndustrySoln;
	public WebElement ClickIndustrySolution() {
		return click_IndustrySoln;
	}
	
	///html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/ul/li[7]/ul/li[5]/a
	@FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/ul/li[7]/ul/li[5]/a")
	WebElement click_Energy_Climate;
	public WebElement ClickEnergyClimate() {
		return click_Energy_Climate;
	}
	
	///html/body/header/div[1]/div[1]/div[1]/a/svg[1]
	@FindBy(xpath="/html/body/header/div[1]/div[1]/div[1]/a/svg[1]")
	WebElement click_DellHome;
	public WebElement ClickDellHome() {
		return click_DellHome;
	
}
///html/body/header/div[2]/div[2]/nav/ul/li[3]/ul/li[7]/ul/li[7]/a	
	
		@FindBy(xpath="/html/body/header/div[2]/div[2]/nav/ul/li[3]/ul/li[7]/ul/li[7]/a")
		WebElement click_HealthLife;
		public WebElement ClickHealthandLife() {
			return click_HealthLife;
		
	}

}



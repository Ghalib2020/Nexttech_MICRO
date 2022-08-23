package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePOM {
	WebDriver driver;
	public GooglePOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	WebElement type_googleSearch;
	public WebElement TypegoogleSearch() {
		return type_googleSearch;
	
	}
	///html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[6]/center/input[1]
	///html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]
	@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
	WebElement Click_googleSearch;
	public WebElement ClickgoogleSearch() {
		return Click_googleSearch;
	}
	////*[@id="wrkpb"]/span/span
	@FindBy(xpath="//*[@id=\"wrkpb\"]/span/span")
	WebElement Click_WriteaReview;
	public WebElement ClickWriteaReview() {
		return Click_WriteaReview;
	}
	
	////*[@id="kCvOeb"]/div[1]/div[3]/div/div[2]/div/div[5]
	@FindBy(xpath="//*[@id=\"kCvOeb\"]/div[1]/div[3]/div/div[2]/div/div[5]")
	WebElement Click_Star;
	public WebElement ClickStar() {
		return Click_Star;
	}
	
	////*[@id="Yc71gb"]
	@FindBy(xpath="//*[@id=\"Yc71gb\"]")
	WebElement Type_Review;
	public WebElement TypeReview() {
		return Type_Review;
	}
	
	////*[@id="ZRGZAf"]/div[3]
	@FindBy(xpath="//*[@id=\"ZRGZAf\"]/div[3]")
	WebElement Click_Post;
	public WebElement ClickPost() {
		return Click_Post;
	}
	
	
	
}

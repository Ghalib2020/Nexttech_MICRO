package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonsearchPOM {
	WebDriver driver;
//this is a constructor
//it dosent have any return type
public amazonsearchPOM (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(id="twotabsearchtextbox")
WebElement type_amazonsearch;
public WebElement typeamazonsearch() {
	return type_amazonsearch;
}

@FindBy(id="nav-search-submit-button")
WebElement click_search;
public WebElement clickearch() {
	return click_search;
}


}

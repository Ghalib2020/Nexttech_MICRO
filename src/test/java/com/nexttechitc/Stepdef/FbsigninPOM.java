package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbsigninPOM {
WebDriver driver;
	
	public FbsigninPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")
	WebElement type_firstname;
	public WebElement TypeFirstname() {
		return type_firstname;
	}
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")
	WebElement type_lastname;
	public WebElement TypeLastname() {
		return type_lastname;
	}
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")
	WebElement type_email;
	public WebElement TypeEmail() {
		return type_email;
	}

	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input")
	WebElement type_pw;
	public WebElement TypePW() {
		return type_pw;
	}
	////*[@id="u_0_o_aG"]/span[2]/label
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")
	WebElement select_gender;
	public WebElement SelectGender() {
		return select_gender;
	
}
	///html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[3]/div/div/div[1]/input
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[3]/div/div/div[1]/input")
	WebElement Re_TypeEmail;
	public WebElement RetypeEmail() {
		return Re_TypeEmail;
	
}
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]")
	WebElement Dromdown_Month;
	public WebElement DromdownMonth() {
		return Dromdown_Month;
}
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]")
	WebElement select_Date;
	public WebElement selectDate() {
		return select_Date;
	}
	///html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]")
	WebElement select_Year;
	public WebElement selectYear() {
		return select_Year;
	}
	////*[@id="u_0_s_Y1"]
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")
			WebElement Click_signup;
	public WebElement ClickSignup() {
		return Click_signup;
	}
}

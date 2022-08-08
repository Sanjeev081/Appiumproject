package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Loginpage extends TestBase{
	//page Factory-OR:
	@FindBy(xpath="//*[@id=\"demo-form\"]/fieldset/div[1]/input")
	WebElement username;

	@FindBy(xpath="//*[@id=\"demo-form\"]/fieldset/div[2]/input")
	WebElement password;

	@FindBy(xpath="//*[@id=\"demo-form\"]/fieldset/button")
	WebElement loginBtn;

	//@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[1]/span/span")
	//WebElement loginimage;
	//initializing the page objects

	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	public String validdateloginpageTitle() {
		return driver.getTitle();

	}
	//Actions
	//public String validateloginpageTitle() {

		//return driver.getTitle();
	//}
	//public boolean validateloginText() {
		//return loginimage.isDisplayed();

	//}
	public Homepage login(String un,String psw) {
		username.sendKeys(un);
		password.sendKeys(psw);
		loginBtn.click();
		return new Homepage();

	}


}

package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;





public class Homepage extends TestBase{
	@FindBy(xpath="//*[@id=\"wrapper\"]/nav/div[1]/a/img")
	WebElement onedotclasslogo;

	@FindBy(xpath="//*[@id=\"wrapper\"]/nav/ul[1]/li/h3/a")
	WebElement startText;

	@FindBy(xpath="//*[@id=\"wrapper\"]/nav/ul[2]/li[1]/a")
	WebElement usernameText;

	@FindBy(xpath="//img[contains(@class,'_2xm1JU')]")
	WebElement flipkartlogo;




	@FindBy(xpath="/html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/ul/li[1]/a")
	WebElement newcontactlink;

	@FindBy(xpath="//*[@id=\"navmenu\"]/ul/li[5]/a")
	WebElement dealslink;

	@FindBy(xpath="//*[@id=\"navmenu\"]/ul/li[6]/a")
	WebElement tasklinks;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyHomepageTitle() {
		return driver.getTitle();


	}
	public boolean verifyonedotclasslogo() {
		return onedotclasslogo.isDisplayed();

	}
	public boolean verifystarText() {
		return startText.isDisplayed();

	}
	public boolean VerifyusernameHari() {
		return usernameText.isDisplayed();

	}
	//public 	Dealspage clickonDealslink() {
		//dealslink.click();
		//return  new Dealspage();

	//}
	//public Taskpage clickonTasklink() {
		//tasklinks.click();
		//return new Taskpage();

	//}
	//public void clickonnewcontactlink() {
		//Actions action=new Actions(driver);
		//action.moveToElement(contactslink).build().perform();
		//newcontactlink.click();
	//}

}

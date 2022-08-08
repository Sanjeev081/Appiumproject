package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Signuppage extends TestBase{
	
	
	
	@FindBy(xpath="//*[@id=\"demo-form\"]/fieldset/a[1]")
	WebElement  Reglink;
	
//	@FindBy(xpath="//*[@id=\"demo-form\"]/fieldset/button")
//	WebElement RegBtn;
	
	@FindBy(xpath="//*[@id=\"first_name\"]")
	WebElement Firstname;
	
	@FindBy(xpath="//*[@id=\"last_name\"]")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"demo-form\"]/fieldset/div[4]/input")
	WebElement mobileno;
	
	@FindBy(xpath="//*[@id=\"demo-form\"]/fieldset/div[5]/input")
	WebElement  password;
	
	@FindBy(xpath="//*[@id=\"demo-form\"]/fieldset/div[6]/input")
	WebElement confpsw;
	
	@FindBy(xpath="//*[@id=\"demo-form\"]/fieldset/button")
	WebElement Regbtn;
	
	
	
	
	
	public Signuppage(){
		PageFactory.initElements(driver, this);
	}
	public void validateregistrationpagelink(String firstname,String ltname,String mail,String mobno,String psw,String cnfpsw) {
		Reglink.click();
//		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
//		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("latname"));
//		driver.findElement(By.xpath(prop.getProperty("Email_xpath"))).sendKeys(prop.getProperty("Email"));
//		driver.findElement(By.xpath(prop.getProperty("phoneno_xpath"))).sendKeys(prop.getProperty("phonenumber"));
//		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
//		driver.findElement(By.xpath(prop.getProperty("confirmxpath"))).sendKeys("Confirmpassword");
//		RegBtn.click();
		Firstname.sendKeys(firstname);
		lastname.sendKeys(ltname);
		email.sendKeys(mail);
		mobileno.sendKeys(mobno);
		
		password.sendKeys(psw);
		confpsw.sendKeys(cnfpsw);
		Regbtn.click();
		
		
		
	
		
		
		
		
		
	
		
		
		
		
		
		
	}
	


}

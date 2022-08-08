package com.crm.qa.testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class LoginpageTest extends TestBase{
	Loginpage loginpage;
	Homepage homepage;

	public LoginpageTest() {
		super();
	}



	@BeforeMethod

	public void setup() {
		initialization();
	   loginpage=new Loginpage ();

	}
	@Test(priority=1)
	public void validateloginpageTitleTest() {
		String title=loginpage.validdateloginpageTitle();
		AssertJUnit.assertEquals(title, "ONE.class");


	}



	@Test (priority=2)
	public void loginTest() {
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}
	@AfterMethod
	public void teardown() {
		driver.quit();

	}

}

package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.pages.Signuppage;

public class SignuppageTest  extends TestBase {
	Signuppage signuppage;
	
	
	
	
	
	public SignuppageTest() {
		super();
	}
	@BeforeMethod

	public void setup() {
		initialization();
		signuppage=new Signuppage();

	}
	
	@Test
	public void verifyloginlinkTest() {
		signuppage.validateregistrationpagelink("Gopal", "kumar", "Gopalkumar@123", "8056098364", "Kumar@123", "kumar@san123");
		
		
	}
	@AfterMethod
	public void teardown() {
		

	}


}

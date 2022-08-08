package com.crm.qa.testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class HomepageTest extends TestBase{
	Loginpage loginpage;
	Homepage homepage;



	public HomepageTest() {

		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		//testutil=new Testutil();
		//contactpage=new Contactspage();
		loginpage=new Loginpage ();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}
	@Test(priority=1)
	public void verifyHomepageTitleTest() {
		String homepageTitle=homepage.verifyHomepageTitle();
		AssertJUnit.assertEquals(homepageTitle, "ONE.class","Homepage Title is not matched");

	}
	@Test(priority=2)
	public void  VerifyonedotclasslogoTest() {
		//testutil.switchtoframe();
	boolean a=	homepage.verifyonedotclasslogo();
	AssertJUnit.assertTrue(a);


	}
	@Test(priority=3)
	public void verifystartestTest() {
		boolean b=homepage.verifystarText();
		AssertJUnit.assertTrue(b);


	}
	@Test(priority=4)
	public void verifyuserNameHariTest() {
		boolean c=homepage.VerifyusernameHari();
		AssertJUnit.assertTrue(c);



	}





	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}

package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {




	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



	LoginPage loginpage;
	HomePage homepage;

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		loginpage = new LoginPage();
		
		
	}
	
//	@Test(priority=1)
//	public void loginpageTitleTest() {
//	String title=loginpage.validateLoginPageTitle();
//	Assert.assertEquals(title, "#1 Free CRM App for every business CRM and VCM verifiable credentials management");
//		
//	}
	
	@Test(priority=3)
	public void imagevalidateonscreen() {
		boolean flag=loginpage.validateImage();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=2)
	public void logintest() throws IOException, InterruptedException {
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean flag=loginpage.validateImage();
		Assert.assertTrue(flag);
	}
	
	
	


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

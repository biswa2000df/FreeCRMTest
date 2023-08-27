package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;
import com.crm.qa.utils.TestUtils;

public class HomePageTest extends TestBase {

	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	LoginPage loginpage;
	HomePage homepage;
	TestUtils testutils;
	ContactsPage contactpage;
	DealsPage dealspage;
	TasksPage taskspage;
	
	@BeforeTest
	public void setUp() throws IOException, InterruptedException {
		initialization();
		loginpage=new LoginPage();
		homepage=new HomePage();
		testutils=new TestUtils();
		dealspage=new DealsPage();
		taskspage=new TasksPage();
		homepage=	loginpage.login(prop.getProperty("username"),prop.getProperty("password") );

	}
	
	
	
	
	
	@Test(priority=1)
	public void verifyUserName() throws IOException, InterruptedException {
//	testutils.frameSwitch();
	boolean b=homepage.accountName();
	Assert.assertTrue(b);
	}
	
	
	@Test(priority=2)
	public void ClickContactPage() throws InterruptedException, IOException {
		contactpage=homepage.clickOnContactsLinks();
		Thread.sleep(2000);
	}
	
	
	@Test(priority=3)
	public void ClickOnDealsPage() throws InterruptedException
	{
		
		dealspage=homepage.clickOnDealsLink();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=4)
	public void ClickOnTasksPage() throws IOException, InterruptedException {
	taskspage=homepage.clickOnTasksLink();
		Thread.sleep(2000);
	}
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}

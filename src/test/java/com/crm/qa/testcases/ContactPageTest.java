package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utils.TestUtils;

public class ContactPageTest extends TestBase {

	public ContactPageTest() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}
	
	
	LoginPage loginpage;
	HomePage homepage;
	TestUtils testutils;
	ContactsPage contactpage;
	
	String sheetname=prop.getProperty("Excelsheetname");
	
	
	@BeforeTest
	public void setUp() throws IOException, InterruptedException {
		initialization();
		loginpage=new LoginPage();
		homepage=new HomePage();
		testutils=new TestUtils();
		homepage=	loginpage.login(prop.getProperty("username"),prop.getProperty("password") );
		Thread.sleep(2000);
		homepage.clickOnContactsLinks();
		contactpage=new ContactsPage();

	}
	
	@Test
	public void checkContactPage() {
		Assert.assertTrue(contactpage.CheckContactPage());
	}
	
	@DataProvider(name="readData")
	public Object[][] getCRMtestdata() throws IOException {
		Object[][] data=testutils.readDatafromexcel(sheetname);
		return data;
		
	}
	
	@Test(dataProvider="readData" , dataProviderClass=TestUtils.class)  //(dataProvider="getCRMtestdata")
	public void getData(String fstname, String secondName, String companynmae) {
		
		
		
	}
	
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	

}

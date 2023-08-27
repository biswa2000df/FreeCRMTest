package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
//Initializing the page objectmodel
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//*[text()='Log In']")
	WebElement crmloginbtn;
	
	@FindBy(xpath="//*[@placeholder='Email']")
	WebElement username;
	
	@FindBy(xpath="//*[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement loginbutton;
	
	
	@FindBy(xpath="//*[@class='header item']")
	WebElement imageValidate;
	
	
	
	public String validateLoginPageTitle() {

		return driver.getTitle();
	}
	
	
	public boolean validateImage() {
		return imageValidate.isDisplayed();
	}
	
	public HomePage login(String un, String pass) throws IOException, InterruptedException  {
		crmloginbtn.click();
		username.sendKeys(un);
		password.sendKeys(pass);
		loginbutton.click();
		
		
		Thread.sleep(5000);
		
		return new HomePage();
		
	}
	
	
	
	
	
	
	
	
	

}

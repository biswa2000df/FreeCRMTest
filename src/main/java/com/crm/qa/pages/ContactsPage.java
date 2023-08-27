package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{

	public ContactsPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//*[text()='Contacts'])[2]")
	WebElement contactPageVisiable;
	
	
	public boolean CheckContactPage() {
		return contactPageVisiable.isDisplayed();
	}
	
	
	@FindBy(name="first_name")
	WebElement contactPageVisiable;

}

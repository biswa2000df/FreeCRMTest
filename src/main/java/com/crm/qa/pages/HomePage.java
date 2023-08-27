package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='user-display']")
	WebElement usernamecheck;

	@FindBy(xpath="//*[text()='Contacts']")
	WebElement contactLinks;
	
	@FindBy(xpath="(//*[text()='Deals'])[1]")
	WebElement dealsLinks;
	
	@FindBy(xpath="//*[text()='Tasks']")
	WebElement tasksLinks;
	
	@FindBy(xpath="(//*[@class=\"ui mini basic icon button\"])[2]")
	WebElement contactPlusIcon;
	
	
	
	public boolean accountName() {
		return usernamecheck.isDisplayed();
	}
	
	
	public ContactsPage clickOnContactsLinks() throws IOException {
		contactLinks.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink()
	{
		dealsLinks.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink() throws IOException {
		tasksLinks.click();
		return new TasksPage();
	}
	
	
	public void clickonPlusIcon() {
		contactPlusIcon.click();
	}
}

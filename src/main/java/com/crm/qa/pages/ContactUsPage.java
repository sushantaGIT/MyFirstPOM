package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactUsPage extends TestBase{

	@FindBy(xpath="//div[@id='center_column']/*[contains(text(),'Customer service - Contact us')]")
	WebElement contactUsLabel;
	
	
	
	
	// To initialize the elements or Page objects with the help of page factory
	public ContactUsPage() {
	PageFactory.initElements(driver, this);	
	}
	
	public boolean verifyContactUsLabel() {
		return contactUsLabel.isDisplayed();		
	}
	
	
	
	
	
}

package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class MyAccountPage extends TestBase{

	@FindBy(xpath="//div/h1[contains(text(),'My account')]")
	WebElement myAccountLabel;
	
	@FindBy(xpath="//*[@title=\"Addresses\"]")
	WebElement myAddressesTab;
	
	
	
	
	
	
	// To initialize the elements or Page objects with the help of page factory
		public MyAccountPage() {
			PageFactory.initElements(driver, this);	
		}
			
		public boolean verifyMyAccountLabel() {
			return myAccountLabel.isDisplayed();		
		}
	
		public MyAddressesPage clickOnMyAddressesTab() {
			myAddressesTab.click();
			return new MyAddressesPage();
		}
	
	
}

package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class MyAddressesPage extends TestBase{

	@FindBy(xpath="//*[@title=\"Add an address\"]")
	WebElement addNewAddressBtn;
	
	
	
	
	
	// To initialize the elements or Page objects with the help of page factory
	public MyAddressesPage() {
		PageFactory.initElements(driver, this);	
	}
	
	public YourAddressesPage clickOnAddNewAddressBtn() {
		addNewAddressBtn.click();
		return new YourAddressesPage();
	}
		
		
}

package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class YourAddressesPage extends TestBase{

	@FindBy(xpath="//*[@name=\"firstname\"]")
	WebElement firstNameTxt;
	
	@FindBy(xpath="//*[@name=\"lastname\"]")
	WebElement lastNameTxt;
	
	@FindBy(name="address1")
	WebElement address1Txt;
	
	@FindBy(name="city")
	WebElement cityTxt;
	
	@FindBy(name="id_state")
	WebElement stateDn;
	
	@FindBy(name="postcode")
	WebElement zipCodeTxt;
	
	@FindBy(name="id_country")
	WebElement countryDn;
	
	@FindBy(name="phone")
	WebElement homePhoneTxt;
	
	@FindBy(name="phone_mobile")
	WebElement mobilePhoneTxt;
	
	@FindBy(name="alias")
	WebElement addressAliasTxt;
	
	@FindBy(name="submitAddress")
	WebElement saveBtn;
	
	
	
	// To initialize the elements or Page objects with the help of page factory
	public YourAddressesPage() {
		PageFactory.initElements(driver, this);	
	}
	
	public void addNewAddress(String ftName, String ltName, String add1, String city, String st, 
			String zip, String cont, String ph, String mob, String alias) {
		firstNameTxt.sendKeys(ftName);
		lastNameTxt.sendKeys(ltName);
		address1Txt.sendKeys(add1);
		cityTxt.sendKeys(city);
		
		Select select = new Select(stateDn);
		select.selectByVisibleText(st);
		zipCodeTxt.sendKeys(zip);
		Select select1 = new Select(countryDn);
		select1.selectByVisibleText(cont);
		homePhoneTxt.sendKeys(ph);
		mobilePhoneTxt.sendKeys(mob);
		addressAliasTxt.sendKeys(alias);
		saveBtn.click();
			
	}
	
	
	
	
	
	
}

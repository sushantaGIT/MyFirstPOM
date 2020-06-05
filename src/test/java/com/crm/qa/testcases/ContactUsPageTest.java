package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactUsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactUsPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactUsPage contactUsPage;

	// Create constructor for superclass from TestBase class where all properties are defined
	public ContactUsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		contactUsPage = new ContactUsPage();
		//testUtil = new TestUtil();
		// Create the object of LoginPage class; create LoginPage constructor
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactUsPage = homePage.clickOnContactUsLink();
	}
	
	@Test(priority=1)
	public void verifyContactUsPageLabel() {
		Assert.assertTrue(contactUsPage.verifyContactUsLabel(), "Contact Us label is missing on the page");
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	

}

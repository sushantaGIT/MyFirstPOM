package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactUsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyAccountPage;
import com.crm.qa.pages.MyAddressesPage;
import com.crm.qa.pages.YourAddressesPage;
import com.crm.qa.util.TestUtil;

public class AddNewAddressTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactUsPage contactUsPage;
	MyAccountPage myAccountPage;
	MyAddressesPage myAddressesPage;
	YourAddressesPage yourAddressesPage;
	
	String sheetName = "AddAddress";
	
	
	// Create constructor for superclass from TestBase class where all properties are defined
	public AddNewAddressTest() {
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
		//contactUsPage = homePage.clickOnContactUsLink();
		myAccountPage = new MyAccountPage();
		myAccountPage = homePage.clickOnLoggedInUserLink();
		myAddressesPage = new MyAddressesPage();
		myAddressesPage = myAccountPage.clickOnMyAddressesTab();
		yourAddressesPage = new YourAddressesPage();
		yourAddressesPage = myAddressesPage.clickOnAddNewAddressBtn();
				
		
	}
	
	@DataProvider
	public Object[][] getTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1, dataProvider="getTestData")
	public void addNewAddress(String FirstName, String LastName, String Address, String City, String State, String Zip,
			String Country, String Phone, String Mobile, String Alias) {
		//myAddressesPage.clickOnAddNewAddressBtn();
		//yourAddressesPage.addNewAddress("Tom", "Peter", "Cam road", "London", "Florida", "12345", "United States", "1234567890", "1231231231", "Addrs1");
		yourAddressesPage.addNewAddress(FirstName, LastName, Address, City, State, Zip, Country, Phone, Mobile, Alias);
		
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}

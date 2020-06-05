package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

// All Pages are child of TestBase class; So need to define each Page class as extends Base class as below -
public class LoginPage extends TestBase {

//Page Factory - OR
//@FindBy(name="username")
@FindBy(name="email")
WebElement username;

//@FindBy(name="password")
@FindBy(name="passwd")
WebElement password;

//@FindBy(xpath="//input[@type='submit']")
@FindBy(xpath="//*[@id='SubmitLogin']")
WebElement loginBtn;

@FindBy(xpath="//button[contains(text(),'Sign Up')]")
WebElement signUpBtn;

//@FindBy(xpath="//img[contains(@class,'img-responsive')]")
@FindBy(xpath="//img[contains(@class,'logo img-responsive')]")
WebElement crmLogo;

// To initialize the elements or Page objects with the help of page factory
// Create the Constructor of this class once again and using the 'initElements' (Initialize Elements) method
// 'this' means it will initialize the current class objects
public LoginPage() {
PageFactory.initElements(driver, this);
}

// Define different Actions of Login Page
// Title will return a String type, So declared as Public String
public String validateLoginPageTitle() {
return driver.getTitle();
}

// Check Logo displayed or not; the return type is True or false which is boolean type
public boolean validateCRMImage() {
return crmLogo.isDisplayed();
}

// The return type of Loginpage is Homepage which is the landing page after login
public HomePage login(String un, String pwd) {
username.sendKeys(un);
password.sendKeys(pwd);
loginBtn.click();

return new HomePage();
}

}

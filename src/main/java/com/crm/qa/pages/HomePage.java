package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

//@FindBy(xpath="//td[contains(text(),'User: Demo User')]")
@FindBy(xpath="//div[@class=\"header_user_info\"]//*[contains(text(),'sus mis')]")
WebElement userNameLabel;

@FindBy(xpath="//*[@title=\"Contact Us\"]")
WebElement contactUsLink;

@FindBy(xpath="//*[@title=\"View my customer account\"]")
WebElement loggedInUserLink;

@FindBy(xpath="//a[contains(text(),'Deals')]")
WebElement dealsLink;

@FindBy(xpath="//a[contains(text(),'Tasks')]")
WebElement tasksLink;

// To initialize the elements or Page objects with the help of page factory
public HomePage() {
PageFactory.initElements(driver, this);
}

public String verifyHomePageTitle() {
return driver.getTitle();
}

public boolean verifyCorrectUserName() {
return userNameLabel.isDisplayed();
}


public ContactUsPage clickOnContactUsLink() {
contactUsLink.click();
return new ContactUsPage();
}

public DealsPage clickOnDealsLink() {
dealsLink.click();
return new DealsPage();
}

public TasksPage clickOnTasksLink() {
tasksLink.click();
return new TasksPage();
}

public MyAccountPage clickOnLoggedInUserLink() {
loggedInUserLink.click();
return new MyAccountPage();
}


}

package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	// Initialese webdriver with a static variable
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	
	
	// Define public constructor - TestBase
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/crm"
			+ "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/BeatBlip/chromedriver");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:/BeatBlip/geckodriver");	
			driver = new FirefoxDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Take the above 2 timeouts from TestUtil class as below -
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
	
}

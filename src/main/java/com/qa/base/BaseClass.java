package com.qa.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.qa.io.ConfigReader;

public class BaseClass {
	
	public static WebDriver driver;

	
	@BeforeSuite
	public void setup(){
		DriverManager driverManager = new DriverManager();
		Properties prop = ConfigReader.readConfigPropertiesFile();
		String browser = prop.getProperty("browser");
		driver = driverManager.InitilizeDriver(browser);
		driver.get(prop.getProperty("url"));
		
	}
	
	@BeforeClass
	public void beforeClass(){
		
	}
	
	@AfterSuite
	public void tearDown(){
		//driver.quit();
	}

}

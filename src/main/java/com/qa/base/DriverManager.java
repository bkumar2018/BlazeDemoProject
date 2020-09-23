package com.qa.base;

import java.util.Collections;
import java.util.Properties;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;

import com.qa.io.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	WebDriver driver;
	Properties configProp = ConfigReader.readConfigPropertiesFile();
	
	public WebDriver InitilizeDriver(String browser){
		
		if(browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver(getChromeOptions());			
		}else if(browser.equalsIgnoreCase("firfox")) {
			//TBD
		}else{
			System.out.println("Given browser not supported");			
		}		
		return driver;
	}
	
	
	private ChromeOptions getChromeOptions(){
	    LoggingPreferences logPrefs = new LoggingPreferences();
	    logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
	    options.setCapability("goog:loggingPrefs", logPrefs);
	    options.setExperimentalOption("useAutomationExtension", false);
	    options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	    options.setCapability(ChromeOptions.CAPABILITY,options);
		
		return options;
	}
}

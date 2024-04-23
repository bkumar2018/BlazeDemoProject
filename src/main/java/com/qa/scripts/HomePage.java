package com.qa.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.pagefactory.HomePageObject;
import com.qa.utils.WaitExecuter;

public class HomePage {
	
	private WebDriver driver;
	private HomePageObject homePageObject;
	private WaitExecuter waitExecuter;
	  
	public HomePage(WebDriver driver){
		this.driver = driver;
		homePageObject = new HomePageObject(driver);
		waitExecuter = new WaitExecuter(driver);
	}
	
	public String getHomePageUrl(){
		return driver.getCurrentUrl();

	}
	
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	//Enter flight details
	public void enterFlightDetails(String deptCity, String destCity){
		
		waitExecuter.waitUntilElementPresent(homePageObject.selectDepartureCity);
		Select dropDwnDeptCity = new Select(homePageObject.selectDepartureCity);
		dropDwnDeptCity.selectByValue(deptCity);
		
		waitExecuter.waitUntilElementPresent(homePageObject.selectDestinationCity);
		Select dropDwnDestCity = new Select(homePageObject.selectDestinationCity);
		dropDwnDestCity.selectByValue(destCity);
	}
	
	//Click on Find Flight button
	public void clickOnFindFlights(){
		waitExecuter.waitUntilElementPresent(homePageObject.flightBtn);
		homePageObject.flightBtn.click();
	}

	public void gotoHomePage(String homePageUrl){
		driver.get(homePageUrl);
	}
}

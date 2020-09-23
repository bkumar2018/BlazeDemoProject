package com.qa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageObject {

	@FindBy(name="fromPort")
	public WebElement selectDepartureCity;
	
	@FindBy(name="toPort")
	public WebElement selectDestinationCity;
		
	@FindBy(xpath="//div[@class='container']/input")
	public WebElement flightBtn;
	
	public HomePageObject(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
}

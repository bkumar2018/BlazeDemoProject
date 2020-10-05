package com.qa.pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservePageObject {
	
	
	@FindBy(xpath="//table[@class='table']/tbody/tr")
	public List<WebElement> flightBookTbl;
	
	@FindBy(xpath="//table[@class='table']/tbody/tr/td[6]")
	public List<WebElement> flightBookPrice;
	
	@FindBy(xpath="//table[@class='table']/tbody/tr[3]/td[1]/input")
	public WebElement chooseFlight;
	
	@FindBy(xpath="//table[@class='table']/tbody/tr/td[3]")
	public List<WebElement> airline;
	
	@FindBy(xpath="//table[@class='table']/tbody/tr/td[1]")
	public List<WebElement> dynamicChooseThisFlight;
	
	public ReservePageObject(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

}

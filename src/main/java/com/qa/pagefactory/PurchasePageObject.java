package com.qa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePageObject {

	@FindBy(css="#inputName")
	public WebElement name;
	
	@FindBy(id="address")
	public WebElement address;
	
	@FindBy(id="city")
	public WebElement city;
	
	@FindBy(id="state")
	public WebElement state;
	
	@FindBy(id="zipCode")
	public WebElement zipCode;
	
	@FindBy(id="cardType")
	public WebElement cardType;
	
	@FindBy(id="creditCardNumber")
	public WebElement creditCardNum;

	@FindBy(id="creditCardMonth")
	public WebElement creditCardMonth;
	
	@FindBy(id="creditCardYear")
	public WebElement creditCardYear;
	
	@FindBy(id="nameOnCard")
	public WebElement nameOnCard;
	
	@FindBy(xpath="//input[contains(@class,'btn')]")
	public WebElement purchaseFlight;
	
	
	public PurchasePageObject(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
}

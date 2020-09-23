package com.qa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPageObject {
	
	@FindBy(xpath="//table[contains(@class,'table')]/tbody/tr[1]/td[2]")
	public WebElement idValue;
	
	@FindBy(tagName="h1")
	public WebElement msg;

	public ConfirmationPageObject(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
}

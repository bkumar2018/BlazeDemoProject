package com.qa.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.pagefactory.ConfirmationPageObject;

public class ConfirmationPage {
	
	private WebDriver driver;
	private ConfirmationPageObject confirmPageObject;
	
	public ConfirmationPage(WebDriver driver){
		this.driver = driver;
		confirmPageObject = new ConfirmationPageObject(driver);		
	}

	public void verifySuccessMsg(){
		Assert.assertEquals(confirmPageObject.msg.getText(), "Thank you for your purchase today!");
	}
	public String getConfirmationId(){
		return confirmPageObject.idValue.getText();
	}
}

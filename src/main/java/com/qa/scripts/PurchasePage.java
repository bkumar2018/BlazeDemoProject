package com.qa.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.pagefactory.PurchasePageObject;

public class PurchasePage {
	
	public WebDriver driver;
	public PurchasePageObject purchasePageObject;
	
	public PurchasePage(WebDriver driver){
		this.driver = driver;
		purchasePageObject = new PurchasePageObject(driver);
	}
	
	public void enterUserPurcahseDetails(String name, String address, String city, String state, String zipCode){
		purchasePageObject.name.sendKeys(name);
		purchasePageObject.address.sendKeys(address);
		purchasePageObject.city.sendKeys(city);
		purchasePageObject.state.sendKeys(state);
		purchasePageObject.zipCode.sendKeys(zipCode);			
	}
	
	public void enterUserCardDetails(String cardType, String creditCardNum, String creditCardMonth, String creditCardYear){
		Select dropDwnCardType = new Select(purchasePageObject.cardType);
		dropDwnCardType.selectByIndex(1);
		
		purchasePageObject.creditCardNum.sendKeys(creditCardNum);
		purchasePageObject.creditCardMonth.sendKeys(creditCardMonth);
		purchasePageObject.creditCardYear.sendKeys(creditCardYear);		
	}
	
	public void clickOnPurchaseFlightBtn(){
		purchasePageObject.purchaseFlight.click();
	}

}

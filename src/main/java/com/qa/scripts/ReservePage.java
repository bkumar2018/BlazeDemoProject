package com.qa.scripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.qa.pagefactory.ReservePageObject;

public class ReservePage {
	
	public WebDriver driver;
	public ReservePageObject reservePageObject;

	public ReservePage(WebDriver driver){
		this.driver = driver;	
		reservePageObject = new ReservePageObject(driver);
	}
	
	
	public Boolean verifyBookTablePresent(){
		if(reservePageObject.flightBookTbl.size() > 0){
			return true;
		}
		return false;
	}
	
	public void verifyLowestPrice(){
		int numRows = reservePageObject.flightBookPrice.size();		
		List<String> listBookPrice = new ArrayList<String>();		
		for(int i=0; i<numRows; i++){
			listBookPrice.add(reservePageObject.flightBookPrice.get(i).getText());			
		}		
		Collections.sort(listBookPrice);		
	}
	
	public void clickOnChooseThisFlight(){
		reservePageObject.chooseFlight.click();
	}

}

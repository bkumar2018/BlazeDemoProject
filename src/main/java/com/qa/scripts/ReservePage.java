package com.qa.scripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.pagefactory.ReservePageObject;

public class ReservePage {
	
	public WebDriver driver;
	public ReservePageObject reservePageObject;
	public int index;

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
	public void verifyAirlinethenChooseFlight(String airlinename) {
		int totalFlights=reservePageObject.airline.size();
		
		String s=null;
		for (int i=0; i<totalFlights; i++) {
			s=reservePageObject.airline.get(i).getText();
			if (s.equalsIgnoreCase(airlinename)) {
				index=i;
			
			reservePageObject.dynamicChooseThisFlight.get(index).click();
			}
		}
	}
	public void selectCheapestFlight() {
		int totalFlights=reservePageObject.flightBookPrice.size();
		
		
		String lowestprice=null;
		int indexforCheapestPrice;
		List<String> pricelist=new ArrayList<String>();
		
		for (int i=0; i<totalFlights; i++) {
			String s=reservePageObject.flightBookPrice.get(i).getText();
			String s1=s.replace("$", "");
			pricelist.add(s1);
		}
		ArrayList<String> oldpricelist=new ArrayList<String>(pricelist);
			Collections.sort(pricelist);
			int size=pricelist.size();
			for (int j=0; j<size; j++) {
				lowestprice=pricelist.get(0).toString();
				break;
			}
		
		for (int k=0; k<oldpricelist.size(); k++) {
			if (oldpricelist.get(k).toString().equalsIgnoreCase(lowestprice)){
				indexforCheapestPrice=k;
				reservePageObject.dynamicChooseThisFlight.get(indexforCheapestPrice).click();
				break;
				}
				
			}
		}
	}

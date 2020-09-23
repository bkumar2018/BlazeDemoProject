package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.scripts.HomePage;
import com.qa.scripts.ReservePage;

public class TC_002 extends BaseClass{
	
	public HomePage homePage = new HomePage(driver);
	public ReservePage reservePage = new ReservePage(driver);
	
	
	@Test
	public void EnterFlightDetailsAndClickBtn(){		
		homePage.enterFlightDetails("Paris", "Rome");
		homePage.clickOnFindFlights();
	}
	
	@Test
	public void verifyBookTablePopulated(){		
		Assert.assertTrue(reservePage.verifyBookTablePresent(),"Book flight table not populated");
	}
	
	@Test
	public void verifyChooseOThisFlight(){
		reservePage.clickOnChooseThisFlight();
	}

}

package com.qa.testcases;

import com.qa.dataprovider.FlightDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.scripts.ConfirmationPage;
import com.qa.scripts.HomePage;
import com.qa.scripts.PurchasePage;
import com.qa.scripts.ReservePage;
import com.qa.utils.WaitExecuter;

public class TC_003 extends BaseClass{

	private String homePageUrl = null;

	@Test(dataProvider = "flightDetails", dataProviderClass = FlightDataProvider.class )
	public void EnterFlightDetailsAndClickBtn(String srcCity, String destCity){
				
		HomePage homePage = new HomePage(driver);
		ReservePage reservePage = new ReservePage(driver);
		PurchasePage purchasePage = new PurchasePage(driver);
		WaitExecuter waitExecuter = new WaitExecuter(driver);
		ConfirmationPage confirm = new ConfirmationPage(driver);

		homePageUrl = homePage.getHomePageUrl();

		//homePage.enterFlightDetails("Paris", "Rome");
		homePage.enterFlightDetails(srcCity, destCity);
		homePage.clickOnFindFlights();
		waitExecuter.sleep(2000);
		Assert.assertTrue(reservePage.verifyBookTablePresent(),"Book flight table not populated");
		reservePage.clickOnChooseThisFlight();
		waitExecuter.sleep(2000);
		
		purchasePage.enterUserPurcahseDetails("Birender", "Ganesh Nagar", "Pune", "Maharashtra", "411031");
		waitExecuter.sleep(2000);
		purchasePage.enterUserCardDetails("Visa", "0123456789", "09", "2012");
		waitExecuter.sleep(2000);
		purchasePage.clickOnPurchaseFlightBtn();
		waitExecuter.sleep(2000);
		
		confirm.verifySuccessMsg();
		String bookId =  confirm.getConfirmationId();
		System.out.println("Confirmation Booking Id: "+ bookId);
		
		homePage.gotoHomePage(homePageUrl);
		
	}

}

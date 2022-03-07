package com.AssignmentSelenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AssignmentSelenium.pages.BestSellerPage;
import com.relevantcodes.extentreports.LogStatus;

public class BestSellerTest extends BaseTest {
	
	@Test
	public void BestSeller() {
		
		BestSellerPage  best_seller = new BestSellerPage(driver);
		best_seller.best_seller();
		best_seller.android();
		best_seller.product();
		
		String outputActual = driver.getTitle();
		String outputExpected = "Volume Control for Lite | Control TV Volume from Stick's Remote without IR:Amazon.in:Appstore for Android";
		
		Assert.assertEquals(outputActual, outputExpected);
		extentTest.log(LogStatus.PASS, "Best Seller test case passed successfully");
		
	}
	
}

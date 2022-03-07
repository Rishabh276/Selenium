package com.AssignmentSelenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AssignmentSelenium.pages.FireTVPage;
import com.relevantcodes.extentreports.LogStatus;

public class FireTVTest extends BaseTest{

	@Test
	public void FireTV() {
			
			FireTVPage  fire_tv = new FireTVPage(driver);
			fire_tv.enterAll();
			fire_tv.enterFireTV();
			fire_tv.AppsGames();
			fire_tv.enterYouTube();
			
			String outputActual = driver.getTitle();
			String outputExpected = "Amazon.in: Apps for Android";
			
			Assert.assertEquals(outputActual, outputExpected);
			extentTest.log(LogStatus.PASS, "Fire TV test case passed successfully");
	}
	
}

package com.AssignmentSelenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AssignmentSelenium.pages.NewReleasesPage;
import com.relevantcodes.extentreports.LogStatus;

public class NewReleasesTest extends BaseTest{
	
	@Test
	public void NewReleases() {
			
			NewReleasesPage  new_releases = new NewReleasesPage(driver);
			new_releases.enterAll();
			new_releases.enterNewRelease();
			new_releases.enterElement();
			
			String outputActual = driver.getTitle();
			String outputExpected = "Buy Safari Ray Voyage Trolley Bag Small and Medium Size, 53 cms and 67 Blue/Cyan Printed Hard Side Travel Bag for Men and Women, 4 Wheel Luggage Suitcase for Travelling, (RAYVOYAGESM4WPRN) at Amazon.in";
			Assert.assertEquals(outputActual, outputExpected);
			extentTest.log(LogStatus.PASS, "New Releases test case passed successfully");
	}

}

package com.AssignmentSelenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AssignmentSelenium.pages.PrimeVideoLoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class PrimeVideoLoginTest extends BaseTest {

	@Test
	public void Primelogin() {
			
			PrimeVideoLoginPage login = new PrimeVideoLoginPage(driver);
			login.enterAll();
			login.enterAmazonPrime();
			login.enterAllVideos();
			login.enterSignIn();
			login.enterEmail();
			login.enterPassword();
			login.enterSignInButton();
			
			String outputActual = driver.getTitle();
			String outputExpected = "Welcome to Prime Video";
			
			Assert.assertEquals(outputActual, outputExpected);
			extentTest.log(LogStatus.PASS, "Prime Video Login test case passed successfully");
		}
}
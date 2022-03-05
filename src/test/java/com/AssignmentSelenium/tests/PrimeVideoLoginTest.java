package com.AssignmentSelenium.tests;

import org.testng.annotations.Test;

import com.AssignmentSelenium.pages.PrimeVideoLoginPage;

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
		}
}
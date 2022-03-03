package com.AssignmentSelenium.tests;

import org.testng.annotations.Test;

import com.AssignmentSelenium.pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	public void login() {
		
		LoginPage login = new LoginPage(driver);
		login.enterSignIn();
		login.enterEmail();
		login.continueToNextPage();
		login.enterPassword();
		login.signIn();
	}
}

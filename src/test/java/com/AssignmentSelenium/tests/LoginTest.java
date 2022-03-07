package com.AssignmentSelenium.tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.AssignmentSelenium.pages.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest extends BaseTest{

	@Parameters({"validemail", "password"})
	@Test
	public void validLogin(@Optional("6295907017") String user, @Optional("rounak@0609") String pass) {

		try {
		LoginPage login = new LoginPage(driver);
		login.enterSignInButton();
		login.enterEmail(user);
		login.continueToNextPage();
		login.enterPassword(pass);
		login.signIn();
		String result = login.userCheck.getText();
		String expectedresult = "Hello, ROUNAK";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(result, expectedresult);
		sa.assertAll();
		extentTest.log(LogStatus.PASS, "Valid login test case passed successfully");
		}
		catch(AssertionError ae) {
			extentTest.log(LogStatus.FAIL, ae);
		}
	}

	@Parameters({"invalidemail"/*, "password"*/})
	@Test
	public void inValidLogin(@Optional("rounakbanerjee327@gmail.com") String user/*, @Optional("rounak@0609") String pass*/) {

		LoginPage login = new LoginPage(driver);
		login.enterSignInButton();
		login.enterEmail(user);
		login.continueToNextPage();
		//login.enterPassword(pass);
		//login.signIn();
		extentTest.log(LogStatus.PASS, "Invalid login test case passed successfully");
	}
}
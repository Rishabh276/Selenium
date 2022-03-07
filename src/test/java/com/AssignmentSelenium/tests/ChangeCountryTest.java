package com.AssignmentSelenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AssignmentSelenium.pages.ChangeCountryPage;
import com.relevantcodes.extentreports.LogStatus;

public class ChangeCountryTest extends BaseTest{

	@Test
	public void ChangeCountry() {
		
		ChangeCountryPage  change_country = new ChangeCountryPage(driver);
		change_country.Step1();
		change_country.Step2();
		boolean result = change_country.Step3();
		
	
		Assert.assertTrue(result);
		extentTest.log(LogStatus.PASS, "Change Country test case passed successfully");
		
	}
	
}

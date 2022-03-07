package com.AssignmentSelenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AssignmentSelenium.pages.SearchMobilePage;
import com.relevantcodes.extentreports.LogStatus;

public class SearchMobileTest extends BaseTest{
	
	@Test
	public void mobileSearch() {
		
		SearchMobilePage searchProduct = new SearchMobilePage(driver);
		searchProduct.enterMobile();
		searchProduct.hoverMobile();
		searchProduct.enterApple();
		searchProduct.enterTheMobile();
		searchProduct.getTheMobile();
		searchProduct.enterSearchBox();
		searchProduct.enterSubmit();
		
		String[] outputActual = driver.getTitle().split(":");
		String actual = outputActual[1].trim();
		String outputExpected = searchProduct.checkingTheElement();
		
		Assert.assertEquals(actual, outputExpected);
		extentTest.log(LogStatus.PASS, "Search Mobile test case passed successfully");
		}

}

package com.AssignmentSelenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AssignmentSelenium.pages.SearchElectronicsPage;
import com.relevantcodes.extentreports.LogStatus;

public class SearchElectronicsTest extends BaseTest{
	
	@Test
	public void ElectronicsSearch() {
		
		SearchElectronicsPage searchProduct = new SearchElectronicsPage(driver);
		searchProduct.enterElectronics();
		searchProduct.enterHeadphones();
		searchProduct.enterProduct();
		searchProduct.enterSearchBox();
		searchProduct.enterSubmit();
		
		String outputActual = searchProduct.getTheElement();
		String outputExpected = driver.getTitle().split(":")[1].trim();
		
		Assert.assertEquals(outputActual, outputExpected);
		extentTest.log(LogStatus.PASS, "Search Electronics test case passed successfully");
		}

}
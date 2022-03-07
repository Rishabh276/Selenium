package com.AssignmentSelenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AssignmentSelenium.pages.SearchTheProductPage;
import com.relevantcodes.extentreports.LogStatus;

public class SearchTheProductTest extends BaseTest {
	
	@Test
	public void productSearch() {
			
		SearchTheProductPage searchProduct = new SearchTheProductPage(driver);
		searchProduct.enterFashion();
		searchProduct.hoverWomanFashion();
		searchProduct.enterClothing();
		searchProduct.enterWomenTshirts();
		searchProduct.enterSearchBox();
		searchProduct.enterSubmit();
		
		String outputActual = searchProduct.getTheElement();
		String outputExpected = driver.getTitle().split("-")[1].trim();
		outputExpected = outputExpected.substring(7);
		
		boolean check = outputActual.contains(outputExpected);
		
		
		Assert.assertTrue(check);
		extentTest.log(LogStatus.PASS, "Search the Product test case passed successfully");
		}

}
package com.AssignmentSelenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AssignmentSelenium.pages.SearchTheProductPage;

public class SearchTheProductTest extends BaseTest {
	
	@Test
	public void productSearch() {
			
		SearchTheProductPage searchProduct = new SearchTheProductPage(driver);
		searchProduct.enterFashion();
		searchProduct.hoverWomanFashion();
		searchProduct.enterClothing();
		searchProduct.enterWomenTshirts();
		//searchProduct.enterTshirts();
		searchProduct.enterSearchBox();
		searchProduct.enterSubmit();
		
		String outputActual = searchProduct.getTheElement();
		String outputExpected = driver.getTitle().split("-")[1].trim();
		outputExpected = outputExpected.substring(7);
		
		//System.out.println(outputExpected  + " " + outputActual);
		boolean check = outputActual.contains(outputExpected);
		//System.out.println(check);
		
		
		Assert.assertTrue(check);
		}

}
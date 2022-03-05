package com.AssignmentSelenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AssignmentSelenium.pages.SearchMenShoesPage;

public class SearchMenShoesTest extends BaseTest {

	@Test
	public void productSearch() {
		
		SearchMenShoesPage searchProduct = new SearchMenShoesPage(driver);
		searchProduct.enterFashion();
		searchProduct.hoverMenFashion();
		searchProduct.enterSports();
		searchProduct.enterCricket();
		searchProduct.enterShoes();
		String outputExpected = searchProduct.getTheElement();
	    
		searchProduct.enterSearchBox();
		searchProduct.enterSubmit();
		searchProduct.searchedShoes(); 
		
		String outputActual =  driver.getTitle().split(":")[1].trim();
		
		
		Assert.assertEquals(outputActual, outputExpected);
		}
}

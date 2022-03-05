package com.AssignmentSelenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AssignmentSelenium.pages.SearchMobilePage;

public class SearchMobileTest extends BaseTest{
	
	@Test
	public void productSearch() {
		
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
		//System.out.println(outputActual);
		//System.out.println("..............................................................");
		//System.out.println(outputExpected);
		Assert.assertEquals(actual, outputExpected);
		}

}

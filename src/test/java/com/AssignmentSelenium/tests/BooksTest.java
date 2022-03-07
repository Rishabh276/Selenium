package com.AssignmentSelenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AssignmentSelenium.pages.BooksPage;
import com.relevantcodes.extentreports.LogStatus;

public class BooksTest extends BaseTest{

	@Test
	public void Books() {
			
			BooksPage  books = new BooksPage(driver);
			books.enterBooks();
			books.enterNewReleases();
			books.enterElement();
			
			String outputActual = driver.getTitle();
			String outputExpected = "Buy Beguiled: A Real-Life Story of How a Woman Got Conned in Love Book Online at Low Prices in India | Beguiled: A Real-Life Story of How a Woman Got Conned in Love Reviews & Ratings - Amazon.in";
			
			Assert.assertEquals(outputActual, outputExpected);
			extentTest.log(LogStatus.PASS, "Books test case passed successfully");
	}
}

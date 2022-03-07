package com.AssignmentSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	
	WebDriver driver;
	
	public BooksPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-xshop\"]/a[8]")
	public WebElement clickBooks;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-subnav\"]/a[3]/span")
	public WebElement clickNewReleases;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"acs-product-block-1\"]/a/span/span[2]")
	public WebElement clickTheElement;
	
	
	public void enterBooks() {
		clickBooks.click();
	}
	
	public void enterNewReleases() {
		clickNewReleases.click();
	}
	
	public void enterElement() {
		clickTheElement.click();
	}

}

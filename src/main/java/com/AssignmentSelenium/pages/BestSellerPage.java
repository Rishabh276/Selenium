package com.AssignmentSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BestSellerPage {
	
	WebDriver driver;
	
	public BestSellerPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-xshop\"]/a[1]")
	public WebElement clickBestSellers;
	
	@FindBy(how = How.XPATH , using = "//a[normalize-space()='Apps for Android']")
	public WebElement clickAppsForAndroid;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"gridItemRoot\"]/div/div[2]/div/a[1]/div/img")
	public WebElement clickTheProduct;
	
	
	
	public void best_seller() {
		clickBestSellers.click();
	}
	
	public void android() {
		clickAppsForAndroid.click();
	}
	
	public void product() {
		clickTheProduct.click();
	}
}

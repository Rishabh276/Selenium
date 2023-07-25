package com.AssignmentSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchElectronicsPage {

WebDriver driver;
	
	public SearchElectronicsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-xshop\"]/a[5]")
	public WebElement clickElectronics;
	
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"s-refinements\"]/div[1]/ul/li[7]/span/a/span")
	public WebElement clickHeadphones;
	
	
	@FindBy(how=How.XPATH , using = "//*[@id=\"acs-product-block-1\"]/div[1]/a/img")
	public WebElement clickProduct;
	
	/*
	@FindBy(how=How.XPATH , using = "//span[@id='productTitle']")
	public WebElement chosenProduct;
	
	
	@FindBy(how = How.ID , using = "twotabsearchtextbox")
	public WebElement clickSearchBox;
	
	
	@FindBy(how = How.XPATH , using = "//input[contains(@id,\"nav-search-submit-button\")]")
	public WebElement clickSubmitButton;
	
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-xshop\"]/a[6]")
	public WebElement checkTheElement;
	*/
	
	
	
	public void enterElectronics() {
		
		clickElectronics.click();
	}
	
	
	public void enterHeadphones() {
		
		clickHeadphones.click();
	}
	
	public void enterProduct() {
		
		clickProduct.click();
	}
	
}	
	/*public String getTheElement() {
		
		return chosenProduct.getText();
	}
	
	public void enterSearchBox() {
		
		clickSearchBox.sendKeys("        Jabra Elite 2 in Ear True Wireless Earbuds – with 21 Hours of Battery, 2 Built-in Microphones for Clear Calls, Rich Bass and Comfortable fit - Navy       ");
	}
	
	public void enterSubmit() {
		
		clickSubmitButton.click();
	}
	
	public void checkelement() {
		checkTheElement.click();
	}
	
	public String checkingTheElement() {
		
		return checkTheElement.getText();
	}
}
*/
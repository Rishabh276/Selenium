package com.AssignmentSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchTheProductPage {
	
	WebDriver driver;
	
	public SearchTheProductPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-xshop\"]/a[6]")
	public WebElement clickFashion;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-subnav\"]/a[2]")
	public WebElement hoverWomen;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-flyout-aj:https://images-eu.ssl-images-amazon.com/images/G/31/img16/wayfinding/json/subnavmay18.json:subnav-sl-megamenu-1:0\"]/div[2]/div/div[1]/ul/li[4]/a")
	public WebElement clickClothing;
	
	@FindBy(how=How.XPATH , using = "//*[@id=\"sobe_d_b_3_2\"]/a/div/img")
	public WebElement clickWomenTshirts;
	
	@FindBy(how = How.XPATH , using = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div[2]/div[1]/h2/a/span")
	public WebElement clickTshirts;
	
	@FindBy(how = How.ID , using = "twotabsearchtextbox")
	public WebElement clickSearchBox;
	
	@FindBy(how = How.ID , using = "nav-search-submit-button")
	public WebElement clickSubmitButton;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-xshop\"]/a[6]")
	public WebElement checkTheElement;
	
	
	public void enterFashion() {
		
		clickFashion.click();
	}
	
	public void hoverWomanFashion() {
		
		Actions hover = new Actions(driver);
		hover.moveToElement(hoverWomen).perform();
	}
	
	public void enterClothing() {
		
		clickClothing.click();
	}
	
	public void enterWomenTshirts() {
		
		clickWomenTshirts.click();
	}
	
	public void enterTshirts() {
		
		clickTshirts.click();
	}
	
	public String getTheElement() {
		
		return clickTshirts.getText();
	}
	
	public void enterSearchBox() {
		
		clickSearchBox.sendKeys("Amazon Brand - Symbol Women's Solid Regular Fit Half Sleeve T-Shirt (RN-PO2-COMBO30_Mustard &amp; Burnt Orange_S) (Combo Pack of 2)");
	}
	
	public void enterSubmit() {
		
		clickSubmitButton.click();
	}
	
	public String checkingTheElement() {
		
		return checkTheElement.getText();
	}
}

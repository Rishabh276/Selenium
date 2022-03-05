package com.AssignmentSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchMenShoesPage {
	
WebDriver driver;
	
	public SearchMenShoesPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-xshop\"]/a[6]")
	public WebElement clickFashion;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-subnav\"]/a[3]/span[1]")
	public WebElement hoverMen;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-flyout-aj:https://images-eu.ssl-images-amazon.com/images/G/31/img16/wayfinding/json/subnavmay18.json:subnav-sl-megamenu-2:0\"]/div[2]/div/div[2]/ul/li[1]/a")
	public WebElement clickSportsShoe;
	
	@FindBy(how=How.XPATH , using = "//*[@id=\"s-refinements\"]/div[2]/ul/li[9]/span/a/span")
	public WebElement clickCricketShoe;
	
	@FindBy(how = How.XPATH , using = "/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div[2]/ul/li[1]/span/div/a/div[2]/div[1]/div/span/span[2]/span[2]")
	public WebElement clickTheShoes ; 
	
	@FindBy(how = How.XPATH , using = "//span[@id='productTitle']")
	public WebElement selectedShoes;
	
	@FindBy(how = How.XPATH , using = "//span[normalize-space()='Vector X Blast Cricket Shoes']")
	public WebElement searchedShoes;
	
	
	
	@FindBy(how = How.ID , using = "twotabsearchtextbox")
	public WebElement clickSearchBox;
	
	@FindBy(how = How.ID , using = "nav-search-submit-button")
	public WebElement clickSubmitButton;
	
	@FindBy(how = How.XPATH , using = "//span[@id='productTitle']")
	public WebElement checkTheElement;
	
	
	public void enterFashion() {
		
		clickFashion.click();
	}
	
	public void hoverMenFashion() {
		
		Actions hover = new Actions(driver);
		hover.moveToElement(hoverMen).perform();
	}
	
	
	public void searchedShoes() {
		searchedShoes.click(); 
	}
	
	public void enterSports() {
		
		clickSportsShoe.click();
	}
	
	public void enterCricket() {
		
		clickCricketShoe.click();
	}
	
	public void enterShoes() {
		
		clickTheShoes.click();
	}
	
	public String getTheElement() {
		
		return selectedShoes.getText();
	}
	
	public void enterSearchBox() {
		
		clickSearchBox.sendKeys("Vector X Blast Cricket Shoes");
	}
	
	public void enterSubmit() {
		
		clickSubmitButton.click();
	}
	
	
	
	public String checkingTheElement() {
		
		return checkTheElement.getText();
	}

}

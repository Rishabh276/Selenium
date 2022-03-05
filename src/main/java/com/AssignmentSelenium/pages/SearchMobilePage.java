package com.AssignmentSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchMobilePage {
	
WebDriver driver;
	
	public SearchMobilePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-xshop\"]/a[2]")
	public WebElement clickMobiles;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-subnav\"]/a[2]/span[1]")
	public WebElement hoverMobilesAccessories;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-flyout-aj:https://images-eu.ssl-images-amazon.com/images/G/31/img18/Electronics/Megamenu/megamenumar18f.json:subnav-sl-megamenu-1:0\"]/div[2]/div/div[2]/ul/li[5]/a")
	public WebElement clickApple;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div")
	public WebElement clickTheMobile;
	
	@FindBy(how = How.ID , using = "twotabsearchtextbox")
	public WebElement clickSearchBox;
	
	@FindBy(how = How.ID , using = "nav-search-submit-button")
	public WebElement clickSubmitButton;
	
	@FindBy(how = How.XPATH , using = "//span[normalize-space()='Apple iPhone 12 (64GB) - Green']")
	public WebElement checkTheElement;
	
	
	
	public void enterMobile() {
		
		clickMobiles.click();
	}
	
	public void hoverMobile() {
		
		Actions hover = new Actions(driver);
		hover.moveToElement(hoverMobilesAccessories).perform();
	}
	
	public void enterApple() {
		
		clickApple.click();
	}
	
	public void enterTheMobile() {
		
		clickTheMobile.click();
	}
	
	
	public String getTheMobile() {
		
		return clickTheMobile.getText();
	}
	
	public void enterSearchBox() {
		
		clickSearchBox.sendKeys(" Apple iPhone 12 (64GB) - Green");
	}
	
	public void enterSubmit() {
		
		clickSubmitButton.click();
	}
	
	public String checkingTheElement() {
		
		return checkTheElement.getText();
	}

}

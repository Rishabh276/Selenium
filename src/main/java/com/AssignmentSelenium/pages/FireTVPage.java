package com.AssignmentSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FireTVPage {

	WebDriver driver;
	
	public FireTVPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-hamburger-menu\"]/i")
	public WebElement clickAll;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a/div")
	public WebElement clickFireTV;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"hmenu-content\"]/ul[3]/li[8]/a")
	public WebElement clickFireTVAppsGames;
	
	@FindBy(how = How.XPATH , using = "//span[normalize-space()='YouTube']")
	public WebElement clickYouTube;
	
	
	public void enterAll() {
		clickAll.click();
	}
	
	public void enterFireTV() {
		clickFireTV.click();
	}
	
	public void AppsGames() {
		clickFireTVAppsGames.click();
	}
	
	public void enterYouTube() {
		clickYouTube.click();
	}
	
}

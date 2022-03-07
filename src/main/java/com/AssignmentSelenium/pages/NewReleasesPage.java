package com.AssignmentSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewReleasesPage {

	WebDriver driver;
	
	public NewReleasesPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-hamburger-menu\"]/i")
	public WebElement clickAll;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a")
	public WebElement clickNewRelease;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"anonCarousel1\"]/ol/li[2]/div[2]/div/a[2]/span/div")
	public WebElement clickElement;
	
	
	
	
	public void enterAll() {
		clickAll.click();
	}
	
	public void enterNewRelease() {
		clickNewRelease.click();
	}
	
	public void enterElement() {
		clickElement.click();
	}
}

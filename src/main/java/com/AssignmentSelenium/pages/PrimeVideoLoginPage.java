package com.AssignmentSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PrimeVideoLoginPage {

WebDriver driver;
	
	public PrimeVideoLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-hamburger-menu\"]/i")
	public WebElement clickAll;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"hmenu-content\"]/ul[1]/li[11]/a")
	public WebElement clickAmazonPrime;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"hmenu-content\"]/ul[6]/li[3]/a")
	public WebElement clickAllVideos;
	
	@FindBy(how = How.ID , using = "pv-nav-sign-in")
	public WebElement clickSignIn;
	
	@FindBy(how = How.ID , using = "ap_email")
	public WebElement loginEmail;
	
	@FindBy(how = How.ID , using = "ap_password")
	public WebElement loginPassword;
	
	@FindBy(how = How.ID , using = "signInSubmit")
	public WebElement signInButton;
	
	
	public void enterAll() {
		
		clickAll.click();
	}
	
	public void enterAmazonPrime() {
		
		clickAmazonPrime.click();
	}
	
	public void enterAllVideos() {
		
		clickAllVideos.click();
	}
	
	public void enterSignIn() {
		
		clickSignIn.click();
	}
	
	public void enterEmail() {
		
		loginEmail.sendKeys("6295907017");
	}
	
	public void enterPassword() {
		
		loginPassword.sendKeys("rounak@0609");
	}
	
	public void enterSignInButton() {
		
		signInButton.click();
	}
}

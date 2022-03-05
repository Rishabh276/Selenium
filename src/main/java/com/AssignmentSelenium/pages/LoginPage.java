package com.AssignmentSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-link-accountList\"]")
	public WebElement accountSign;
	
	/*@FindBy(how = How.XPATH , using = "//div[@id=\"nav-link-accountList\"]")
	public WebElement f;*/
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"ap_email\"]")
	public WebElement loginEmail;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"continue\"]")
	public WebElement nextPage;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"ap_password\"]")
	public WebElement loginPassword;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"signInSubmit\"]")
	public WebElement submitSignIn;
	
	
	public void enterSignInButton() {
		
		accountSign.click();
	}
	
	public void enterEmail() {
		
		loginEmail.sendKeys("6295907017");
	}
	
    public void continueToNextPage() {
		
		nextPage.click();
	}
	
	public void enterPassword() {
		
		loginPassword.sendKeys("rounak@0609");
	}
	
	public void signIn() {
		
		submitSignIn.click();
	}

}

package com.AssignmentSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"nav-link-accountList\"]")
	public WebElement accountSign;
	
	@FindBy(how = How.ID , using = "createAccountSubmit")
	public WebElement createAccount;
	
	@FindBy(how = How.ID , using = "ap_customer_name")
	public WebElement customerName;
	
	@FindBy(how = How.ID , using = "ap_phone_number")
	public WebElement phoneNumber;
	
	@FindBy(how = How.ID , using = "ap_email")
	public WebElement emailRegister;
	
	@FindBy(how = How.ID , using = "ap_password")
	public WebElement passwordRegister;
	
	
	
	public void openAccountSign() {
		
		accountSign.click();
	}
	
	public void openCreateAccount() {
		
		createAccount.click();
	}
	
	public void enterName(String name) {
			
		customerName.sendKeys(name);
	}
	
	public void enterPhoneNumber(String number) {
		
		phoneNumber.sendKeys(number);
	}
	
	public void enterEmail(String user) {
		
		emailRegister.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		
		passwordRegister.sendKeys(pass);
	}
	
	/*public void enterConfirmPassword(String pass) {
		
		passwordRegister.sendKeys(pass);
	}*/

}

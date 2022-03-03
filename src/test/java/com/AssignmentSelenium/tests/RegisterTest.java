package com.AssignmentSelenium.tests;

import org.testng.annotations.Test;

import com.AssignmentSelenium.pages.RegisterPage;

public class RegisterTest extends BaseTest {

	@Test
	public void register() {
		
		RegisterPage register = new RegisterPage(driver);
		register.openAccountSign();
		register.openCreateAccount();
		register.enterName("Rounak Banerjee");
		register.enterPhoneNumber("6295907017");
		register.enterEmail("rounakbanerjee327@gmail.com");
		register.enterPassword("Rounak327");
		//register.enterConfirmPassword("Rounak327");
	}
	
}
package com.AssignmentSelenium.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChangeCountryPage {

	WebDriver driver;
	
	public ChangeCountryPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH , using = "//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")
	public WebElement countryIcon;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"icp-flyout-mkt-change\"]/span/div")
	public WebElement changeCountry;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"icp-dropdown\"]/span/span")
	public WebElement  countryDropdown;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"icp-dropdown_14\"]")
	public WebElement choosenCountry;
	
	@FindBy(how=How.XPATH , using = "//*[@id=\"icp-save-button\"]/span/input")
	public WebElement gotoPage;
	
	
	
	
	public void Step1() {
		Actions hover = new Actions(driver);
		hover.moveToElement(countryIcon).perform();

		changeCountry.click();
	}
	
	public void Step2() {

            countryDropdown.click();
            choosenCountry.click();
            gotoPage.click();
		
    }

    public boolean Step3(){
            
            ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(windows.get(1));
            
            String required_domain = "www.amazon.sg";
            String domain = driver.getCurrentUrl().split("/")[2] ;
            
          
            return domain.equals(required_domain);

    }

}

package com.AssignmentSelenium.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {

	static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	static File file = new File("./resources/config.properties");
	static FileInputStream fis = null;
	static Properties prop = new Properties();

	static {

		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	
	@BeforeSuite
	public void setExtent() {
			
		extent = new ExtentReports("./Reports/ExtentReport.html");
	}
	
	@BeforeMethod
	public void startTest(Method method) {
		
		extentTest = extent.startTest(method.getName());
	}
	
	@AfterMethod
	public void endTest() {
		
		extent.endTest(extentTest);
	}
	
	@AfterSuite
	public void endReport() {
		extent.flush();
		extent.close();
	}

	@BeforeSuite
	public static void initializeWebdriver() {
		// Set the path for chromeDriver
		System.setProperty(prop.getProperty("chromedriverProperty"), prop.getProperty("chromedriverPath"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public static void openBrowser() {

		driver.get(prop.getProperty("Url"));
	}

	@AfterSuite
	public static void closeBrowser() {
		driver.quit();

	}
}
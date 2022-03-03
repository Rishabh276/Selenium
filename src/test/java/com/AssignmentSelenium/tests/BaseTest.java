package com.AssignmentSelenium.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {

	static WebDriver driver;
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

	@Test
	public static void initializeWebdriver() {
		// Set the path for chromeDriver
		System.setProperty(prop.getProperty("chromedriverProperty"), prop.getProperty("chromedriverPath"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@Test
	public static void openBrowser() {

		driver.get(prop.getProperty("Url"));
	}

	/*@Test
	public static void closeBrowser() {
		driver.close();

	}*/
}
package com.atmecs.demoautomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest extends Constants{
	WebDriver driver;
	Properties locatorsProperty;
	Properties dataProperty;
	FileInputStream locatorsFile;
	FileInputStream dataFile;
	@BeforeTest
	public void beforeTest() throws InterruptedException, IOException
	{
		System.out.println("TEST EXECUTION BEGINS...");

		locatorsFile = new FileInputStream(System.getProperty("user.dir") + LOCATORS_FILE);
		//System.out.println(LOCATORS_FILE);
		locatorsProperty = new Properties();
		locatorsProperty.load(locatorsFile);
		
		dataFile = new FileInputStream(System.getProperty("user.dir") + DATA_FILE);
		dataProperty = new Properties();
		dataProperty.load(dataFile);
	
		String chromeDriverPath = System.setProperty("user.dir",  CHROME_FILE);
		System.out.println(chromeDriverPath);
		driver=new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Register.html");   
		driver.manage().window().maximize();

	}
		@AfterTest
	public void afterTest() 
	{
		driver.quit();
		System.out.println("TEST EXECUTION ENDS...");
	}
}

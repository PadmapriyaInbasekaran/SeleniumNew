package com.atmecs.demoautomation.basetest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;

import com.atmecs.demoautomation.constants.Constants;
public class BaseTest extends Constants{
	public WebDriver driver;
	Properties locatorsProperty;
	Properties dataProperty;
	FileInputStream locatorsFile;
	FileInputStream dataFile;
	@BeforeMethod
	public void beforeMethod() throws InterruptedException, IOException
	{
		System.out.println("TEST EXECUTION BEGINS...");

		locatorsFile = new FileInputStream(LOCATORS_FILE);
		//System.out.println(LOCATORS_FILE);
		locatorsProperty = new Properties();
		locatorsProperty.load(locatorsFile);

		dataFile = new FileInputStream( DATA_FILE);
		dataProperty = new Properties();
		dataProperty.load(dataFile);

		String chromeDriverPath = System.setProperty("user.dir",  CHROME_FILE);
		System.out.println(chromeDriverPath);
		driver=new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Register.html");   
		driver.manage().window().maximize();

	}
	@AfterMethod
	public void afterMethod() 
	{
		driver.quit();
		System.out.println("TEST EXECUTION ENDS...");
	}
}

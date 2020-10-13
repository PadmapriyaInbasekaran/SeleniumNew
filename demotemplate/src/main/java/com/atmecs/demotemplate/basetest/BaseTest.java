package com.atmecs.demotemplate.basetest;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.atmecs.demotemplate.constants.Constants;


public class BaseTest {
	public  WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void beforeTest(String browser) throws InterruptedException, IOException
	{
		System.out.println("TEST EXECUTION BEGINS...");
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", Constants.GECKO_FILE);
			driver=new FirefoxDriver();
			driver.navigate().to("");   
			driver.manage().window().maximize();
			String expectedTitle = "";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
		}
		else
		{
			System.setProperty("webdriver.chrome.driver",  Constants.CHROME_FILE);
			driver=new ChromeDriver();
			driver.navigate().to("");   
			driver.manage().window().maximize();
			String expectedTitle = "";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
		}
	}
	@AfterMethod
	public void afterTest(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			try 
			{
				TakesScreenshot ts=(TakesScreenshot)driver;
				File source=ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+".png"));

				System.out.println("Screenshot taken");
			} 
			catch (Exception e)
			{

				System.out.println("Exception while taking screenshot "+e.getMessage());
			}  
		}
		System.out.println("Test execution begins..");
		driver.quit();
	}
}

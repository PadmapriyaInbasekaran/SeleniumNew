package com.atmecs.goibibo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUpTest {
	WebDriver driver;
	Properties prop ;
	Properties prop1 ;
	FileInputStream file;
	FileInputStream file1;
	@BeforeTest
	public void beforeTest() throws InterruptedException, IOException
	{
		System.out.println("TEST EXECUTION BEGINS...");
		
		
	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\padmapriya.i\\Downloads\\chromedriver.exe");
		//String chromeDriverPath = System.setProperty("user.dir" ,  "\\chromedriver.exe");
		//System.out.println(chromeDriverPath);
		driver=new ChromeDriver();
		driver.navigate().to("http://www.goibibo.com/flights/");   
		driver.manage().window().maximize();
		
		file = new FileInputStream(System.setProperty("user.dir","\\src\\main\\resources\\locators\\locators.properties"));
		prop = new Properties();
		prop.load(file);
		
		file1 = new FileInputStream(System.setProperty("user.dir","\\src\\main\\resources\\data\\data.properties"));
		prop1 = new Properties();
		prop1.load(file1);
	}
	@Test 
	public void booking() throws InterruptedException, IOException
	{
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		HelperClass h =new HelperClass(driver);
		h.findElementById(prop.getProperty("RoundTrip_id"));
	//	driver.findElement(By.id((prop.getProperty("RoundTrip_id")))).click();
		
		WebElement field1 =	driver.findElement(By.id(prop.getProperty("From_id")));
		field1.click();
		field1.sendKeys(prop1.getProperty("From"));
		Thread.sleep(2000);
		field1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		field1.sendKeys(Keys.ENTER);

		WebElement field2 =	driver.findElement(By.id(prop.getProperty("To_id")));
		field2.click();
		field2.sendKeys(prop1.getProperty("Destination"));
		Thread.sleep(2000);
		field2.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		field2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		h.findElementById(prop.getProperty("Departure_id"));
	//	driver.findElement(By.id(prop.getProperty("Departure_id"))).click();
		
		h.findElementById(prop.getProperty("Date20"));
	//	driver.findElement(By.id(prop.getProperty("Date20"))).click();

		h.findElementById(prop.getProperty("Return_id"));
	//	driver.findElement(By.id(prop.getProperty("Return_id"))).click();
		
		h.findElementById(prop.getProperty("Date22"));
	//	driver.findElement(By.id(prop.getProperty("Date22"))).click();
		Thread.sleep(2000);
		
		h.findElementById(prop.getProperty("Travel_id"));
	//	driver.findElement(By.id(prop.getProperty("Travel_id"))).click();
		Thread.sleep(2000);
		for(int i=0;i<4;i++)
		{
			h.findElementById(prop.getProperty("Passengers"));
		//	driver.findElement(By.id(prop.getProperty("Passengers"))).click();
		}
		h.findElementById(prop.getProperty("Search_btn"));
		
	//	driver.findElement(By.id(prop.getProperty("Search_btn"))).click();
		Thread.sleep(10000);
		
	}
	@AfterMethod
	public void afterMethod() 
	{
		driver.close();
	}
	@AfterTest
	public void afterTest() throws IOException 
	{
		
		System.out.println("TEST EXECUTION ENDS...");
	}
}


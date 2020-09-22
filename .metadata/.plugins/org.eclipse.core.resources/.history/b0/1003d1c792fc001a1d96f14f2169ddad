package com.atmecs.chatbox;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChatBoxTest {
	WebDriver driver;
	Properties prop ;
	Properties prop1 ;
	@BeforeTest
	public void beforeTest() throws InterruptedException, IOException
	{
		System.out.println("TEST EXECUTION BEGINS...");

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\locators.properties");
		prop = new Properties();
		prop.load(file);
		FileInputStream file1 = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\data.properties");
		prop1 = new Properties();
		prop1.load(file1);

	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		String chromeDriverPath = System.setProperty("user.dir",  "\\chromedriver.exe");
		System.out.println(chromeDriverPath);
		driver=new ChromeDriver();
		driver.navigate().to("https://www.phptravels.com/");   
		driver.manage().window().maximize();
	}
	@Test
	public void chatBox() throws InterruptedException, IOException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(10000);
		driver.switchTo().frame("chat-widget");
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("chatIcon"))));
		Thread.sleep(3000);
		WebElement	chatIcon = 	driver.findElement(By.xpath(prop.getProperty("chatIcon")));
		js.executeScript("arguments[0].click();", chatIcon);
		Thread.sleep(3000);
		HelperClass h1 = new HelperClass(driver);
		h1.sendValue(prop.getProperty("Name"), prop1.getProperty("Name"));
		Thread.sleep(5000);
		h1.sendValue(prop.getProperty("WhatsappNumber"), prop1.getProperty("WhatsappNumber"));
		Thread.sleep(3000);
		h1.sendValue(prop.getProperty("Email"), prop1.getProperty("Email"));
		HelperClass h = new HelperClass(driver);
		h.selectElement(prop.getProperty("DropDown"), prop.getProperty("DropDown_Value"));
		Thread.sleep(3000);
		HelperClass h3 = new HelperClass(driver);
		h3.button(prop.getProperty("StartChat"));
	
	
		Thread.sleep(3000);
	}
	@AfterTest
	public void afterTest() 
	{
		driver.quit();
		System.out.println("TEST EXECUTION ENDS...");
	}
}



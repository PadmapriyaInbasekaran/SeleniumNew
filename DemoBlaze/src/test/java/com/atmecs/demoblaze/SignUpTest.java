package com.atmecs.demoblaze;

import java.io.FileInputStream;

//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUpTest {
	WebDriver driver;
	FileInputStream file;
	FileInputStream file1;
	Properties prop;
	Properties prop1;
	@BeforeTest
	public void beforeTest() throws InterruptedException, IOException
	{
		System.out.println("TEST EXECUTION BEGINS...");
		file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\locators\\locators.properties");
		prop = new Properties();
		prop.load(file);
		file1 = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\data\\data.properties");
		prop1 = new Properties();
		prop1.load(file1);
		String chromeDriverPath = System.setProperty("user.dir",  "\\lib\\chromedriver.exe");
		System.out.println(chromeDriverPath);
		driver=new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com");   
		driver.manage().window().maximize();

		System.out.println("Welcome to DEMOBLAZE...");
	}
	@Test
	public void demoBlazeSignUp() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		DemoBlazeHelperClass h2 = new DemoBlazeHelperClass(driver);
		h2.linkText(prop.getProperty("SignUp_LinkText"));
		
		Thread.sleep(1000);
		DemoBlazeHelperClass h = new DemoBlazeHelperClass(driver);
		h.sendValue(prop.getProperty("Uname_Xpath"), prop1.getProperty("Uname"));
		Thread.sleep(1000);
	    h.sendValue(prop.getProperty("Pwd_Id"), prop1.getProperty("Pwd"));
	    
	    DemoBlazeHelperClass h1 = new DemoBlazeHelperClass(driver);
	    h1.button(prop.getProperty("Button_Xpath"));
		
		WebDriverWait wait=new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		h1.button(prop.getProperty("CloseButton_Xpath"));
			}
	@AfterTest
	public void afterTest() 
	{
		System.out.println("TEST EXECUTION ENDS...");
		driver.close();
	}
}
package com.atmecs.demoautomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
		@Test
	public void register() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		DemoAutomationHelperClass helper = new DemoAutomationHelperClass(driver);
		helper.sendValue(locatorsProperty.getProperty("FirstName"), dataProperty.getProperty("FirstName"));
	//	driver.findElement(By.xpath()).sendKeys(); //firstName
		helper.sendValue(locatorsProperty.getProperty("LastName"), dataProperty.getProperty("LastName"));
	//	driver.findElement(By.xpath()).sendKeys(); //lastName
		helper.sendValue(locatorsProperty.getProperty("Address"), dataProperty.getProperty("Address"));
	//	driver.findElement(By.xpath()).sendKeys();  //address
		helper.sendValue(locatorsProperty.getProperty("EmailAdress"), dataProperty.getProperty("EmailAdress"));
	//	driver.findElement(By.xpath()).sendKeys(); //email
		helper.sendValue(locatorsProperty.getProperty("PhoneNo"), dataProperty.getProperty("PhoneNo"));
    
		helper.radioButton(locatorsProperty.getProperty("Gender"));
		helper.checkBox(locatorsProperty.getProperty("Hobby"));
	//	driver.findElement(By.xpath(prop.getProperty("Hobby"))).click();  //hobby
		Thread.sleep(2000);
		helper.dropDownForLanguage(locatorsProperty.getProperty("Language"));
	//	WebElement element8 =	driver.findElement(By.xpath());  
	//	element8.click();
		Thread.sleep(1000);
		helper.dropDownForLanguage(locatorsProperty.getProperty("Danish"));
//		WebElement element9 =	driver.findElement(By.xpath(prop.getProperty("Danish")));
//		element9.click();
//		Thread.sleep(1000);
		helper.dropDownForLanguage(locatorsProperty.getProperty("French"));
//		WebElement element10 =	driver.findElement(By.xpath(prop.getProperty("French")));
//		element10.click();
		driver.findElement(By.xpath(locatorsProperty.getProperty("Form_click"))).click();
		Thread.sleep(10000);
        
		
		helper.dropDown(locatorsProperty.getProperty("Skills"));                   //skills
		        
		helper.dropDown(locatorsProperty.getProperty("Country"));
		helper.dropDown(locatorsProperty.getProperty("SelectCountry"));
		helper.selectYear(locatorsProperty.getProperty("Year")); 
		helper.selectMonth(locatorsProperty.getProperty("Month"));
		
		helper.selectDate(locatorsProperty.getProperty("Date"));
		
		helper.sendValue(locatorsProperty.getProperty("Pwd"), dataProperty.getProperty("Pwd"));
		Thread.sleep(10000);

		helper.sendValue(locatorsProperty.getProperty("ConfirmPwd"), dataProperty.getProperty("ConfirmPwd"));
		helper.buttonClickable("submitbtn");
		Thread.sleep(10000);

	}
	}


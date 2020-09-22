package com.atmecs.demoblaze;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoBlazeHelperClass {
	WebDriver driver;
	Properties prop ;
	Properties prop1 ;
	public DemoBlazeHelperClass(WebDriver driver)
	{
		this.driver = driver;
	}
	public void sendValue(String xpath, String value)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
		public void buttonClickable(String xpath)
	{
		driver.findElement(By.name(xpath)).click();
		
	}
	public void linkText(String value)
	{
		driver.findElement(By.linkText(value)).click();
		
	}
}

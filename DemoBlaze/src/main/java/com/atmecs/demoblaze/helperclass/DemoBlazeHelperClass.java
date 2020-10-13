package com.atmecs.demoblaze.helperclass;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class DemoBlazeHelperClass  {
	public WebDriver driver;
	
	public DemoBlazeHelperClass(WebDriver driver)
	{
		this.driver = driver;
		System.out.println(driver);
	}
	public void sendValue(String xpath, String value)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
		public void buttonClickable(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		
	}
	public void linkText(String value)
	{
		driver.findElement(By.linkText(value)).click();
		System.out.println(value);
		
	}
}

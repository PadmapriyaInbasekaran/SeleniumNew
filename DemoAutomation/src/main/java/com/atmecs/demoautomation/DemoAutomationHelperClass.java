package com.atmecs.demoautomation;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoAutomationHelperClass {
	WebDriver driver;
	Properties prop ;
	Properties prop1 ;
	public DemoAutomationHelperClass(WebDriver driver)
	{
		this.driver = driver;
	}
	public void sendValue(String xpath, String value)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
		public void button(String id)
	{
		driver.findElement(By.id(id)).click();
		
	}
	public void linkText(String xpath)
	{
		driver.findElement(By.linkText(xpath)).click();
		
	}
	public void radioButton(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click(); 
		
	}
	public void checkBox(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click(); 
		
	}
	public void dropDown(String xpath)
	{
		WebElement element1 =	driver.findElement(By.xpath(xpath));  
		element1.click();
		element1.sendKeys(Keys.ARROW_DOWN);
		element1.sendKeys(Keys.ENTER);
		
	}
	public void iconClick(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click(); 
		
	}
}

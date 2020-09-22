package com.atmecs.goibibo;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HelperClass {
	WebDriver driver;
	Properties prop ;
	Properties prop1 ;
	public HelperClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void sendValue(String xpath, String value)
	{
		driver.findElement(By.id(xpath)).sendKeys(prop1.getProperty(value));
	}
	public void button(String xpath)
	{
		driver.findElement(By.name(xpath)).click();
		
	}
	public void getText(String id)
	{
		WebElement text = 	driver.findElement(By.id(id));
		System.out.println(text.getText());	
	}
	
}

package com.atmecs.goibibo.helperclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HelperClass  {
	 public WebDriver driver;
	public HelperClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void sendKeys(String xpath, String value)
	{
		driver.findElement(By.id(xpath)).sendKeys(value);
	}
	public void buttonClickableByName(String name)
	{
		driver.findElement(By.name(name)).click();
		
	}
	public void getText(String id)
	{
		WebElement text = 	driver.findElement(By.id(id));
		System.out.println(text.getText());	
	}
	public void findElementBylinkText(String value)
	{
		driver.findElement(By.linkText(value)).click();
		
	}
	public void findElementById(String id)
	{
		driver.findElement(By.id((id))).click();
		
	}
	public void findElementByXpath(String xpath)
	{
		driver.findElement(By.xpath((xpath))).click();
		
	}
}

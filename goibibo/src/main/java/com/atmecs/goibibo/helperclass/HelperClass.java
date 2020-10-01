package com.atmecs.goibibo.helperclass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	public void from(String id, String value) throws InterruptedException
	{
		WebElement field1 =	driver.findElement(By.id(id));
		field1.click();
		field1.sendKeys(value);
		Thread.sleep(2000);
		field1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		field1.sendKeys(Keys.ENTER);
		
	}
	public void to(String id, String value) throws InterruptedException
	{
		WebElement field2 =	driver.findElement(By.id(id));
		field2.click();
		field2.sendKeys(value);
		Thread.sleep(2000);
		field2.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		field2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
}

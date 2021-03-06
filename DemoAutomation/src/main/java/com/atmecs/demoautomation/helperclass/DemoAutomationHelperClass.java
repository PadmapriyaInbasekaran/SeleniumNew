package com.atmecs.demoautomation.helperclass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoAutomationHelperClass {
	public	WebDriver driver;

	public DemoAutomationHelperClass(WebDriver driver)
	{
		this.driver = driver;
	}
	public void sendValue(String xpath, String value)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	public void buttonClickable(String id)
	{
		driver.findElement(By.id(id)).click();

	}
	public void linkText(String value)
	{
		driver.findElement(By.linkText(value)).click();

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
	public void dropDownForLanguage(String xpath) throws InterruptedException
	{
		WebElement element1 =	driver.findElement(By.xpath(xpath));  
		Thread.sleep(3000);
		element1.click();
		Thread.sleep(1000);

	}
	public void selectYear(String id) throws InterruptedException
	{
		WebElement element3 = driver.findElement(By.id(id));
		Thread.sleep(1000);
		element3.click();
		Thread.sleep(1000);
		for(int i=0;i<10;i++)
		{
			element3.sendKeys(Keys.ARROW_DOWN);
		}
		element3.sendKeys(Keys.ENTER);
		Thread.sleep(5000); 

	}
	public void selectMonth(String xpath) throws InterruptedException
	{
		WebElement element4 = driver.findElement(By.xpath(xpath));
		Thread.sleep(1000);
		element4.click();
		Thread.sleep(1000);
		for(int i=0;i<5;i++)
		{
			element4.sendKeys(Keys.ARROW_DOWN);
		}
		element4.sendKeys(Keys.ENTER);
		Thread.sleep(5000); 

	}
	public void selectDate(String id) throws InterruptedException
	{
		WebElement element5 = driver.findElement(By.id(id));
		Thread.sleep(1000);
		element5.click();
		Thread.sleep(1000);
		for(int i=0;i<10;i++)
		{
			element5.sendKeys(Keys.ARROW_DOWN);
		}
		element5.sendKeys(Keys.ENTER);
		Thread.sleep(10000);


	}
}

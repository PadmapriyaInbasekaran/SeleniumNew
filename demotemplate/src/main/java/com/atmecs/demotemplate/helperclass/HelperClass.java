package com.atmecs.demotemplate.helperclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HelperClass {
	public WebDriver driver;
	public HelperClass(WebDriver driver)
	{
		this.driver = driver;
	}
	public void selectElementFromDropdown(String xpath, String value) throws InterruptedException 
	{
		Select s=new Select(driver.findElement(By.xpath(xpath)));
		Thread.sleep(1000);
		s.selectByValue(value);
		Thread.sleep(1000);
	}
	public void sendKeyUsingId(String id, String value) throws InterruptedException
	{

		WebElement Element = driver.findElement(By.id(id));
		Thread.sleep(2000);
		Assert.assertEquals(true,Element.isEnabled());
		Element.click();
		Thread.sleep(2000);
		Element.sendKeys(value);
	}
	public void sendKeyUsingXpath(String xpath, String value) throws InterruptedException
	{

		WebElement Element = driver.findElement(By.xpath(xpath));
		Thread.sleep(2000);
		Assert.assertEquals(true,Element.isEnabled());
		Element.click();
		Thread.sleep(2000);
		Element.sendKeys(value);

	}

	public void buttonClick(String xpath)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Buttons = driver.findElement(By.xpath(xpath));
		Assert.assertEquals(true,Buttons.isDisplayed());
		js.executeScript("arguments[0].click();", Buttons);

	}

}



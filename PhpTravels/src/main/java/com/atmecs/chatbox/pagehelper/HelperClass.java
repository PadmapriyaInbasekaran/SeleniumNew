package com.atmecs.chatbox.pagehelper;
import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class HelperClass {
	public WebDriver driver;

	public HelperClass(WebDriver driver)
	{
		this.driver = driver;
		System.out.println("HelperClass " +driver);
	}
	public void selectElementFromDropdown(String xpath, String value) throws InterruptedException 
	{
		Select s=new Select(driver.findElement(By.xpath(xpath)));
		Thread.sleep(1000);
		s.selectByValue(value);
        Thread.sleep(1000);
	}
	public void sendKey(String id, String value) throws InterruptedException
	{
		WebElement Element = driver.findElement(By.id(id));
		Thread.sleep(2000);
		Element.click();
		Thread.sleep(2000);
		Element.sendKeys(value);
	}
	public void sendKeyForWatsappNum(String xpath, String value) throws InterruptedException
	{
		WebElement Element = driver.findElement(By.xpath(xpath));
		Thread.sleep(2000);
		Element.click();
		Thread.sleep(2000);
		Element.sendKeys(value);
	}
	public void buttonClickable(String xpath)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Buttons = driver.findElement(By.xpath(xpath));
		js.executeScript("arguments[0].click();", Buttons);

	}
	public void chatIconMethod(String xpath) throws InterruptedException
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebElement Buttons = driver.findElement(By.xpath(xpath));
		//	js.executeScript("arguments[0].click();", Buttons);
		WebElement icon =	driver.findElement(By.xpath(xpath));
		Thread.sleep(1000);
		System.out.println("Icon" +icon);
		icon.click();
	}
}

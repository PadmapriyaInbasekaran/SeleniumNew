package com.atmecs.chatbox;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HelperClass  {
WebDriver driver;
Properties prop ;
Properties prop1 ;
public HelperClass(WebDriver driver)
{
	this.driver = driver;
}

public void selectElement(String xpath, String value) throws IOException
{
	Select s=new Select(driver.findElement(By.xpath(xpath)));
	s.selectByValue(value);
	
}
public void sendValue(String xpath, String value)
{
	WebElement Element = driver.findElement(By.id(xpath));
	Element.click();
	Element.sendKeys(value);
}
public void button(String xpath)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement Buttons = driver.findElement(By.xpath(xpath));
	js.executeScript("arguments[0].click();", Buttons);
	
}
}

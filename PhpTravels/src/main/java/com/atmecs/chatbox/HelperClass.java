package com.atmecs.chatbox;
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

public void selectElementFromDropdown(String xpath, String value) 
{
	Select s=new Select(driver.findElement(By.xpath(xpath)));
	s.selectByValue(value);
	
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
public void chatIcon(String xpath)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement Buttons = driver.findElement(By.xpath(xpath));
	js.executeScript("arguments[0].click();", Buttons);
	
}
}

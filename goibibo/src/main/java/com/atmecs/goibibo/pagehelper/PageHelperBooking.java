package com.atmecs.goibibo.pagehelper;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.goibibo.utilities.*;
import com.atmecs.goibibo.basefile.BaseFile;
import com.atmecs.goibibo.constants.*;
import com.atmecs.goibibo.helperclass.HelperClass;
//import com.atmecs.goibibo.constants.*;
public class PageHelperBooking extends BaseFile{
	public	WebDriver driver;
	public PageHelperBooking(WebDriver driver)
	{
		this.driver = driver;
		System.out.println(driver);
	}
	Properties Location_path,Data_path;
	
	public void booking() throws InterruptedException, IOException
	{
		Location_path = UtilitiesClass.readProperty(Constants.LOCATORS_FILE);
		Data_path = UtilitiesClass.readProperty(Constants.DATA_FILE);
		HelperClass helper =new HelperClass(driver);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		helper.findElementById(Location_path.getProperty("RoundTrip_id"));
		WebElement field1 =	driver.findElement(By.id(Location_path.getProperty("From_id")));
		field1.click();
		field1.sendKeys(Data_path.getProperty("From"));
		Thread.sleep(2000);
		field1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		field1.sendKeys(Keys.ENTER);

		WebElement field2 =	driver.findElement(By.id(Location_path.getProperty("To_id")));
		field2.click();
		field2.sendKeys(Data_path.getProperty("Destination"));
		Thread.sleep(2000);
		field2.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		field2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		helper.findElementById(Location_path.getProperty("Departure_id"));
		helper.findElementById(Location_path.getProperty("Date20"));
		helper.findElementById(Location_path.getProperty("Return_id"));
		helper.findElementById(Location_path.getProperty("Date22"));
		Thread.sleep(2000);
		
		helper.findElementById(Location_path.getProperty("Travel_id"));
		Thread.sleep(2000);
		for(int i=0;i<4;i++)
		{
			helper.findElementById(Location_path.getProperty("Passengers"));
				}
		helper.findElementById(Location_path.getProperty("Search_btn"));
		Thread.sleep(10000);
		
	}
}

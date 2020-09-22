package com.atmecs.goibibo;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignUpTest extends BaseFile{
	@Test 
	public void booking() throws InterruptedException, IOException
	{
		HelperClass helper =new HelperClass(driver);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		helper.findElementById(locatorsProperty.getProperty("RoundTrip_id"));
		WebElement field1 =	driver.findElement(By.id(locatorsProperty.getProperty("From_id")));
		field1.click();
		field1.sendKeys(dataProperty.getProperty("From"));
		Thread.sleep(2000);
		field1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		field1.sendKeys(Keys.ENTER);

		WebElement field2 =	driver.findElement(By.id(locatorsProperty.getProperty("To_id")));
		field2.click();
		field2.sendKeys(dataProperty.getProperty("Destination"));
		Thread.sleep(2000);
		field2.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		field2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		helper.findElementById(locatorsProperty.getProperty("Departure_id"));
		helper.findElementById(locatorsProperty.getProperty("Date20"));
		helper.findElementById(locatorsProperty.getProperty("Return_id"));
		helper.findElementById(locatorsProperty.getProperty("Date22"));
		Thread.sleep(2000);
		
		helper.findElementById(locatorsProperty.getProperty("Travel_id"));
		Thread.sleep(2000);
		for(int i=0;i<4;i++)
		{
			helper.findElementById(locatorsProperty.getProperty("Passengers"));
				}
		helper.findElementById(locatorsProperty.getProperty("Search_btn"));
		Thread.sleep(10000);
		
	}
	
}


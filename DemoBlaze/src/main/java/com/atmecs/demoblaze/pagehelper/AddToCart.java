package com.atmecs.demoblaze.pagehelper;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import com.atmecs.demoblaze.basetest.BaseTest;
import com.atmecs.demoblaze.constants.Constants;
import com.atmecs.demoblaze.helperclass.DemoBlazeHelperClass;
import com.atmecs.demoblaze.utilityclass.UtilityClass;
public class AddToCart {
	public WebDriver driver;
	Properties Location_path,Data_path;
	public AddToCart(WebDriver driver)
	{
		this.driver = driver;
	//	System.out.println("PageHelper a" +driver);
	}
	public void demoBlazeAddToCart() throws InterruptedException
	{
		Location_path = UtilityClass.readProperty(Constants.LOCATORS_FILE);
		Data_path = UtilityClass.readProperty(Constants.DATA_FILE);
		DemoBlazeHelperClass helper = new DemoBlazeHelperClass(driver);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		helper.linkText(Location_path.getProperty("Product_LinkText"));
		helper.linkText(Location_path.getProperty("AddToCart_Button"));
		WebDriverWait wait = new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();
	
}
}

package com.atmecs.demoblaze.pagehelper;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import com.atmecs.demoblaze.basetest.BaseTest;
import com.atmecs.demoblaze.constants.Constants;
import com.atmecs.demoblaze.helperclass.DemoBlazeHelperClass;
import com.atmecs.demoblaze.utilityclass.UtilityClass;

public class VerifyCart extends BaseTest{
	//public WebDriver driver;
	Properties Location_path,Data_path;
	public VerifyCart(WebDriver driver)
	{
		this.driver = driver;
		//System.out.println("PageHelper e" +driver);
	}

	public void demoBlazeVerifyCart() throws InterruptedException
	{
		Location_path=UtilityClass.readProperty(Constants.LOCATORS_FILE);
		Data_path=UtilityClass.readProperty(Constants.DATA_FILE);
		DemoBlazeHelperClass helper = new DemoBlazeHelperClass(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		helper.linkText(Location_path.getProperty("CartVerify_LinkText"));
	}	
}

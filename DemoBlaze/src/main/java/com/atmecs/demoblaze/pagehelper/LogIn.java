package com.atmecs.demoblaze.pagehelper;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import com.atmecs.demoblaze.constants.Constants;
import com.atmecs.demoblaze.helperclass.DemoBlazeHelperClass;
import com.atmecs.demoblaze.utilityclass.UtilityClass;
public class LogIn extends UtilityClass{
	public WebDriver driver;
	Properties Location_path,Data_path;
	public LogIn(WebDriver driver)
	{
		this.driver = driver;
	//	System.out.println("PageHelper c" +driver);
	}

	public void demoBlazeLogIn() throws InterruptedException
	{
		Location_path = UtilityClass.readProperty(Constants.LOCATORS_FILE);
		Data_path = UtilityClass.readProperty(Constants.DATA_FILE);
		DemoBlazeHelperClass helper = new DemoBlazeHelperClass(driver);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		helper.linkText(Location_path.getProperty("LogIn_LinkText"));
		helper.sendValue(Location_path.getProperty("Uname_Id"), Data_path.getProperty("LogInName"));
		helper.sendValue(Location_path.getProperty("LoginPwd_Id"), Data_path.getProperty("LogInPwd"));
		helper.buttonClickable(Location_path.getProperty("Button"));
	}

}

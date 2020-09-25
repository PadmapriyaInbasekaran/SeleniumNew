package com.atmecs.demoblaze.pagehelper;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.atmecs.demoblaze.helperclass.DemoBlazeHelperClass;
import com.atmecs.demoblaze.utilityclass.UtilityClass;
import com.atmecs.demoblaze.constants.*;
public class SignUp extends UtilityClass{
	public WebDriver driver;
	Properties Location_path,Data_path;
	public SignUp(WebDriver driver)
	{
		this.driver = driver;
		//System.out.println("PageHelper d" +driver);
	}
	
	public void demoBlazeSignUp() throws InterruptedException
	{
		Location_path=UtilityClass.readProperty(Constants.LOCATORS_FILE);
		Data_path=UtilityClass.readProperty(Constants.DATA_FILE);
		DemoBlazeHelperClass helper = new DemoBlazeHelperClass(driver);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		helper.linkText(Location_path.getProperty("SignUp_LinkText"));
		Thread.sleep(1000);
		helper.sendValue(Location_path.getProperty("Uname_Xpath"), Data_path.getProperty("Uname"));
		Thread.sleep(1000);
		helper.sendValue(Location_path.getProperty("Pwd_Id"), Data_path.getProperty("Pwd"));
		helper.buttonClickable(Location_path.getProperty("Button_Xpath"));
		
		WebDriverWait wait=new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		helper.buttonClickable(Location_path.getProperty("CloseButton_Xpath"));
			}

}

package com.atmecs.demoblaze;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest{
		@Test
	public void demoBlazeLogIn() throws InterruptedException
	{
		DemoBlazeHelperClass helper = new DemoBlazeHelperClass(driver);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		helper.linkText(locatorsProperty.getProperty("LogIn_LinkText"));
		helper.sendValue(locatorsProperty.getProperty("Uname_Id"), dataProperty.getProperty("LogInName"));
		helper.sendValue(locatorsProperty.getProperty("LoginPwd_Id"), dataProperty.getProperty("LogInPwd"));
		helper.buttonClickable(locatorsProperty.getProperty("Button"));
		}
	
}


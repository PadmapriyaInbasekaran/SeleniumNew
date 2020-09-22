package com.atmecs.demoblaze;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class VerifyCartTest extends BaseTest{
	@Test
	public void demoBlazeVerifyCart() throws InterruptedException
	{
		DemoBlazeHelperClass helper = new DemoBlazeHelperClass(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		helper.linkText(locatorsProperty.getProperty("CartVerify_LinkText"));
		}	
	}


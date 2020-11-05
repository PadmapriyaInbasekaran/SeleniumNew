package com.atmecs.gmail.test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.atmecs.gmail.constants.Constants;
import com.atmecs.gmail.helperclass.HelperClass;
import com.atmecs.gmail.utilities.UtilitiesClass;
import com.atmecs.gmail.basetest.BaseTest;
public class DemoTest extends BaseTest{
	Properties locationPath;
	@Test(dataProvider = "Data", dataProviderClass = DemoTestDataProvider.class)
	public void demoTest(String Email, String Password)
		{
		locationPath = UtilitiesClass.readProperty(Constants.LOCATORS_FILE);
		HelperClass helper =new HelperClass(driver);
      driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
     // helper.findElementById(locationPath.getProperty("RoundTrip_id"));
	}
}

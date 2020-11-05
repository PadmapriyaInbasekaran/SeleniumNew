package com.atmecs.goibibo;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.atmecs.goibibo.basefile.BaseFile;
import com.atmecs.goibibo.constants.Constants;
import com.atmecs.goibibo.helperclass.HelperClass;
import com.atmecs.goibibo.utilities.UtilitiesClass;
public class BookingTest extends BaseFile{
	Properties locationPath;
	@Test(dataProvider = "Data" ,dataProviderClass = BookingTestDataProvider.class)
	public void bookingTest(String From, String To) throws InterruptedException
	{
		locationPath = UtilitiesClass.readProperty(Constants.LOCATORS_FILE);
				HelperClass helper =new HelperClass(driver);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		helper.findElementById(locationPath.getProperty("RoundTrip_id"));
		helper.from(locationPath.getProperty("From_id"), From);
	    helper.to(locationPath.getProperty("To_id"), To);
		helper.findElementById(locationPath.getProperty("Departure_id"));
		helper.findElementById(locationPath.getProperty("Date20"));
		helper.findElementById(locationPath.getProperty("Return_id"));
		helper.findElementById(locationPath.getProperty("Date22"));
		Thread.sleep(2000);
		helper.findElementById(locationPath.getProperty("Travel_id"));
		Thread.sleep(2000);
		for(int i=0;i<4;i++)
		{
			helper.findElementById(locationPath.getProperty("Passengers"));
				}
		helper.findElementById(locationPath.getProperty("Search_btn"));
		Thread.sleep(10000);
		}
	}

	
	
	


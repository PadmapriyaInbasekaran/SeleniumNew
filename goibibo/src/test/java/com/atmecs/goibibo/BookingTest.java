package com.atmecs.goibibo;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.goibibo.basefile.BaseFile;
import com.atmecs.goibibo.helperclass.HelperClass;
import com.atmecs.goibibo.pagehelper.PageHelperBooking;
import com.atmecs.goibibo.utilities.UtilitiesClass;
public class BookingTest extends BaseFile{
	//public WebDriver driver;
	@Test
	public void bookingTest()
	{
		PageHelperBooking p = new PageHelperBooking(driver);
		try {
			p.booking();
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

	
	
	


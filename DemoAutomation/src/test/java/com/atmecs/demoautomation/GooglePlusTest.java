package com.atmecs.demoautomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GooglePlusTest extends BaseTest{
	@Test
	public void googlePlus()
	{
		DemoAutomationHelperClass helper = new DemoAutomationHelperClass(driver);
        helper.iconClick(locatorsProperty.getProperty("GPlusIconId"));
	//	driver.findElement(By.xpath(prop.getProperty("GPlusIconId"))).click();
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

			String child_window=I1.next();


			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();
			}

		}
		//switch to the parent window
		driver.switchTo().window(parent);

	}
	}


package com.atmecs.demoautomation;

import java.util.Iterator;

import java.util.Set;
import org.testng.annotations.Test;

public class FaceBookTest extends BaseTest{
	@Test
	public void faceBook()
	{
		DemoAutomationHelperClass helper = new DemoAutomationHelperClass(driver);
        helper.iconClick(locatorsProperty.getProperty("FBiconId"));
		//driver.findElement(By.xpath(prop.getProperty("FBiconId"))).click();
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


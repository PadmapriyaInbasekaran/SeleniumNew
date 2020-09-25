package com.atmecs.demoautomation.pagehelper;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.atmecs.demoautomation.constants.Constants;
import com.atmecs.demoautomation.helperclass.DemoAutomationHelperClass;
import com.atmecs.demoautomation.utilityclass.UtilityClass;

public class FaceBook {
	WebDriver driver;
	Properties Location_path,Data_path;
	public FaceBook(WebDriver driver) {
		this.driver = driver;
	}
	public void faceBook()
	{
		Location_path=UtilityClass.readProperty(Constants.LOCATORS_FILE);
		Data_path=UtilityClass.readProperty(Constants.DATA_FILE);
		DemoAutomationHelperClass helper = new DemoAutomationHelperClass(driver);
		helper.iconClick(Location_path.getProperty("FBiconId"));
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

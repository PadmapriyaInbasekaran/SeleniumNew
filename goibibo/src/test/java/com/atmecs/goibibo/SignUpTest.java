package com.atmecs.goibibo;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.testng.annotations.Test;
import com.atmecs.goibibo.basefile.BaseFile;
import com.atmecs.goibibo.constants.Constants;
import com.atmecs.goibibo.helperclass.HelperClass;

import com.atmecs.goibibo.utilities.UtilitiesClass;
public class SignUpTest extends BaseFile{
	Properties locationPath;
	@Test(dataProvider = "Data" ,dataProviderClass = SignUpTestDataProvider.class)
	public void signUpTest(String FacebookUname, String FacebookPwd) throws InterruptedException
	{
		
		locationPath = UtilitiesClass.readProperty(Constants.LOCATORS_FILE);
			HelperClass helper = new HelperClass(driver);
			Thread.sleep(2000);
			helper.findElementById(locationPath.getProperty("SignUp_id"));
			Thread.sleep(5000);
			driver.switchTo().frame("authiframe");
			Thread.sleep(2000);
			helper.findElementByXpath(locationPath.getProperty("SignInToFB"));
			Thread.sleep(2000);
			String parent=driver.getWindowHandle();
			Set<String>s=driver.getWindowHandles();
			
			Iterator<String> I1= s.iterator();
			while(I1.hasNext())
			{
				String child_window=I1.next();
				if(!parent.equals(child_window))
				{
					driver.switchTo().window(child_window);
					
					helper.sendKeys(locationPath.getProperty("FacebookUname"),FacebookUname );
					helper.sendKeys(locationPath.getProperty("FacebookPwd"), FacebookPwd);
					helper.buttonClickableByName(locationPath.getProperty("LoginButton"));
					Thread.sleep(5000);
					helper.getText(locationPath.getProperty("ErrorMessage"));
					Thread.sleep(5000);
				}
			
		
			}
	}
}

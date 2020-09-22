package com.atmecs.goibibo;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.testng.annotations.Test;

public class BookingTest extends BaseFile{
	@Test
	public void signup() throws InterruptedException, IOException
	{
		HelperClass helper = new HelperClass(driver);
		Thread.sleep(2000);
		helper.findElementById(locatorsProperty.getProperty("SignUp_id"));
		Thread.sleep(5000);
		driver.switchTo().frame("authiframe");
		Thread.sleep(2000);
		helper.findElementByXpath(locatorsProperty.getProperty("SignInToFB"));
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
				
				helper.sendKeys(locatorsProperty.getProperty("FacebookUname"), dataProperty.getProperty("FacebookUname"));
				helper.sendKeys(locatorsProperty.getProperty("FacebookPwd"), dataProperty.getProperty("FacebookPwd"));
				helper.buttonClickableByName(locatorsProperty.getProperty("LoginButton"));
				Thread.sleep(5000);
				helper.getText(locatorsProperty.getProperty("ErrorMessage"));

			}
		}

	}
	
	
}

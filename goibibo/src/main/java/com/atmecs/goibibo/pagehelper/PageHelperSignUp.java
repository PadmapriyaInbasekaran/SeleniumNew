//package com.atmecs.goibibo.pagehelper;
//
//import java.io.IOException;
//
//import java.util.Iterator;
//import java.util.Properties;
//import java.util.Set;
//import org.openqa.selenium.WebDriver;
//import com.atmecs.goibibo.basefile.BaseFile;
//import com.atmecs.goibibo.constants.Constants;
//import com.atmecs.goibibo.helperclass.HelperClass;
//import com.atmecs.goibibo.utilities.UtilitiesClass;
//public class PageHelperSignUp extends BaseFile{
////public	WebDriver driver;
//	public PageHelperSignUp(WebDriver driver)
//	{
//		this.driver = driver;
//		System.out.println(driver);
//	}
//	Properties Location_path,Data_path;
//	
//	public void signup() throws InterruptedException, IOException
//	{
//		Location_path = UtilitiesClass.readProperty(Constants.LOCATORS_FILE);
//		Data_path = UtilitiesClass.readProperty(Constants.DATA_FILE);
//		HelperClass helper = new HelperClass(driver);
//		Thread.sleep(2000);
//		helper.findElementById(Location_path.getProperty("SignUp_id"));
//		Thread.sleep(5000);
//		driver.switchTo().frame("authiframe");
//		Thread.sleep(2000);
//		helper.findElementByXpath(Location_path.getProperty("SignInToFB"));
//		Thread.sleep(2000);
//		String parent=driver.getWindowHandle();
//		Set<String>s=driver.getWindowHandles();
//		
//		Iterator<String> I1= s.iterator();
//		while(I1.hasNext())
//		{
//			String child_window=I1.next();
//			if(!parent.equals(child_window))
//			{
//				driver.switchTo().window(child_window);
//				
//				helper.sendKeys(Location_path.getProperty("FacebookUname"), Data_path.getProperty("FacebookUname"));
//				helper.sendKeys(Location_path.getProperty("FacebookPwd"), Data_path.getProperty("FacebookPwd"));
//				helper.buttonClickableByName(Location_path.getProperty("LoginButton"));
//				Thread.sleep(5000);
//				helper.getText(Location_path.getProperty("ErrorMessage"));
//
//			}
//		
//	
//		}
//}
//}

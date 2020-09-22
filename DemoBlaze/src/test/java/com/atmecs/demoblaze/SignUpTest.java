package com.atmecs.demoblaze;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{
	
	@Test
	public void demoBlazeSignUp() throws InterruptedException
	{
		DemoBlazeHelperClass helper = new DemoBlazeHelperClass(driver);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		helper.linkText(locatorsProperty.getProperty("SignUp_LinkText"));
		Thread.sleep(1000);
		helper.sendValue(locatorsProperty.getProperty("Uname_Xpath"), dataProperty.getProperty("Uname"));
		Thread.sleep(1000);
		helper.sendValue(locatorsProperty.getProperty("Pwd_Id"), dataProperty.getProperty("Pwd"));
		helper.buttonClickable(locatorsProperty.getProperty("Button_Xpath"));
		
		WebDriverWait wait=new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		helper.buttonClickable(locatorsProperty.getProperty("CloseButton_Xpath"));
			}
	
}
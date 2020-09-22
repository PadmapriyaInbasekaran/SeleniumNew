package com.atmecs.demoblaze;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {
	@Test
	public void demoBlazeAddToCart() throws InterruptedException
	{
		DemoBlazeHelperClass helper = new DemoBlazeHelperClass(driver);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		helper.linkText(locatorsProperty.getProperty("Product_LinkText"));
		helper.linkText(locatorsProperty.getProperty("AddToCart_Button"));
		WebDriverWait wait=new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();
	
}
	}


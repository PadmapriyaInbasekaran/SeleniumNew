package com.atmecs.chatbox;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ChatBoxTest extends BaseTest{
	
	@Test
	public void chatBox() throws InterruptedException, IOException
	{
		HelperClass helper = new HelperClass(driver);
		Thread.sleep(10000);
		driver.switchTo().frame("chat-widget");
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorsProperty.getProperty("chatIcon"))));
		Thread.sleep(3000);
		helper.chatIcon(locatorsProperty.getProperty("chatIcon"));	
		Thread.sleep(3000);
		helper.sendKey(locatorsProperty.getProperty("Name"), dataProperty.getProperty("Name"));
		Thread.sleep(5000);
		helper.sendKeyForWatsappNum(locatorsProperty.getProperty("WhatsappNumber"), dataProperty.getProperty("WhatsappNumber"));
		Thread.sleep(3000);
		helper.sendKey(locatorsProperty.getProperty("Email"), dataProperty.getProperty("Email"));
		helper.selectElementFromDropdown(locatorsProperty.getProperty("DropDown"), dataProperty.getProperty("DropDown_Value"));
		Thread.sleep(3000);
		helper.buttonClickable(locatorsProperty.getProperty("StartChat"));
	
	
		Thread.sleep(3000);
	}
	
}



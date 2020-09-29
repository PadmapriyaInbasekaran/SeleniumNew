package com.atmecs.chatbox.PageFile;
import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.chatbox.constants.Constants;
import com.atmecs.chatbox.pagehelper.HelperClass;
import com.atmecs.chatbox.utilitiesfile.*;

public class PageHelper  {
	public WebDriver driver;
	Properties Location_path,Data_path;
	public PageHelper(WebDriver driver)
	{
		this.driver = driver;
		System.out.println("PageHelper " +driver);
	}
	public void chatBox() throws InterruptedException, IOException
	{
		Location_path=UtilitiesClass.readProperty(Constants.LOCATORS_FILE);
		Data_path=UtilitiesClass.readProperty(Constants.DATA_FILE);
		HelperClass helper = new HelperClass(driver);
		Thread.sleep(20000);
		driver.switchTo().frame("chat-widget");
		System.out.println("Inside frame successfully");

		Thread.sleep(3000);

		helper.chatIconMethod(Location_path.getProperty("chatIcon"));
		Thread.sleep(3000);
		helper.sendKey(Location_path.getProperty("Name"), Data_path.getProperty("Name"));
		Thread.sleep(5000);
		helper.sendKeyForWatsappNum(Location_path.getProperty("WhatsappNumber"), Data_path.getProperty("WhatsappNumber"));
		Thread.sleep(3000);
		helper.sendKey(Location_path.getProperty("Email"), Data_path.getProperty("Email"));
		Thread.sleep(3000);
	//	helper.selectElementFromDropdown(Location_path.getProperty("DropDown"), Data_path.getProperty("DropDown_Value"));
		Thread.sleep(3000);
		helper.buttonClickable(Location_path.getProperty("StartChat"));


		Thread.sleep(3000);
	}

}

package com.atmecs.exceldata;
import java.util.Properties;

import org.testng.annotations.Test;
import com.atmecs.chatbox.basefile.BaseTest;
import com.atmecs.chatbox.constants.Constants;
import com.atmecs.chatbox.pagehelper.HelperClass;

import com.atmecs.chatbox.utilitiesfile.UtilitiesClass;
public class ExcelData extends BaseTest{
	Properties locationPath;

	@Test(dataProvider = "Data" ,dataProviderClass = ReadExcelSheet.class)
	public void ReadData(String userName, String watsappNumber, String emailId) throws InterruptedException
     {
		locationPath = UtilitiesClass.readProperty(Constants.LOCATORS_FILE);
 		HelperClass helper = new HelperClass(driver);
		Thread.sleep(20000);
		driver.switchTo().frame("chat-widget");
		Thread.sleep(3000);
	    helper.chatIconMethod(locationPath.getProperty("chatIcon"));
        helper.sendKeyByXpath(locationPath.getProperty("Name"), userName);
        helper.sendKeyForWatsappNum(locationPath.getProperty("WhatsappNumber"), watsappNumber);
        helper.sendKey(locationPath.getProperty("Email"), emailId);
        Thread.sleep(3000);
		helper.buttonClickable(locationPath.getProperty("StartChat"));


		Thread.sleep(3000);

     } 
	}
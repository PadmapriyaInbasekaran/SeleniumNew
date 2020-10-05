package com.atmecs.exceldata;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import com.atmecs.chatbox.basefile.BaseTest;
import com.atmecs.chatbox.constants.Constants;
import com.atmecs.chatbox.pagehelper.HelperClass;

import com.atmecs.chatbox.utilitiesfile.UtilitiesClass;
public class ExcelTest extends BaseTest{
	Properties locationPath;

	@Test(dataProvider = "Data" ,dataProviderClass = DataProviderClass.class)
	public void ReadData(String userName, String watsappNumber, String emailId) throws InterruptedException
     {
		Logger logger = Logger.getLogger(ExcelTest.class);
	//	PropertyConfigurator.configure("Log4j.properties");
		locationPath = UtilitiesClass.readProperty(Constants.LOCATORS_FILE);
 		HelperClass helper = new HelperClass(driver);
		Thread.sleep(20000);
		driver.switchTo().frame("chat-widget");
		Thread.sleep(3000);
	    helper.chatIconMethod(locationPath.getProperty("chatIcon"));
	    logger.info("Sending Username...");
        helper.sendKeyByXpath(locationPath.getProperty("Name"), userName);
        logger.info("Sending Whatsapp Number...");
        helper.sendKeyForWatsappNum(locationPath.getProperty("WhatsappNumber"), watsappNumber);
        logger.info("Sending Email Id...");
        helper.sendKey(locationPath.getProperty("Email"), emailId);
        Thread.sleep(3000);
        logger.info("Selecting option from dropdown...");
      helper.selectElementFromDropdown(locationPath.getProperty("DropDown"),locationPath.getProperty("DropDown_Value"));
      logger.info("Clicking on chat icon to start the chat...");
      helper.buttonClickable(locationPath.getProperty("StartChat"));
		Thread.sleep(3000);
     } 
	}
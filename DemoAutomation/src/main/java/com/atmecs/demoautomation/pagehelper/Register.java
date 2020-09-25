package com.atmecs.demoautomation.pagehelper;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.demoautomation.constants.Constants;
import com.atmecs.demoautomation.helperclass.DemoAutomationHelperClass;
import com.atmecs.demoautomation.utilityclass.UtilityClass;

public class Register {
	public WebDriver driver;
	Properties Location_path,Data_path;
	public Register(WebDriver driver) {
		this.driver = driver;
	}
	public void register() throws InterruptedException
	{
		Location_path=UtilityClass.readProperty(Constants.LOCATORS_FILE);
		Data_path=UtilityClass.readProperty(Constants.DATA_FILE);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		DemoAutomationHelperClass helper = new DemoAutomationHelperClass(driver);
		helper.sendValue(Location_path.getProperty("FirstName"), Data_path.getProperty("FirstName"));
		//	driver.findElement(By.xpath()).sendKeys(); //firstName
		helper.sendValue(Location_path.getProperty("LastName"), Data_path.getProperty("LastName"));
		//	driver.findElement(By.xpath()).sendKeys(); //lastName
		helper.sendValue(Location_path.getProperty("Address"), Data_path.getProperty("Address"));
		//	driver.findElement(By.xpath()).sendKeys();  //address
		helper.sendValue(Location_path.getProperty("EmailAdress"), Data_path.getProperty("EmailAdress"));
		//	driver.findElement(By.xpath()).sendKeys(); //email
		helper.sendValue(Location_path.getProperty("PhoneNo"), Data_path.getProperty("PhoneNo"));

		helper.radioButton(Location_path.getProperty("Gender"));
		helper.checkBox(Location_path.getProperty("Hobby"));
		//	driver.findElement(By.xpath(prop.getProperty("Hobby"))).click();  //hobby
		Thread.sleep(2000);
		helper.dropDownForLanguage(Location_path.getProperty("Language"));
		//	WebElement element8 =	driver.findElement(By.xpath());  
		//	element8.click();
		Thread.sleep(1000);
		helper.dropDownForLanguage(Location_path.getProperty("Danish"));
		//		WebElement element9 =	driver.findElement(By.xpath(prop.getProperty("Danish")));
		//		element9.click();
		//		Thread.sleep(1000);
		helper.dropDownForLanguage(Location_path.getProperty("French"));
		//		WebElement element10 =	driver.findElement(By.xpath(prop.getProperty("French")));
		//		element10.click();
		driver.findElement(By.xpath(Location_path.getProperty("Form_click"))).click();
		Thread.sleep(10000);


		helper.dropDown(Location_path.getProperty("Skills"));                   //skills

		helper.dropDown(Location_path.getProperty("Country"));
		helper.dropDown(Location_path.getProperty("SelectCountry"));
		helper.selectYear(Location_path.getProperty("Year")); 
		helper.selectMonth(Location_path.getProperty("Month"));

		helper.selectDate(Location_path.getProperty("Date"));

		helper.sendValue(Location_path.getProperty("Pwd"), Data_path.getProperty("Pwd"));
		Thread.sleep(10000);

		helper.sendValue(Location_path.getProperty("ConfirmPwd"), Data_path.getProperty("ConfirmPwd"));
		helper.buttonClickable("submitbtn");
		Thread.sleep(10000);

	}

}

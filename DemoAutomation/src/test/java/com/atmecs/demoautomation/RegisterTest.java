package com.atmecs.demoautomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest  {
	WebDriver driver;
	WebElement txt;
	FileInputStream file;
	Properties prop;
	FileInputStream file1;
	Properties prop1;
	@BeforeTest
	public void beforeTest() throws InterruptedException, IOException
	{
		System.out.println("TEST EXECUTION BEGINS...");
		file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\locators\\locators.properties");
		prop = new Properties();
		prop.load(file);
		file1 = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\data\\data.properties");
		prop1 = new Properties();
		prop1.load(file1);
	}
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		String chromeDriverPath = System.setProperty("user.dir",  "\\chromedriver.exe");
		System.out.println(chromeDriverPath);
		driver=new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Register.html");   
		driver.manage().window().maximize();

		System.out.println("Welcome...");

	}
	@Test
	public void register() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		DemoAutomationHelperClass h = new DemoAutomationHelperClass(driver);
		h.sendValue(prop.getProperty("FirstName"), prop1.getProperty("FirstName"));
	//	driver.findElement(By.xpath()).sendKeys(); //firstName
		h.sendValue(prop.getProperty("LastName"), prop1.getProperty("LastName"));
	//	driver.findElement(By.xpath()).sendKeys(); //lastName
		h.sendValue(prop.getProperty("Address"), prop1.getProperty("Address"));
	//	driver.findElement(By.xpath()).sendKeys();  //address
		h.sendValue(prop.getProperty("EmailAdress"), prop1.getProperty("EmailAdress"));
	//	driver.findElement(By.xpath()).sendKeys(); //email
		h.sendValue(prop.getProperty("PhoneNo"), prop1.getProperty("PhoneNo"));
    //	driver.findElement(By.xpath()).sendKeys();  //mobileNo
		DemoAutomationHelperClass h1 = new DemoAutomationHelperClass(driver);	
		h1.radioButton(prop.getProperty("Gender"));
	//	driver.findElement(By.xpath()).click();  //gender
		DemoAutomationHelperClass h2 = new DemoAutomationHelperClass(driver);	
		h2.checkBox(prop.getProperty("Hobby"));
	//	driver.findElement(By.xpath(prop.getProperty("Hobby"))).click();  //hobby
		Thread.sleep(2000);
        
		WebElement element8 =	driver.findElement(By.xpath(prop.getProperty("Language")));  
		element8.click();
		Thread.sleep(1000);
		WebElement element9 =	driver.findElement(By.xpath(prop.getProperty("Danish")));
		element9.click();
		Thread.sleep(1000);
		WebElement element10 =	driver.findElement(By.xpath(prop.getProperty("French")));
		element10.click();
		driver.findElement(By.xpath(prop.getProperty("Form_click"))).click();
		Thread.sleep(10000);
        
		DemoAutomationHelperClass h3 = new DemoAutomationHelperClass(driver);	
		h3.dropDown(prop.getProperty("Skills"));                   //skills
		        
        h3.dropDown(prop.getProperty("Country"));
//		WebElement element2 =	driver.findElement(By.xpath(prop.getProperty("Country")));
//		element2.click();
//		element2.sendKeys("In");
//		element2.sendKeys(Keys.ENTER);        //country
//		Thread.sleep(3000);

        h3.dropDown(prop.getProperty("SelectCountry"));
//		WebElement txt8 = driver.findElement (By.xpath(prop.getProperty("SelectCountry")));
//		txt8.click();
//		Thread.sleep(3000);
//		txt8.sendKeys(Keys.DOWN);
//		txt8.sendKeys(Keys.ENTER);
//		Thread.sleep(3000);

		WebElement element3 = driver.findElement(By.id(prop.getProperty("Year")));
		element3.click();
		for(int i=0;i<10;i++)
		{
			element3.sendKeys(Keys.ARROW_DOWN);
		}
		element3.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		WebElement element4 = driver.findElement(By.xpath(prop.getProperty("Month")));
		element4.click();
		for(int i=0;i<5;i++)
		{
			element4.sendKeys(Keys.ARROW_DOWN);
		}
		element4.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		WebElement element5 = driver.findElement(By.id(prop.getProperty("Date")));
		element5.click();
		for(int i=0;i<10;i++)
		{
			element5.sendKeys(Keys.ARROW_DOWN);
		}
		element5.sendKeys(Keys.ENTER);
		Thread.sleep(10000);

		h.sendValue(prop.getProperty("Pwd"), prop1.getProperty("Pwd"));
//		WebElement element6 =	driver.findElement(By.xpath(prop.getProperty("Pwd")));
//		element6.click();
//		element6.sendKeys(prop1.getProperty("Pwd"));
		Thread.sleep(10000);

		h.sendValue(prop.getProperty("ConfirmPwd"), prop1.getProperty("ConfirmPwd"));
//		WebElement element7 =	driver.findElement(By.xpath(prop.getProperty("ConfirmPwd")));
//		element7.click();
//		element7.sendKeys(prop1.getProperty("ConfirmPwd"));
		
		DemoAutomationHelperClass h4 = new DemoAutomationHelperClass(driver);
		h4.button("submitbtn");
//		driver.findElement(By.id("")).click();
		Thread.sleep(10000);

	}
	@AfterTest
	public void afterTest() 
	{

		System.out.println("TEST EXECUTION ENDS...");
		driver.quit();
	}
}


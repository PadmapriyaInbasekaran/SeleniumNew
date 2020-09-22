package com.atmecs.demoblaze;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInTest {
	WebDriver driver;
	FileInputStream file;
	FileInputStream file1;
	Properties prop;
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
		String chromeDriverPath = System.setProperty("user.dir",  "\\lib\\chromedriver.exe");
		System.out.println(chromeDriverPath);
		driver=new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com");   
		driver.manage().window().maximize();

		System.out.println("Welcome to DEMOBLAZE...");
	}
	@Test
	public void demoBlazeLogIn() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		DemoBlazeHelperClass lh = new DemoBlazeHelperClass(driver);
		lh.linkText(prop.getProperty("LogIn_LinkText"));
		//driver.findElement(By.linkText()).click();
		DemoBlazeHelperClass lh1 = new DemoBlazeHelperClass(driver);
		lh1.sendValue(prop.getProperty("Uname_Id"), prop1.getProperty("LogInName"));
		//driver.findElement(By.id()).sendKeys();
		lh1.sendValue(prop.getProperty("LoginPwd_Id"), prop1.getProperty("LogInPwd"));
		//driver.findElement(By.id()).sendKeys();
		DemoBlazeHelperClass lh2 = new DemoBlazeHelperClass(driver);
		lh2.buttonClickable(prop.getProperty("Button"));
		//driver.findElement(By.xpath()).click();

	}
	@AfterTest
	public void afterTest() 
	{
		System.out.println("TEST EXECUTION ENDS...");
		driver.close();
	}
}


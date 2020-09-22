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

public class VerifyCartTest {
	WebDriver driver;
	FileInputStream file;
	Properties prop;
	@BeforeTest
	public void beforeTest() throws InterruptedException, IOException
	{
		System.out.println("TEST EXECUTION BEGINS...");
		file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\locators\\locators.properties");
		prop = new Properties();
		prop.load(file);
		String chromeDriverPath = System.setProperty("user.dir",  "\\lib\\chromedriver.exe");
		System.out.println(chromeDriverPath);
		driver=new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com");   
		driver.manage().window().maximize();

		System.out.println("Welcome to DEMOBLAZE...");
	}
	@Test
	public void demoBlazeVerifyCart() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DemoBlazeHelperClass h2 = new DemoBlazeHelperClass(driver);
		h2.linkText(prop.getProperty("CartVerify_LinkText"));
		//driver.findElement(By.linkText(prop.getProperty("CartVerify_LinkText"))).click();
	
}	@AfterTest
	public void afterTest() 
	{
		System.out.println("TEST EXECUTION ENDS...");
		driver.close();
	}

}


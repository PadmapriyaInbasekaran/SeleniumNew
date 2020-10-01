package com.atmecs.goibibo.basefile;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.atmecs.goibibo.constants.Constants;

public class BaseFile extends Constants{
	public WebDriver driver;
   @BeforeMethod
	public void beforeTest() throws InterruptedException, IOException
	{
		System.out.println("TEST EXECUTION BEGINS...");
		String chromeDriverPath = System.setProperty("user.dir",  CHROME_FILE);
		System.out.println(chromeDriverPath);
		driver=new ChromeDriver();
		driver.navigate().to("https://www.goibibo.com/");   
		driver.manage().window().maximize();
		
		
		
	}
		@AfterMethod
	public void afterTest() 
	{
		driver.quit();
		System.out.println("TEST EXECUTION ENDS...");
	}
}

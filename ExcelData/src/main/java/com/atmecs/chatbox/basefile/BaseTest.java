package com.atmecs.chatbox.basefile;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.atmecs.chatbox.constants.Constants;

public class BaseTest extends Constants{
	public  WebDriver driver;

	@BeforeMethod
	public void beforeTest() throws InterruptedException, IOException
	{
		System.out.println("TEST EXECUTION BEGINS...");

		String chromeDriverPath = System.setProperty("user.dir",  CHROME_FILE);
		System.out.println("BaseFile " +chromeDriverPath);
		driver=new ChromeDriver();
		driver.navigate().to("https://www.phptravels.com/");   
		driver.manage().window().maximize();
		System.out.println(driver);
	}
	@AfterMethod
	public void afterTest() 
	{
		driver.quit();
		System.out.println("TEST EXECUTION ENDS...");
	}
}

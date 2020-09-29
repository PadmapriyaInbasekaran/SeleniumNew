package com.atmecs.chatbox.basefile;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.atmecs.chatbox.constants.Constants;

public class BaseTest {
	public  WebDriver driver;

	@BeforeTest
	public void beforeTest() throws InterruptedException, IOException
	{
		System.out.println("TEST EXECUTION BEGINS...");

		String chromeDriverPath = System.setProperty("user.dir", Constants.CHROME_FILE);
		System.out.println("BaseFile " +chromeDriverPath);
		driver=new ChromeDriver();
		driver.navigate().to("https://www.phptravels.com/");   
		driver.manage().window().maximize();

	}
	@AfterTest
	public void afterTest() 
	{
		driver.quit();
		System.out.println("TEST EXECUTION ENDS...");
	}
}

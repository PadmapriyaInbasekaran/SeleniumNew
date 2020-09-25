package com.atmecs.chatbox.PageFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.atmecs.chatbox.constants.Constants;
import com.atmecs.chatbox.pagehelper.HelperClass;
import com.atmecs.chatbox.utilitiesfile.*;
import com.atmecs.chatbox.basefile.*;
public class PageHelper extends BaseTest {
	public  WebDriver driver;
	WebDriverWait wait;
	HSSFWorkbook workbook;
	HSSFSheet sheet;
	HSSFCell cell;
	Properties Location_path;
	public PageHelper(WebDriver driver)
	{
		this.driver = driver;
		System.out.println("PageClass " +driver);
	}
	public void ReadData() throws IOException, InterruptedException
	{
		Location_path  = UtilitiesClass.readProperty(Constants.LOCATORS_FILE);

		HelperClass helper = new HelperClass(driver);
		Thread.sleep(20000);
		driver.switchTo().frame("chat-widget");
		System.out.println("Inside frame successfully");
		Thread.sleep(3000);
		helper.chatIconMethod(Location_path.getProperty("chatIcon"));
		File file=new File(TEST_FILE);
		System.out.println(file);
		FileInputStream fileInput = new FileInputStream(file);
		workbook = new HSSFWorkbook(fileInput);
		sheet= workbook.getSheetAt(0);

		for(int i=1; i<sheet.getLastRowNum(); i++)
		{

			cell = sheet.getRow(i).getCell(1);
			helper.sendKey(Location_path.getProperty("Name"), cell.getStringCellValue());

			cell = sheet.getRow(i).getCell(2);
			helper.sendKeyForWatsappNum(Location_path.getProperty("WhatsappNumber"), cell.getStringCellValue());

			cell = sheet.getRow(i).getCell(3);
			helper.sendKey(Location_path.getProperty("Email"), cell.getStringCellValue());

			helper.buttonClickable(Location_path.getProperty("StartChat"));
			Thread.sleep(3000);
		}
	} 

}

package com.atmecs.exceldata;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.chatbox.PageFile.PageHelper;
import com.atmecs.chatbox.basefile.BaseTest;

public class ExcelData extends BaseTest{
	//public WebDriver driver;
	@Test
	public void excelData()
	{
		PageHelper p = new PageHelper(driver);
		System.out.println(driver);
		try {
			p.ReadData();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
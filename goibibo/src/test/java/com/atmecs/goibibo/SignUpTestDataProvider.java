package com.atmecs.goibibo;

import org.testng.annotations.DataProvider;

import com.atmecs.goibibo.constants.Constants;
import com.atmecs.goibibo.utilities.ReadExcelData;

public class SignUpTestDataProvider {
	@DataProvider( name= "Data" )
	public static Object[][] readExcelSheet() throws Exception
{
		ReadExcelData readSheet = new ReadExcelData(Constants.SIGNUP_FILE);
		Object[][] data = readSheet.setExcelFile("Sheet1");
				return data;	
		}
	
}



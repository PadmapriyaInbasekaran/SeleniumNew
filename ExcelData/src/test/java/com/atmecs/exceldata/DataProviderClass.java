package com.atmecs.exceldata;

import org.testng.annotations.DataProvider;
import com.atmecs.chatbox.constants.Constants;
import com.atmecs.chatbox.utilitiesfile.ReadExcelData;

public class DataProviderClass  {
	@DataProvider( name= "Data" )
	public static Object[][] readExcelSheet() throws Exception
{
		ReadExcelData readSheet = new ReadExcelData(Constants.TEST_FILE);
		Object[][] data = readSheet.setExcelFile("chatData");
				return data;	
		}
	
	
}

package com.atmecs.exceldata;

import org.testng.annotations.DataProvider;
import com.atmecs.chatbox.utilitiesfile.SetExcelFile;

public class ReadExcelSheet  {
	@DataProvider( name= "Data" )
public static Object[][] readExcelSheet() throws Exception
{
		SetExcelFile readSheet = new SetExcelFile();
		Object[][] data = readSheet.setExcelFile("chatData");
				return data;	
		}
	
	
}

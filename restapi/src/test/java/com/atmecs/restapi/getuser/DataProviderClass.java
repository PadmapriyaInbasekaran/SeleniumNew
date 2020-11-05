package com.atmecs.restapi.getuser;
import org.testng.annotations.DataProvider;

import com.atmecs.rapidapi.util.Utilities;
import com.atmecs.restapi.constants.Constants;

public class DataProviderClass {
	@DataProvider( name= "Data" )
public static Object[][] dataProviderClass() 
{
	Utilities util = new Utilities(Constants.DATAPATH);
	String url = util.get("url");
	String firstName = util.get("firstName");
	String lastName = util.get("lastName");
	String email = util.get("email");
	Object[][] data = new Object[1][4];
	data[0][0] = url;
	data[0][1] = firstName;
	data[0][2] = lastName;
	data[0][3] = email;
	return data;
	
}
}

package com.atmecs.rapidapi.util;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class Utilities {
	Properties properties;
public Utilities(String filepath)
{
	properties = new Properties();
	try
	{
		properties.load(new FileInputStream(new File(filepath)));
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	public String get(String key)
	{
		return properties.getProperty(key);
	}
}


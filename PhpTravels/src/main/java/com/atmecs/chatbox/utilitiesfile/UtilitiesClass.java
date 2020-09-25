package com.atmecs.chatbox.utilitiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import com.atmecs.chatbox.constants.Constants;

public class UtilitiesClass extends Constants{
	public static Properties properties;

	public static Properties readProperty(String path) 
	{
		properties=new Properties();
		try {
			properties.load(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			System.out.println("File not found in the given location" + e.getMessage());


		} catch (IOException e) {
			System.out.println("Input Output Exception " + e.getMessage());

		}
		return properties;
	}
}



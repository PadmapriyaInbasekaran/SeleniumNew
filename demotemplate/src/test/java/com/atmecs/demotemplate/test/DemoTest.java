package com.atmecs.demotemplate.test;

import java.util.Properties;

import org.testng.annotations.Test;

public class DemoTest {
	Properties locationPath;
	@Test(dataProvider = "Data" )//dataProviderClass = className.class
	public void demoTest()
		{
		
	}
}
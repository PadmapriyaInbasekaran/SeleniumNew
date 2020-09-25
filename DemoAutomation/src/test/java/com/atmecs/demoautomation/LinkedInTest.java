package com.atmecs.demoautomation;
import org.testng.annotations.Test;

import com.atmecs.demoautomation.basetest.BaseTest;
//import com.atmecs.demoautomation.helperclass.DemoAutomationHelperClass;
import com.atmecs.demoautomation.pagehelper.LinkedIn;

public class LinkedInTest extends BaseTest{
	@Test
	public void linkedInTest()
	{
		LinkedIn linkedin = new LinkedIn(driver);
		linkedin.linkedIn();	
	}

}


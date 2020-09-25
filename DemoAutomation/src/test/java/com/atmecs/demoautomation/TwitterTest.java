package com.atmecs.demoautomation;
import org.testng.annotations.Test;

import com.atmecs.demoautomation.basetest.BaseTest;
//import com.atmecs.demoautomation.helperclass.DemoAutomationHelperClass;
import com.atmecs.demoautomation.pagehelper.Twitter;
public class TwitterTest extends BaseTest{

	@Test

	public void twitterTest()
	{
		Twitter tweet = new Twitter(driver);
		tweet.twitter();
	}
}


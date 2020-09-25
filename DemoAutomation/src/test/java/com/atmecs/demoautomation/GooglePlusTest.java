package com.atmecs.demoautomation;
import org.testng.annotations.Test;

import com.atmecs.demoautomation.basetest.BaseTest;

import com.atmecs.demoautomation.pagehelper.GooglePlus;

public class GooglePlusTest extends BaseTest{
	@Test
	public void googlePlus()
	{
		GooglePlus gplus = new GooglePlus(driver);
		gplus.googlePlus();
	}
}


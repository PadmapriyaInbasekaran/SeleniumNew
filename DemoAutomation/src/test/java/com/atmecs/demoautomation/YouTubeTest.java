package com.atmecs.demoautomation;
import org.testng.annotations.Test;

import com.atmecs.demoautomation.basetest.BaseTest;
//import com.atmecs.demoautomation.helperclass.DemoAutomationHelperClass;
//import com.atmecs.demoautomation.pagehelper.FaceBook;
import com.atmecs.demoautomation.pagehelper.YouTube;

public class YouTubeTest extends BaseTest{
	@Test
	public void youTubeTest()
	{
		YouTube utube =new YouTube(driver);
		utube.youTube();
	}
}



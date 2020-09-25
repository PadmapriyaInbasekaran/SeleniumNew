package com.atmecs.demoautomation;
import org.testng.annotations.Test;

import com.atmecs.demoautomation.basetest.BaseTest;
//import com.atmecs.demoautomation.helperclass.DemoAutomationHelperClass;
import com.atmecs.demoautomation.pagehelper.FaceBook;

public class FaceBookTest extends BaseTest{
	@Test
	public void faceBookTest()
	{
		FaceBook facebook =new FaceBook(driver);
		facebook.faceBook();
	}
}


package com.atmecs.demoautomation;

//import java.io.FileInputStream;
import org.testng.annotations.Test;

import com.atmecs.demoautomation.basetest.BaseTest;
//import com.atmecs.demoautomation.helperclass.DemoAutomationHelperClass;
import com.atmecs.demoautomation.pagehelper.Register;

public class RegisterTest extends BaseTest {
	@Test
	public void registerTest()
	{
		Register reg =new Register(driver);
		try {
			reg.register();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


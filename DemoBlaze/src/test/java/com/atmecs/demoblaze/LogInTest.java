package com.atmecs.demoblaze;
import org.testng.annotations.Test;

import com.atmecs.demoblaze.basetest.BaseTest;
import com.atmecs.demoblaze.pagehelper.LogIn;
public class LogInTest extends BaseTest{
	@Test
	public void logInTest()
	{
		LogIn l = new LogIn(driver);
		try {
			l.demoBlazeLogIn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


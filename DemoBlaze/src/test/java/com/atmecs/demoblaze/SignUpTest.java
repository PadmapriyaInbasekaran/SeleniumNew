package com.atmecs.demoblaze;
import org.testng.annotations.Test;
import com.atmecs.demoblaze.basetest.BaseTest;
import com.atmecs.demoblaze.pagehelper.SignUp;

public class SignUpTest extends BaseTest{
	@Test
	public void signupTest()
	{
		SignUp s = new SignUp(driver);
		try {
			s.demoBlazeSignUp();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}
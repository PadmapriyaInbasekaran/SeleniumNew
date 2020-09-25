package com.atmecs.goibibo;
import java.io.IOException;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.goibibo.basefile.BaseFile;
import com.atmecs.goibibo.helperclass.HelperClass;
import com.atmecs.goibibo.pagehelper.PageHelperSignUp;
import com.atmecs.goibibo.utilities.UtilitiesClass;

public class SignUpTest extends BaseFile{
	//public WebDriver driver;
	@Test
	public void signUpTest()
	{
		PageHelperSignUp p = new PageHelperSignUp(driver);
		try {
			p.signup();
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

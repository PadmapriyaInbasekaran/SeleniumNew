package com.atmecs.demoblaze;
import org.testng.annotations.Test;

import com.atmecs.demoblaze.basetest.BaseTest;
import com.atmecs.demoblaze.pagehelper.VerifyCart;

public class VerifyCartTest extends BaseTest{
	@Test
	public void verifyCartTest() 
	{
		VerifyCart v = new VerifyCart(driver);
		try {
			v.demoBlazeVerifyCart();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}


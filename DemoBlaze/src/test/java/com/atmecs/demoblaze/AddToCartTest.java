package com.atmecs.demoblaze;
import org.testng.annotations.Test;

import com.atmecs.demoblaze.basetest.BaseTest;
import com.atmecs.demoblaze.pagehelper.AddToCart;

public class AddToCartTest extends BaseTest {
	@Test
	public void addToCart()
	{
		AddToCart a = new AddToCart(driver);
		try {
			a.demoBlazeAddToCart();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}


package com.atmecs.chatbox;
import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.chatbox.PageFile.PageHelper;
import com.atmecs.chatbox.basefile.BaseTest;

public class ChatBoxTest extends BaseTest{
	
	@Test
	public void chatBoxTest() 
		{
			PageHelper pagehelper = new PageHelper(driver);
			try {
				pagehelper.chatBox();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}




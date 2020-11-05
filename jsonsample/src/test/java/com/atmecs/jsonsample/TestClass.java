package com.atmecs.jsonsample;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import com.atmecs.jsonsample.getrequest.GetRequest;
import com.atmecs.jsonsample.postrequest.PostRequest;
import com.atmecs.jsonsample.putrequest.PutRequest;
public class TestClass {
	@Test
	public void testClass() throws FileNotFoundException, IOException, ParseException
	{
		int input;
		String option;
		Scanner sc = new Scanner(System.in);
		do
		{
	
	System.out.println("Enter \n 1.POST \n 2.GET  \n 3.PUT");
	input  = sc.nextInt();
	switch(input)
	{
	case 1:
	{
		PostRequest jArray = new PostRequest();
		jArray.getJsonResponse();
		break;
	}
	case 2:
	{
		GetRequest getReq = new GetRequest();
		getReq.getRequest();
		break;
	}
	case 3:
	{
		PutRequest getReq = new PutRequest();
		getReq.putRequest();
		break;
	}
	default:
	{
		System.out.println("Invalid selection");
		break;
	}
	}
	System.out.println("Do you want to continue your action?? Press Y for yes and N for no...");
	option = sc.next();
		}
		while(option.equalsIgnoreCase("y"));
		System.out.println("Program exited...");
	sc.close();
	}
}

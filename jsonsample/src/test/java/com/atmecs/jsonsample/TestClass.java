package com.atmecs.jsonsample;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import com.atmecs.jsonsample.getrequest.GetRequest;
import com.atmecs.jsonsample.postrequest.PostRequest;
import com.atmecs.jsonsample.putrequest.PutRequest;

public class TestClass extends PostRequest{
	@Test
	public void testClass() throws FileNotFoundException, IOException, ParseException
	{int input;
	Scanner sc = new Scanner(System.in);
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
		PutRequest getReq = new PutRequest(response );
		getReq.putRequest();
		break;
	}
	}
	sc.close();
	}
}

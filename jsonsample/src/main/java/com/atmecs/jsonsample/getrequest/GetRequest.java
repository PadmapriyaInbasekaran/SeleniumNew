package com.atmecs.jsonsample.getrequest;
import java.util.Scanner;
import org.json.simple.JSONObject;
import com.atmecs.jsonsample.postrequest.PostRequest;

public class GetRequest extends PostRequest{
	public GetRequest( JSONObject response)
	{

		this.response = response;
		System.out.println("Response :" +response);
	}
	public void getRequest()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of the employee,you want to display..");
		int empid = sc.nextInt();
		System.out.println("Employee 2 :"+response.get("id").equals(empid));
		sc.close();
	}
}

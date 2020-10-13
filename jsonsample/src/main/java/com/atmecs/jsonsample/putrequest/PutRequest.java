package com.atmecs.jsonsample.putrequest;
import java.util.Scanner;
import org.json.simple.JSONObject;
import com.atmecs.jsonsample.postrequest.PostRequest;

public class PutRequest extends PostRequest{
	public PutRequest(JSONObject response)
	{
		this.response = response;
		System.out.println("Response :" +response);
	}
	@SuppressWarnings("unchecked")
	public void putRequest()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of the employee,you want to display..");
		int empid = sc.nextInt();
		if(response.get("id").equals(empid)) {
			response.put("firstName", "name");
		}
		sc.close();
	}

}
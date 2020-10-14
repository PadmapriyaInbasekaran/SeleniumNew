package com.atmecs.jsonsample.getrequest;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.ParseException;
import com.atmecs.jsonsample.postrequest.PostRequest;
import org.json.*;
import org.json.simple.parser.JSONParser;
public class GetRequest extends PostRequest{

	public void getRequest() throws FileNotFoundException, IOException
	{
		Scanner sc = new Scanner(System.in);
		//	System.out.println("Enter the id of the employee,you want to display..");
		//	int empid = sc.nextInt();
		JSONParser jsonParser = new JSONParser();
		try
		{
			JSONObject object =  (JSONObject) jsonParser.parse(new FileReader("./json_array_output.json"));
			System.out.println(object);
			JSONObject jsonObject =   object;
			 // JSONObject jsonObject = new JSONObject(new FileReader("./json_array_output.json"));
			JSONArray jsonArray =  (JSONArray) jsonObject.get("Employees");
			for(int i=0;i < jsonArray.length(); i++)
			{
				jsonObject = jsonArray.getJSONObject(i);
				String id = jsonObject.getString("Id");
				if (id.equals("1")){
					jsonObject.put("firstName","NameChanged");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		sc.close();
	}
}

package com.atmecs.jsonsample.getrequest;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
//import org.json.simple.parser.ParseException;
//import com.atmecs.jsonsample.postrequest.PostRequest;
//import org.json.*;
import org.json.simple.parser.JSONParser;
public class GetRequest {

public void getRequest() throws FileNotFoundException, IOException
	{
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Index,you want to display..");
			int index = sc.nextInt();
		JSONParser jsonParser = new JSONParser();
		try
		{
			JSONObject jsonObject =  (JSONObject) jsonParser.parse(new FileReader("./json_array_output.json"));
			JSONArray jsonArray =  (JSONArray) jsonObject.get("Employees");
			System.out.println("EMPLOYEE ARRAY "+jsonArray);
//			JSONObject value = (JSONObject) jsonArray.get(index);
//			System.out.println("DATA AT INDEX "+index+"=" +value);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		} 
	//	sc.close();
	}
}















//for(int index = 0;index < jsonArray.size();index++)
//{
//JSONObject value = (JSONObject) jsonArray.get(index);
//System.out.println(value);
//System.out.println( value.containsKey("Id".equalsIgnoreCase(empId)));
//boolean key = value.containsKey("Id".equalsIgnoreCase(empId));
//boolean val = value.containsValue("1");
//System.out.println(key);
//System.out.println(val);
//
//
//			}
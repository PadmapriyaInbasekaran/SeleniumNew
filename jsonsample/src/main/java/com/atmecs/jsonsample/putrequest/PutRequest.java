package com.atmecs.jsonsample.putrequest;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
///import com.atmecs.jsonsample.*;
public class PutRequest {
	JSONObject index ;
	JSONObject jsonObject;
	@SuppressWarnings("unchecked")
	public void putRequest()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Index,you want to modify..");
		int empIndex = sc.nextInt();
		System.out.println("Enter the field you want to modify");
		String field = sc.next();
		System.out.println("Enter the field value");
		String fieldValue = sc.next();
		JSONParser jsonParser = new JSONParser();
		try
		{
			jsonObject	 =  (JSONObject) jsonParser.parse(new FileReader("./json_array_output.json"));
			JSONArray jsonArray =  (JSONArray) jsonObject.get("Employees");
		index	= (JSONObject) jsonArray.get(empIndex);
			System.out.println("BEFORE UPDATING---"+index);
			if(index.containsKey(field))
				{
					index.put(field, fieldValue);
				}
		System.out.println("AFTER UPDATING---"+index);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		try {
			FileWriter file = new FileWriter("./json_array_output.json");
			file.write(jsonObject.toJSONString());
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	sc.close();
	}
}
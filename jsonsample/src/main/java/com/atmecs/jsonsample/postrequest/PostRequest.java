package com.atmecs.jsonsample.postrequest;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class PostRequest {
	public JSONObject response;
	public JSONObject emp;
	@SuppressWarnings("unchecked")
	public JSONObject  getEmp(int id, String firstName, String lastName, String email){
		emp	 = new JSONObject();
		emp .put("Id", id);
		emp .put("FirstName", firstName);
		emp .put("LastName", lastName);
		emp .put("Email", email);
		return emp;
	} 

	@SuppressWarnings("unchecked")
	public JSONObject getJsonResponse(){

		JSONArray employees = new JSONArray();
		employees.add(getEmp(1,"Abc","123","abc@gmail.com"));
		employees.add(getEmp(2,"xyz","456","xyz@gmail.com"));
		employees.add(getEmp(3,"pqr","789","pqr@gmail.com"));
		employees.add(getEmp(4,"Priya","Sekar","priya@gmail.com"));
		employees.add(getEmp(5,"Padmapriya","Inbasekaran","inba@gmail.com"));
		employees.add(getEmp(6,"Raju","Kumar","raju@gmail.com"));
		employees.add(getEmp(7,"Vijay","abc","vijay@gmail.com"));
		employees.add(getEmp(8,"John","Smith","john@gmail.com"));
		employees.add(getEmp(9,"Saran","MSQW","saran@gmail.com"));
		employees.add(getEmp(10,"Aadhi","Surya","aadhi@gmail.com"));
		response = new JSONObject();
		response.put("Employees", employees );

		System.out.println(response);

		try {
			FileWriter file = new FileWriter("./json_array_output.json");
			file.write(response.toJSONString());
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}
}

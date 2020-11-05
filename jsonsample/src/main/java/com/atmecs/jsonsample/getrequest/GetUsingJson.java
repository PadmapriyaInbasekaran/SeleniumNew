package com.atmecs.jsonsample.getrequest;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.testng.annotations.Test;
import com.atmecs.jsonsample.postrequest.PojoForGson;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
@Test
public class GetUsingJson {
	public void getUsingJson() throws FileNotFoundException
	{
	 System.out.println("Reading JSON from a file");
	   System.out.println("----------------------------------------");
	   Gson gson = new Gson();
	   JsonReader reader = new JsonReader(new FileReader("./gsonfile.json"));
	   System.out.println(reader.toString());  
	   PojoForGson[] user = gson.fromJson(reader, PojoForGson[].class);
	   JsonObject object = new JsonObject();
	   	for(PojoForGson readUser : user)
	   System.out.println(readUser);
	   }
}
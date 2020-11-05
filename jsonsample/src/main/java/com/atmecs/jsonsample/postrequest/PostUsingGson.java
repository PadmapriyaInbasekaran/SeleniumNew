package com.atmecs.jsonsample.postrequest;
import java.io.FileWriter;
import java.io.IOException;
import org.testng.annotations.Test;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
@Test
public class PostUsingGson {
	public void postGson() throws JsonIOException, IOException
	{
		  Gson gson = new Gson();
		   String userJson = "[{'id': 1,'name': 'Priya','nationality': 'Indian'}, "
	                + "{'id': 2,'name': 'Sekar','nationality': 'Indian'}, "
	                + "{'id': 3,'name': 'Aadhitiya','nationality': 'Indian'}]";
		    gson.fromJson(userJson,PojoForGson[].class);
		   System.out.println(userJson);
		    try {
		    	  
		    	   FileWriter writer = new FileWriter("./gsonfile.json");
		    	   writer.write(userJson);
		    	   writer.close();
		       	  } catch (IOException e) {
		    	   e.printStackTrace();
		    	  }
		    }
}

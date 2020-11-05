package com.atmecs.restapi.getuser;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetUser {
	@Test(dataProvider = "Data" ,dataProviderClass = DataProviderClass.class)
public void getUser(String url, String firstName, String lastName, String email) throws MalformedURLException 
{
	String requestUrl = url;
	System.out.println(requestUrl);
	RequestSpecification request = RestAssured.given();
	Response response = request.get(new URL(requestUrl));
	int statusCode = response.getStatusCode();
	String statusBody = response.getBody().asString();
	Assert.assertEquals(statusCode, 200);
	System.out.println("Status Code = " +statusCode);
	System.out.println("Status Body = " +statusBody);
	JsonPath jsonPath = response.jsonPath();
	String actualFirstName = jsonPath.get("data.firstName");
	System.out.println(actualFirstName);
}
}

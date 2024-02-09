package Pushpendra;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class QueryRequestSpecification {
	
	@Test

	public void creatUser() {

		// https://reqres.in/api/users

		// Request Body
		JSONObject object = new JSONObject();
		object.put("Name", "Pushpendra");
		object.put("Id", 12);
		object.put("id", "Pushpendra@123gmail.com");
		object.put("Addres", "bulandshahr");

		RequestSpecification request = RestAssured.given();

		request.baseUri("https://reqres.in/");
		request.basePath("/api/users");

		request.contentType(ContentType.JSON).body(object.toJSONString());

		// Query details from request specification

		QueryableRequestSpecification queryRequest = SpecificationQuerier.query(request);

		// get Base uri

		String baseuri = queryRequest.getBaseUri();
		System.out.println("Baseuri" + " " + baseuri);
		
		//Get Base Path

		String basepath = queryRequest.getBasePath();		
		System.out.println("BasePath"+" "+basepath);
		
		
		// get Request body
		
		System.out.println("''''''''''''''RequestBody''''''''''");
		
		String requestBody = queryRequest.getBody();
		System.out.println("RequestBody"+" "+ requestBody);
		
		
		Headers  allheader  =queryRequest.getHeaders();
		
		System.out.println("<<<<<<<<<<<<<<<<<<Header>>>>>>>>>>>>>>>>>>>>>");
		
		for(io.restassured.http.Header h: allheader) 
		{
			System.out.println("Headdr name "+ h.getName()+ "Header value"+ h.getValue());
		}
		
	}

}









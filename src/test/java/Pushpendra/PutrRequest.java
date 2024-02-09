package Pushpendra;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutrRequest {

	@Test
	public void Test12() {
		
		
		System.out.println("Pushpendra");

		
		RequestSpecification rs =  RestAssured.given();
				
			Response res =	rs.get("https://reqres.in/api/users/2");
			

		//System.out.println("<<<<<<<<<<<<<<<<<<<<<<<Response>>>>>>>>>>>>>>");

		//System.out.println(response);

	}
}

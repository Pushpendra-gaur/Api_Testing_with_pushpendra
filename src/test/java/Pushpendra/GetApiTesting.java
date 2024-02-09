package Pushpendra;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetApiTesting {

	RequestSpecification req;

	@Test(priority = 1)
	public void Test01() {

		Response res = RestAssured.get("https://reqres.in/api/users/2");

		System.out.println("respond code is " + res.statusCode());

		int expected = 200;
		int Actual = res.getStatusCode();

	}

	@Test(priority = 2)
	public void Test001() {

		req = RestAssured.given();

		req.given().when().get("https://reqres.in/api/users/2").then().log().all();

		// log().all() = all print
		// Given = precondition
		// When = Excetion
		// Then validation

	}

	@Test(priority = 3)
	public void Test002() {

		req = RestAssured.given();

		req.baseUri("https://reqres.in/");
		req.basePath("/api/users");
		req.queryParam("id", 3);//user 3 ka data

		Response response = req.get();
		
		
	String responsBody = response.getBody().asString();
	
	System.out.println("Respons body "+ " "+ responsBody);
	
	
	

	}

}

package Pushpendra;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;
import junit.framework.Assert;

public class File_upload {

	@Test

	public void UploadFile() {
		File testfile = new File("C:\\Users\\DELL\\Desktop\\testfileupload.txt");

		RequestSpecification rs = RestAssured.given();

		rs.baseUri("https://reqres.in/api/users");

		rs.multiPart("file", testfile);

		Response respons = rs.post();

		respons.prettyPrint();

		Assert.assertEquals(respons.statusCode(), 201);
		
		System.out.println("Pass");

		QueryableRequestSpecification qurs = SpecificationQuerier.query(rs);

		String queryname = qurs.getBasePath();
		
		System.out.println("path name "+  "  "+ queryname);
		
		System.out.println("Jai Shree Ram");

	}

}

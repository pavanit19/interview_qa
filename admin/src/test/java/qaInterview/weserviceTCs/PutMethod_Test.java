package qaInterview.weserviceTCs;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PutMethod_Test {

public static void main(String[] args) {
		
		RestAssured.baseURI ="http://qainterview.merchante-solutions.com:3030";
		RequestSpecification request = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("userId", 9); 
		requestParams.put("id", 4);		 
		requestParams.put("title", "eum et est occaecati");
		requestParams.put("body", "my update body");

		request.header("Content-Type", "application/json");
		request.body(requestParams.toJSONString());
		
		Response response = request.put("/posts");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		
	}

}

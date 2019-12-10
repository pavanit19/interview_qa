package qaInterview.weserviceTCs;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import org.json.simple.JSONObject;


public class PostMethod_Test {

	public static void main(String[] args) {
		
		RestAssured.baseURI ="http://qainterview.merchante-solutions.com:3030";
		RequestSpecification request = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("userId", 23); 
		requestParams.put("id", 6);		 
		requestParams.put("title", "dolorem eum magni eos aperiam quia");
		requestParams.put("body", "my update body");

		request.header("Content-Type", "application/json");
		request.body(requestParams.toJSONString());
		
		Response response = request.post("/posts");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		
	}

}

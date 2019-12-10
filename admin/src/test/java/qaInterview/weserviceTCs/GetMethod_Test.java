package qaInterview.weserviceTCs;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetMethod_Test {

	public static void main(String[] args) {
		
		Response resp = given().
			    when().
		        get("http://qainterview.merchante-solutions.com:3030/");
		int code = resp.getStatusCode();
		System.out.println(code);
		
		System.out.println(resp.asString());

	}

}

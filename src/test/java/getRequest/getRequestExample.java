package getRequest;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class getRequestExample {

	Response response;
	
	@Test
	public void getRequestTest() {
		
		response=given()
				.baseUri("https://restful-booker.herokuapp.com")
				.when()
				.get("/booking")
				.then()
				.statusCode(200)
				.extract()
				.response();
		
		response.prettyPrint();
				
	}

}

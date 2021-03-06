package br.com.ApiRest;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import static io.restassured.RestAssured.*;

public class AppTest {
	private static String URL = "https://httpbin.org/get";

	@Test
	public void getTest() {
		given().when().get(URL).then().log().all().body("url", containsString(URL)).statusCode(200);
	}
}

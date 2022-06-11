package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class GetPostExamples {

		@Test
		public void test_1_1_Get(){

			baseURI = "https://reqres.in/api";
			given().
				get("/users?page=2").	
			then().statusCode(200).
				body("data[1].id",equalTo(8)).
				body("data.first_name",hasItems("Michael","Lindsay")).
				log().all().
			and().assertThat().statusCode(is(equalTo(200)));
												
			
		}
		
		@Test
		public void test_1_2_Get1(){

			baseURI = "https://reqres.in/api";
			given().
				get("/users?page=2").	
			then().statusCode(200).
				body("data[2].id",equalTo(9)).
				body("data.first_name",hasItems("Lindsay","Tobias")).
				log().all();								
			
		}
		
		
		@Test
		public void test_1_3_Get1(){

			baseURI = "https://reqres.in/api";
			given().
				get("/users?page=2").	
			then().statusCode(200).
				body("data[3].id",equalTo(10)).
				body("data.first_name",hasItems("Tobias","Byron")).
				log().all();								
			
		}
		
		@Test
		public void test_1_4_Get1() {
			
			System.out.println("Pasando los datos a variables");
			baseURI = "https://reqres.in/api";
			given().
				get("/users?page=2").	
			then().
			and().
				body("data[0].id",equalTo(7)).
				body("data.email",hasItems("michael.lawson@reqres.in")).
				body("data.first_name",hasItems("Michael")).
				body("data.last_name",hasItems("Lawson")).
				body("data.avatar", hasItems("https://reqres.in/img/faces/7-image.jpg"));
			Map<String, Object>  jsonAsMap = new HashMap<>();
			jsonAsMap.put("First Name :", "data.first_name");
			jsonAsMap.put("Last Name :", "data.last_name");
			jsonAsMap.put("Avatar url:", "data.avatar");
			given().
			        contentType("application/json; charset=UTF-16").
			        body(jsonAsMap).
			when().
			        post("/somewhere").
			then().
			        statusCode(200);
		}
	

}

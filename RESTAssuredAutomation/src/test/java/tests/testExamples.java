package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class testExamples {
	
	@Test
	public void test_1_Get() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println("Status Code:"+response.getStatusCode());
		System.out.println("Status Line:"+response.getStatusLine());
		System.out.println("Time:"+response.getTime());
		System.out.println("Body:"+response.getBody().asString());
		System.out.println("Header:"+response.getHeader("content-type"));
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode,200);
		
		System.out.println("-------------------End Of Case-------------------");
	}
	
	
	
	@Test
	public void test_2_Post() {
		Response response2 = RestAssured.post("https://reqres.in/api/users");
		
		System.out.println("Status Code:"+response2.getStatusCode());
		System.out.println("Status Line:"+response2.getStatusLine());
		System.out.println("Time:"+response2.getTime());
		System.out.println("Header:"+response2.getHeader("content-type"));
		int statusCode = response2.getStatusCode();
		Assert.assertEquals(statusCode,415);
		System.out.println("-------------------End Of Case-------------------");
		
		
	}
	
	
	
	
	
	
	
	
	@Test
	public void test_3_Put() {
	
		Response response3 =RestAssured.put("https://reqres.in/api/users/2");
		
		System.out.println("Status Code:"+response3.getStatusCode());
		System.out.println("Status Line:"+response3.getStatusLine());
		System.out.println("Time:"+response3.getTime());
		System.out.println("Header:"+response3.getHeader("content-type"));
		int statusCode = response3.getStatusCode();
		Assert.assertEquals(statusCode,200);
		System.out.println("-------------------End Of Case-------------------");
		
	
	}
	
	
	
	
	@Test
	public void test_4_Patch() {
		
		
		Response response4 = RestAssured.patch("https://reqres.in/api/users/2");
		
		System.out.println("Status Code:"+response4.getStatusCode());
		System.out.println("Status Line:"+response4.getStatusLine());
		System.out.println("Time:"+response4.getTime());
		System.out.println("Header:"+response4.getHeader("content-type"));
		int statusCode = response4.getStatusCode();
		Assert.assertEquals(statusCode,200);
		System.out.println("-------------------End Of Case-------------------");
		
	}
	
	
	
	
	@Test
	public void test_5_Delete() {
		
		
		Response response5 = RestAssured.delete("https://reqres.in/api/users/2");
		
		System.out.println("Status Code:"+response5.getStatusCode());
		System.out.println("Status Line:"+response5.getStatusLine());
		System.out.println("Time:"+response5.getTime());
		System.out.println("Header:"+response5.getHeader("content-type"));
		int statusCode = response5.getStatusCode();
		Assert.assertEquals(statusCode,204);
		System.out.println("-------------------End Of Case-------------------");
		
		
	}
	
	
	
	
	

}

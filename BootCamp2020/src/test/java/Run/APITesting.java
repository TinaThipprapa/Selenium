package Run;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class APITesting {
  @Test
  public void f() {
	  File fi = new File("/Users/tina/eclipse-workspace/BootCamp2020/data.json"); 
	  Response usr =given().contentType("application/json").body(fi).post("http://dummy.restapiexample.com/api/v1/create");
	  
	  usr.prettyPrint();
	  usr.then().statusCode(200); //what the expect status code
  }
}

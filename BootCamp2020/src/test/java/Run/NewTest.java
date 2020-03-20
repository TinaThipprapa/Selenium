package Run;

import static io.restassured.RestAssured.get;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class NewTest {
  @Test
  public void f() {
	  Response req = get("https://reqres.in/api/users?page=2");
	  req.prettyPrint();
	  System.out.println(req.getStatusCode());
	  System.out.println(req.getTime());
  }
}

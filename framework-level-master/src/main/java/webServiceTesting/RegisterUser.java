package webServiceTesting;

import java.util.HashMap;
import java.util.Map;

import gherkin.deps.com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RegisterUser {

  private String userName;
  private String password = "";
  private final RequestSpecification requestSpecification;

  public RegisterUser() {
    this.requestSpecification = RestAssured.given()
        .baseUri("https://reqres.in/api")
        .basePath("/register");
  }
 
  public RequestSpecification getRequestSpecification() {
    return this.requestSpecification;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setPassword(String password) {
    this.password = password;
  }

    
  public Response sendRegisterRequest() {
	  RequestSpecification request = this.getRequestSpecification();
	  Response r = request.auth().basic(this.userName, this.password).contentType(ContentType.TEXT).post();
	  return r;
  }
}

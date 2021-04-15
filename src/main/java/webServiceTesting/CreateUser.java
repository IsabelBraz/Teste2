package webServiceTesting;

import java.util.HashMap;
import java.util.Map;

import gherkin.deps.com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser {

  private String name;
  private String job;
  private final RequestSpecification requestSpecification;

  public CreateUser() {
    this.requestSpecification = RestAssured.given()
        .baseUri("https://reqres.in/api")
        .basePath("/users");
  }
 
  public RequestSpecification getRequestSpecification() {
    return this.requestSpecification;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public String buildBody() {
	  Map<String, String> elements = new HashMap();
      elements.put("name", this.name);
      elements.put("job", this.job);
      
      Gson g = new Gson();
      return g.toJson(elements);   
  }

  public String buildBodyWithSurname() {
	  String bodyWithSurname = "{\n" +
		      "    \"name\": \""+ this.name + " autoSurname\",\n" +
		      "    \"job\": \""+ this.job+ "\"\n" +
		      "}";

    return bodyWithSurname;
  }
  
  public Response sendPostRequest() {
	  RequestSpecification request = this.getRequestSpecification();
	  request.header("Content-Type", "application/json");
	  request.body(this.buildBody());
	  return request.post("/register");
  }
}

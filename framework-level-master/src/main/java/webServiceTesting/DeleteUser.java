package webServiceTesting;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteUser {
	
	private String user;
	private RequestSpecification requestSpecification;
	
	public DeleteUser() {
	    this.requestSpecification = RestAssured.given()
	        .baseUri("https://reqres.in/api")
	        .basePath("/users/${user}");
	  }
	 
	  public RequestSpecification getRequestSpecification() {
	    return this.requestSpecification;
	  }

	  public void setUser(String user) {
	    this.user = user;
	  }

	  public String getUser() {
	    return this.user;
	  }
  
	  public Response sendDeleteRequest(String user) {
		  RequestSpecification request = this.getRequestSpecification();
		  return request.pathParam("user", user).delete();
		  
		  //return request.post("/delete");
	  }

}

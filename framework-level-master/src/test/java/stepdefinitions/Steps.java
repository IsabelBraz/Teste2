package stepdefinitions;


import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import webServiceTesting.CreateUser;
import webServiceTesting.DeleteUser;

public class Steps {

  CreateUser createUser= new CreateUser();
  DeleteUser deleteUser = new DeleteUser();
  String name, job;
  Response r;
  String userId;

  @Given("^I use user creation service$")
  public void useUserCreationWebService() {
    System.out.println("Going to use creation service");
  }
  
  @Given("^I use user deletion service$")
  public void useUserDeletionWebService() {
    System.out.println("Going to use deletion service");
  }

  @When("^I set name \"([^\"]*)\"$")
  public void setName(String name) {
    createUser.setName(name);
    this.name = name;
  }

  @When("^I set job \"([^\"]*)\"$")
  public void setJob(String job) {
	  createUser.setJob(job);
	  this.job = job;
  }

  @Then("^I validate my response is correct$")
  public void validateMyResponseIsCorrect() {
	  int statusCode = r.getStatusCode();
	  Assert.assertEquals(statusCode, 201);
  }
  
  @When("^I send user creation request$")
  public void sendCreateUser() {
	  Response r1 = createUser.sendPostRequest();
	  this.r = r1;
  }
  
  @When("^I delete user \\\"([^\\\"]*)\\\"$")
  public void setUserId (String userId) {
	  deleteUser.setUser(userId);
	  this.userId = userId;
	  Response r1 = deleteUser.sendDeleteRequest(userId);
	  this.r = r1;
  }
  
   
  @Then("^I validate deletion was successful$")
  public void validateDeletionWasSuccessful() {
	  int statusCode = this.r.getStatusCode();
	  Assert.assertEquals(statusCode, 204);
  }

  
}

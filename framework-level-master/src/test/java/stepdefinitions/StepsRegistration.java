package stepdefinitions;


import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import webServiceTesting.RegisterUser;


public class StepsRegistration {

  RegisterUser regUser= new RegisterUser();
  String name;
  Response r;
  

  @Given("^I use registration service$")
  public void useUserCreationWebService() {
    System.out.println("Going to use registration service");
  }
  
  @When("^I set userName \"([^\"]*)\"$")
  public void setName(String name) {
    regUser.setUserName(name);
    this.name = name;
  }

  @When("^I send user registration request$")
  public void sendCreateUser() {
	  Response r1 = regUser.sendRegisterRequest();
	  this.r = r1;
  }
  
    
  @Then("^I validate registration was not successful$")
  public void validateDeletionWasSuccessful() {
	  int statusCode = r.getStatusCode();
	  Assert.assertEquals(400, statusCode);
  }

  
}

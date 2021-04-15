package webServiceTesting.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.restassured.response.Response;
import webServiceTesting.CreateUser;
import webServiceTesting.RegisterUser;

public class RegisterUserTest {

	
  RegisterUser registerUser =  new RegisterUser();
 
  String userName = "challenge@automation.com";
  
  @Before
  public void setup() {
	  registerUser.setUserName(userName);
  }

  @Test
  public void registerUserTest() {
	  Response r = registerUser.sendRegisterRequest();
	  int statusCode = r.getStatusCode();
	  Assert.assertEquals(400, statusCode);

  }


}
package webServiceTesting.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.restassured.response.Response;
import webServiceTesting.DeleteUser;

public class DeleteUserTest {

	
  DeleteUser deleteUser =  new DeleteUser();
  String user = "2";

  @Before
  public void setup() {
	deleteUser.setUser(user);
  }

  @Test
  public void deleteUser() {
	Response r = deleteUser.sendDeleteRequest(user);
    Assert.assertEquals(204, r.statusCode());
  }

  

}
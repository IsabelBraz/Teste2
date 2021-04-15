Feature: Users
 
Scenario: Add user with job
 Given I use user creation service
 When I set name "Toy"
 And I set job "singer"
 And I send user creation request
 Then I validate my response is correct
 
Scenario: Delete user
 Given I use user deletion service
 When I delete user "2" 
 Then I validate deletion was successful
 

 
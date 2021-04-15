Feature: Registration
 
Scenario: Submit a new register without password
 Given I use registration service
 When I set userName "challenge@automation.com"
 And I send user registration request
 Then I validate registration was not successful
 

 
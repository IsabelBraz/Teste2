$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Calculation.feature");
formatter.feature({
  "line": 1,
  "name": "Calculation",
  "description": "",
  "id": "calculation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Calculate the price of a full special support plan for 6 months",
  "description": "",
  "id": "calculation;calculate-the-price-of-a-full-special-support-plan-for-6-months",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select type \"Special\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I select support plan \"Full\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I write monthly duration of \"6\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click in calculate price button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I validate price is \"2249.10 $\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsBrowser.openChromeAndLaunchApplication()"
});
formatter.result({
  "duration": 6973609100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Special",
      "offset": 15
    }
  ],
  "location": "StepsBrowser.selectType(String)"
});
formatter.result({
  "duration": 199725500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Full",
      "offset": 23
    }
  ],
  "location": "StepsBrowser.selectSupportPlan(String)"
});
formatter.result({
  "duration": 185985000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 29
    }
  ],
  "location": "StepsBrowser.writeMonthlyDuration(String)"
});
formatter.result({
  "duration": 127101500,
  "status": "passed"
});
formatter.match({
  "location": "StepsBrowser.clickCalculatePriceButton()"
});
formatter.result({
  "duration": 85132500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2249.10 $",
      "offset": 21
    }
  ],
  "location": "StepsBrowser.validatePrice(String)"
});
formatter.result({
  "duration": 5885844800,
  "status": "passed"
});
formatter.uri("Registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration",
  "description": "",
  "id": "registration",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Submit a new register without password",
  "description": "",
  "id": "registration;submit-a-new-register-without-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I use registration service",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I set userName \"challenge@automation.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I send user registration request",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I validate registration was not successful",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsRegistration.useUserCreationWebService()"
});
formatter.result({
  "duration": 717694200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "challenge@automation.com",
      "offset": 16
    }
  ],
  "location": "StepsRegistration.setName(String)"
});
formatter.result({
  "duration": 87900,
  "status": "passed"
});
formatter.match({
  "location": "StepsRegistration.sendCreateUser()"
});
formatter.result({
  "duration": 1631992400,
  "status": "passed"
});
formatter.match({
  "location": "StepsRegistration.validateDeletionWasSuccessful()"
});
formatter.result({
  "duration": 59200,
  "status": "passed"
});
formatter.uri("Users.feature");
formatter.feature({
  "line": 1,
  "name": "Users",
  "description": "",
  "id": "users",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Add user with job",
  "description": "",
  "id": "users;add-user-with-job",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I use user creation service",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I set name \"Toy\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I set job \"singer\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I send user creation request",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I validate my response is correct",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.useUserCreationWebService()"
});
formatter.result({
  "duration": 1980000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Toy",
      "offset": 12
    }
  ],
  "location": "Steps.setName(String)"
});
formatter.result({
  "duration": 81900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "singer",
      "offset": 11
    }
  ],
  "location": "Steps.setJob(String)"
});
formatter.result({
  "duration": 77700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.sendCreateUser()"
});
formatter.result({
  "duration": 480942400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.validateMyResponseIsCorrect()"
});
formatter.result({
  "duration": 196400,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Delete user",
  "description": "",
  "id": "users;delete-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I use user deletion service",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I delete user \"2\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I validate deletion was successful",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.useUserDeletionWebService()"
});
formatter.result({
  "duration": 2665600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 15
    }
  ],
  "location": "Steps.setUserId(String)"
});
formatter.result({
  "duration": 468958600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.validateDeletionWasSuccessful()"
});
formatter.result({
  "duration": 48600,
  "status": "passed"
});
});
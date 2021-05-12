$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Adactin.feature");
formatter.feature({
  "name": "To validate Adactin HotelApp login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefenition.userIsInAdactinLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check the credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enter invalid username and invalid password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "java",
        "haddop"
      ]
    },
    {
      "cells": [
        "mava",
        "premam"
      ]
    },
    {
      "cells": [
        "python",
        "sql"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefenition.userEnterInvalidUsernameAndInvalidPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefenition.userClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the Error message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefenition.userGetsTheErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefenition.userIsInAdactinLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check user enter valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enter valid username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefenition.userEnterValidUsernameAndValidPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefenition.userClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets passed to next page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefenition.userGetsPassedToNextPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
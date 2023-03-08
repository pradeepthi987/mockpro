Feature: feature to check login functionality

Scenario:check login is successfull with valid credentials
   Given user is on login page
   When user enters valid username and password
   And   clicks on login button
   Then user is navigated to the homepage
   
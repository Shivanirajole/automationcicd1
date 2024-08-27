

Feature: Test login functionality
 
 
Scenario:
: check login is suceesfull with valid credentials
  
  Given browser is open
  And user is on login page
  And user clicks on login
  When user enters username and password
  Then user is navigated to the home page 
  
  

  
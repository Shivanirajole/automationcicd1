Feature: login and register

  Scenario: Sucessfull login with the valid team credentials
    Given User launch the crome browser
    When user open the URL "https://dsportalapp.herokuapp.com/register"
    And User enter Username as "Starplayers" and password as "Star@123"
    And click on to register button
    Then page title shoud be "You are logged in"
    Then click to Arrays Get Started
    Then click on the below Topics Covered button
    And click on the signout button
    Then signin again
    
    Scenario Outline: Sucessfull login with the valid team credentials
    Given User launch the crome browser
    When user open the URL "https://dsportalapp.herokuapp.com/register"
    And User enter Username as "<username>" and password as "<password>"
    And click on to register button
    Then page title shoud be "You are logged in"
    Then click to Arrays Get Started
    Then click on the below Topics Covered button
    And click on the signout button
    Then signin again
    
    
    Examples:
    |username    | password |
    |Starplayers | Star     |
    |star        | players  |
    
    
   
    

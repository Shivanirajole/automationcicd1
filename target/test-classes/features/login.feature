

Feature: fcheck google serch functionality
 


  Scenario: validate the gooogle serch is working

Given browser is open
And user is on google serch page
When user is enter a text in a google serch box
And hits enter
Then user is navigated to the serch result page
  

@tag
Feature: Error validation 
  I want to use this template for my feature file

 
  @tag2
  Scenario Outline: Title of your scenario outline
  Given I landed on Ecommerce page
  When logged in with the username <name> and password <password>
  Then "Incorrect email or password." msg is displayed

    Examples: 
   | name                       | password         |   
   | shivanirajole@gmail.com    |  Shivani@12 |  
     

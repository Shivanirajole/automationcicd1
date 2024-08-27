@tag 

Feature:
purchase the order from Ecommerce website 
I want to use this template  for my feature file 

Background:

  Given I landed on Ecommerce page
  
 @tag2
  Scenario Outline: Positive test of  submiiting the order
    Given logged in with the username <name> and password <password>
    When I add product <productName> from cart
    And  checkout <productName> and submit the order
    Then "THANKYOU FOR THE ORDER." message is display on conformation page

    Examples: 
      | name                    | password      |   productName |
      | shivanirajole@gmail.com |  Shivani@123  |   ZARA COAT 3 |
     


Feature: To validate login functionality of adactin
Scenario: To validate login using valid username and valid password 

    Given user launch adactin application
    When user enter username and password
    And user click login button
    
    Then  user see the search Hotel page

 
  
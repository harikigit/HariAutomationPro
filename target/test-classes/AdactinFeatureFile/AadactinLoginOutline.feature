

Feature: To validate login functionality of adactin

 
  Scenario Outline:  To validate login using username  and password 
    Given user launch adactin application
    When user enter "<username>" and "<password>" 
    And user click login button
    
    Then  user see the results based on "<status>"
    Examples: 
      | username  |   password     | status  |
      | abc       |     abc@123    | Fail    |
      | xyz       |     xyz@123    | Fail    |
      | mno       |     mno@123    | Fail    |
      | Tamizh2006|  Tamizh@2006   | success |
      
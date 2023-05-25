
Feature:  To validate booking hotel functionality
  Scenario: To validate  whether the user can book hotel by selecting relevent criteria
   Given  user launch adactin application
    And user enter username and password
    And user click login button
    And user select location,hotels,roomType,noOfRooms,adultsPerRoom,childrenPerRoom
    And user give checkInDate,checkOutDate
    And user click on search button
    And user see the results based on search
    And  user click on select button
    And  user click on continue button

    When user give first name,last name, billing address, creditcard number,billing address,cvv number, creditcard type,cardexpiry
    And user click on book now button
    
    Then user sees the order number
   
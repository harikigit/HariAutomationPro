
  Feature: To validate search hotel functionality
  
  Scenario: To validate whether the user can search hotel by selecting relevent criteria
    Given  user launch adactin application
    And user enter username and password
    And user click login button
    
   When user select location,hotels,roomType,noOfRooms,adultsPerRoom,childrenPerRoom
    And user give checkInDate,checkOutDate
    And user click on search button
    
    Then user see the selectHotel page with payment details


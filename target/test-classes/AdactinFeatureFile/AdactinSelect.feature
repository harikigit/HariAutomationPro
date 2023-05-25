Feature: To validate select hotel functionality

  Scenario: To validate  whether the user can select hotel by selecting relevent criteria
   Given  user launch adactin application
    And user enter username and password
    And user click login button
    And user select location,hotels,roomType,noOfRooms,adultsPerRoom,childrenPerRoom
    And user give checkInDate,checkOutDate
    And user click on search button
    
     When user see the results based on search
     And  user click on select button
     And  user click on continue button

     Then user sees the booking page with pricedetails
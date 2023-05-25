package org.adactin.steps;


import org.adactin.base.BaseClass;
import org.adactin.objectRepository.AdactinSearchPojo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps extends BaseClass {
	public AdactinSearchPojo s;

@When("user select location,hotels,roomType,noOfRooms,adultsPerRoom,childrenPerRoom")
public void user_select_location_hotels_roomType_noOfRooms_adultsPerRoom_childrenPerRoom() {
	 s=new AdactinSearchPojo();
	dropDownSelectByValue(s.getLocation(), "Sydney");
	dropDownSelectByValue(s.getHotels(), "Hotel Creek");
	dropDownSelectByValue(s.getRoomType(), "Deluxe");
	dropDownSelectByValue(s.getNoOfRooms(), "1");
	
	dropDownSelectByValue(s.getAdultPerRoom(), "3");
	dropDownSelectByValue(s.getChildPerRoom(), "2");
	
	
}

@When("user give checkInDate,checkOutDate")
public void user_give_checkInDate_checkOutDate() {
	
	s.getCheakInDate().clear();
	sendText(s.getCheakInDate(),"29/04/2023");
	s.getCheakOutDate().clear();
	sendText(s.getCheakOutDate(), "30/04/2023");
}

@When("user click on search button")
public void user_click_on_search_button() {
	
	 clickBtn(s.getSearchBtn());
   
}

@Then("user see the selectHotel page with payment details")
public void user_see_the_selectHotel_page_with_payment_details() {
	 Assert.assertTrue("Select hotel is not displayed", s.getSelecttxt().isDisplayed());
}



}
package org.adactin.steps;

import org.adactin.base.BaseClass;
import org.adactin.objectRepository.AdactinSelectPojo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectSteps extends BaseClass {
	public AdactinSelectPojo s1;

@When("user see the results based on search")
public void user_see_the_results_based_on_search() {
	s1=new AdactinSelectPojo();
	 Assert.assertTrue("price details not displayed", s1.getTxtTotalPrize().isDisplayed());
}

@When("user click on select button")
public void user_click_on_select_button() {
	
	clickBtn(s1.getRadioBtn());
   
}

@When("user click on continue button")
public void user_click_on_continue_button() {
	clickBtn(s1.getContinueBtn());
    
}

@Then("user sees the booking page with pricedetails")
public void user_sees_the_booking_page_with_pricedetails() {
    
	  Assert.assertTrue("book a hotel is not displayed", s1.getBookAHotelTxt().isDisplayed());

}
}
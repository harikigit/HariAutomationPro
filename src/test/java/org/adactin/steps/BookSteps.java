package org.adactin.steps;

import org.adactin.base.BaseClass;
import org.adactin.objectRepository.AdactinBookPojo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookSteps extends BaseClass {
	
	public AdactinBookPojo b;

@When("user give first name,last name, billing address, creditcard number,billing address,cvv number, creditcard type,cardexpiry")
public void user_give_first_name_last_name_billing_address_creditcard_number_billing_address_cvv_number_creditcard_type_cardexpiry() {
	 b= new AdactinBookPojo();
	    sendText(b.getFirstName(), "hari");
	    sendText(b.getLastName(),"kishore" );   
	    sendText(b.getAddress(),"kochadai");
	    sendText(b.getCreditCardNo(), "1234123412341234");
	    dropDownSelectByValue(b.getCreditCardType(), "VISA");
	    dropDownSelectByValue(b.getCreditCardExpMonth(), "3");
		 dropDownSelectByValue(b.getCreditCardExpYear(), "2021");
		 sendText(b.getCvvNo(),"123");
		 
}

@When("user click on book now button")
public void user_click_on_book_now_button() {
	clickBtn(b.getBookNowBtn());
}

@Then("user sees the order number")
public void user_sees_the_order_number() {
	Assert.assertTrue("Select hotel is not displayed", b.getOrderTxt().isDisplayed());
}

}

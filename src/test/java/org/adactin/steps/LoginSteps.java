package org.adactin.steps;

import org.adactin.base.BaseClass;
import org.adactin.objectRepository.AdactinLoginPojo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{


@Given("user launch adactin application")
public void user_launch_adactin_application() {

	launchChromeBrowser();
	launchUrl("http://adactinhotelapp.com/");
	maxBrowser();
	allWebElementWait(10);
	}

@When("user enter username and password")
public void user_enter_username_and_password() {
	AdactinLoginPojo l=new AdactinLoginPojo();
	sendText(l.getTxtLoginId(),"Tamizh2006");
	sendText(l.getTxtPassword(),"Tamizh@2006");
}

@When("user click login button")
public void user_click_login_button() {
	AdactinLoginPojo l=new AdactinLoginPojo();
	clickBtn(l.getTxtLoginBtn());}

@Then("user see the searchHotel page")
public void user_see_the_searchHotel_page() {

	AdactinLoginPojo l=new AdactinLoginPojo();
   Assert.assertTrue("Search hotel is not displayed", l.getSearchTxt().isDisplayed());
}


}
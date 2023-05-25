package org.adactin.steps2;

import org.adactin.base.BaseClass;
import org.adactin.objectRepository.AdactinLoginPojo;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginOutlineSteps extends BaseClass {
	 
	 public AdactinLoginPojo a;
@Given("user launch adactin application")
public void user_launch_adactin_application() {

	launchChromeBrowser();
	launchUrl("http://adactinhotelapp.com/");
	maxBrowser();
	allWebElementWait(10);
	
}

@When("user enter {string} and {string}")
public void user_enter_and(String s1, String s2) {
	a= new AdactinLoginPojo();
     sendText(a.getTxtLoginId(), s1);
     sendText(a.getTxtPassword(), s2);
   
}

@When("user click login button")
public void user_click_login_button() {
    clickBtn(a.getTxtLoginBtn());
}

@Then("user see the results based on {string}")
public void user_see_the_results_based_on(String data) {
	if (data.equals("success")) {
 Assert.assertTrue("Search hotel is not displayed", a.getSearchTxt().isDisplayed());
		
	}
	else {
Assert.assertTrue("Search hotel is not displayed", a.getInvalidTxt().isDisplayed());
	}
	}
		
}





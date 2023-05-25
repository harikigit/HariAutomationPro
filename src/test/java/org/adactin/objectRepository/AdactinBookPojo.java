package org.adactin.objectRepository;

import org.adactin.steps.BookSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AdactinBookPojo extends BookSteps{

	public AdactinBookPojo() {
	
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
	private WebElement firstName;

	@FindBy(id="last_name")
	private WebElement lastName;


	@FindBy(id="address")
	private WebElement address;

	@FindBy(id="cc_num")
	private WebElement creditCardNo;


	@FindBy(id="cc_type")
	private WebElement creditCardType;

	@FindBy(id="cc_exp_month")
	private WebElement creditCardExpMonth;


	@FindBy(id="cc_exp_year")
	private WebElement creditCardExpYear;

	@FindBy(id="cc_cvv")
	private WebElement cvvNo;


	@FindBy(id="book_now")
	private WebElement bookNowBtn;

	@FindBy(id="order_no")
	private WebElement orderNo;
	
	@FindBy(xpath="//td[contains(text(),'Order No.')]")
	private WebElement orderTxt;

	public WebElement getOrderTxt() {
		return orderTxt;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getCreditCardExpMonth() {
		return creditCardExpMonth;
	}

	public WebElement getCreditCardExpYear() {
		return creditCardExpYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}


}

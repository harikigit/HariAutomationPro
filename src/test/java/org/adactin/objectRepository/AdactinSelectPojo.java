package org.adactin.objectRepository;

import org.adactin.steps.SelectSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSelectPojo extends SelectSteps {

	public AdactinSelectPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_0")
	private WebElement radioBtn;

	@FindBy(id="continue")
	private WebElement continueBtn;
	
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement bookAHotelTxt;
	
	@FindBy(xpath="//strong[contains(text(),'Total Price ')]")
	private WebElement txtTotalPrize;
	
	

	public WebElement getTxtTotalPrize() {
		return txtTotalPrize;
	}

	public WebElement getBookAHotelTxt() {
		return bookAHotelTxt;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

}

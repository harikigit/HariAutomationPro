package org.adactin.objectRepository;

import org.adactin.steps.LoginSteps;
import org.adactin.steps2.LoginOutlineSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AdactinLoginPojo extends LoginOutlineSteps {
	
		
		public AdactinLoginPojo() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="username")
		private WebElement txtLoginId;
		
		@FindBy(id="password")
		private WebElement txtPassword;
		
		@FindBy(id="login")
		private WebElement txtLoginBtn;
		
		@FindBy(xpath="//td[text()='Search Hotel ']")
		private WebElement searchTxt;
		
		@FindBy(xpath="//b[contains(text(),'Invalid Login details ')]")
		private WebElement invalidTxt;


		public WebElement getInvalidTxt() {
			return invalidTxt;
		}

		public WebElement getSearchTxt() {
			return searchTxt;
		}

		public WebElement getTxtLoginId() {
			return txtLoginId;
		}

		public WebElement getTxtPassword() {
			return txtPassword;
		}

		public WebElement getTxtLoginBtn() {
			return txtLoginBtn;
		}
	}



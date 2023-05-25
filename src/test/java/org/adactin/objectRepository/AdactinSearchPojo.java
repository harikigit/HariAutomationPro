package org.adactin.objectRepository;

import org.adactin.steps.SearchSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdactinSearchPojo extends SearchSteps{
	public AdactinSearchPojo() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="location")
	private WebElement location;

	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement cheakInDate;
	
	@FindBy(id="datepick_out")
	private WebElement cheakOutDate;
	
	@FindBy(id="adult_room")
	private WebElement adultPerRoom;
	
	@FindBy(id="child_room")
	private WebElement childPerRoom;
	
	@FindBy(id="Submit")
	private WebElement searchBtn;
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement selecttxt;

	public WebElement getSelecttxt() {
		return selecttxt;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheakInDate() {
		return cheakInDate;
	}

	public WebElement getCheakOutDate() {
		return cheakOutDate;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	
	

}

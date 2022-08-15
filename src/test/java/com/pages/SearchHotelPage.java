 package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="location")
	private WebElement dDnLocation;
	@FindBy(id="hotels")
	private WebElement dDnHotels;
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	@FindBy(id="room_nos")
	private WebElement dDnRooms;
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	public WebElement getVerifyMessage() {
		return verifyMessage;
	}
	public WebElement getCheckINError() {
		return checkINError;
	}
	public WebElement getCheckOutError() {
		return checkOutError;
	}
	public WebElement getLocationError() {
		return locationError;
	}
	@FindBy(id="datepick_out")
	private WebElement txtCheckoutDate;
	@FindBy(id="adult_room")
	private WebElement dDnAdultsperRooms;
	@FindBy(id="child_room")
	private WebElement dDnChildrenperRoom;
	@FindBy(id="Submit")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//td[text()='Select Hotel ']")
	private WebElement verifyMessage;

	@FindBy(xpath = "//span[@id='checkin_span']")
	private WebElement checkINError;
	
	@FindBy(xpath = "//span[@id='checkout_span']")
	private WebElement checkOutError;
	
	@FindBy(id = "location_span")
	private WebElement locationError;
	
	public WebElement getdDnLocation() {
		return dDnLocation;
	}
	public WebElement getdDnHotels() {
		return dDnHotels;
	}
	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}
	public WebElement getdDnRooms() {
		return dDnRooms;
	}
	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}
	public WebElement getTxtCheckoutDate() {
		return txtCheckoutDate;
	}
	public WebElement getdDnAdultsperRooms() {
		return dDnAdultsperRooms;
	}
	public WebElement getdDnChildrenperRoom() {
		return dDnChildrenperRoom;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	public void searchHotels(String location,String hotels,String roomType,String noofRooms,String checkInDate,String checkoutDate,
			String adultsperRoom,String childrenperRooms) {
		selectOptionByText(getdDnLocation(),location);
		selectOptionByText(getdDnHotels(),hotels);
		selectOptionByText(getdDnRoomType(),roomType);
		selectOptionByText(getdDnRooms(),noofRooms);
		clear(getTxtCheckInDate());
		type(getTxtCheckInDate(),checkInDate);
		clear(getTxtCheckoutDate());
		type(getTxtCheckoutDate(),checkoutDate);
		selectOptionByText(getdDnAdultsperRooms(),adultsperRoom);
		selectOptionByText(getdDnChildrenperRoom(),childrenperRooms);
		click( getBtnSubmit());

	}
	public void searchHotels(String location,String noofRooms,String checkInDate,String checkoutDate,
			String adultsperRoom) {
		selectOptionByText(getdDnLocation(),location);
		selectOptionByText(getdDnRooms(),noofRooms);
		clear(getTxtCheckInDate());
		type(getTxtCheckInDate(),checkInDate);
		clear(getTxtCheckoutDate());
		type(getTxtCheckoutDate(),checkoutDate);
		selectOptionByText(getdDnAdultsperRooms(),adultsperRoom);
		click( getBtnSubmit());

	}

	public void searchHotel() {
		click( getBtnSubmit());
	}
}
package com.stepDefinition;

import javax.xml.soap.Text;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanagers.PageObjectManager;

import cucumber.api.java.en.Then;

public class TC2_SearchHotelStep extends BaseClass  {

	PageObjectManager manager= new PageObjectManager();
	

	@Then("User should search hotel by selecting all fields {string},{string},{string},{string},{string},{string},{string}and{string}")
	public void userShouldSearchHotelBySelectingAllFieldsAnd(String location, String hotels, String roomType, String noofRooms, String checkInDate, String CheckoutDate, String adultsperRoom, String childrenperRooms) throws InterruptedException{
		manager.getSearchHotelPage().searchHotels(location, hotels, roomType, noofRooms, checkInDate, CheckoutDate, adultsperRoom, childrenperRooms);
		//Thread.sleep(10000);

	}

	@Then("User should verify success message after search {string}")
	public void userShouldVerifySuccessMessageAfterSearch(String verifyMessage) {

		String text = getText(manager.getSearchHotelPage().getVerifyMessage());
		Assert.assertEquals("hy", verifyMessage ,text);

	}

	@Then("User should search hotel by selecting only mandatory fields{string},{string},{string},{string}and{string}")
	public void userShouldSearchHotelBySelectingOnlyMandatoryFieldsAnd(String location, String noofRooms, String checkInDate, String CheckoutDate, String adultsperRoom) throws InterruptedException{
		manager.getSearchHotelPage().searchHotels(location, noofRooms, checkInDate, CheckoutDate, adultsperRoom);
		Thread.sleep(10000); 
	}

	@Then("User should search hotel by selecting fields {string},{string},{string},{string},{string},{string},{string}and{string}")
	public void userShouldSearchHotelBySelectingFieldsAnd(String location, String hotels, String roomType, String noofRooms, String checkInDate, String CheckoutDate, String adultsperRoom, String childrenperRooms) throws InterruptedException {
		manager.getSearchHotelPage().searchHotels(location, hotels, roomType, noofRooms, checkInDate, CheckoutDate, adultsperRoom, childrenperRooms); 
		

	}

	@Then("User should verify date error message after search {string}and{string}")
	public void userShouldVerifyDateErrorMessageAfterSearchAnd(String getCheckInError, String getCheckOutError) {
		implicitWait(30);
		String checkin = getText(manager.getSearchHotelPage().getCheckINError());
		 Assert.assertEquals("hy", getCheckInError, checkin);
		 
		 String checkout = getText(manager.getSearchHotelPage().getCheckOutError());
		 
		 Assert.assertEquals("hy",getCheckOutError,checkout);

	}

	@Then("User should search for hotel without passing search hotel field")
	public void userShouldSearchForHotelWithoutPassingSearchHotelField() {
		manager.getSearchHotelPage().searchHotel();

	}

	@Then("User should verify error message after search {string}")
	public void userShouldVerifyErrorMessageAfterSearch(String locationError) {
		
		String location = getText(manager.getSearchHotelPage().getLocationError());
		 Assert.assertEquals("hy", locationError, location);

	}

}

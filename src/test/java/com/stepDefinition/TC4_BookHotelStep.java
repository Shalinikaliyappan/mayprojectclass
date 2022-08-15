package com.stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanagers.PageObjectManager;

import cucumber.api.java.en.Then;

public class TC4_BookHotelStep extends BaseClass {
	
	PageObjectManager manager= new PageObjectManager();
	
	@Then("User should the book hotel {string},{string}and{string}")
	public void userShouldTheBookHotelAnd(String FirstName, String LastName, String BillingAddress, io.cucumber.datatable.DataTable dataTable) {
		 List<Map<String, String>> m = dataTable.asMaps();
         manager.getBookHotelPage().bookHotel(FirstName, LastName, BillingAddress, m.get(1).get("CreditCardNo"), m.get(1).get("CreditCardType"), m.get(1).get("SelectMonth"), m.get(1).get("SelectYear"),m.get(1).get("CVVNumber"));
	    
	}

	@Then("User should Verify text after booking {string}")
	public void userShouldVerifyTextAfterBooking(String VerifyMessage) {
		
		System.out.println(getText(manager.getBookHotelPage().getVerrifyMessage()));
		String verifymsg = getText(manager.getBookHotelPage().getVerrifyMessage());
		Assert.assertEquals("verify", VerifyMessage, verifymsg);

	   
	}

	@Then("User should book a hotel without passing any fields in book hotel page")
	public void userShouldBookAHotelWithoutPassingAnyFieldsInBookHotelPage() {
		manager.getBookHotelPage().bookHotel();
	   
	}

	@Then("User without enter all field verify all error message {string},{string},{string},{string},{string},{string}and{string}")
	public void userWithoutEnterAllFieldVerifyAllErrorMessageAnd(String FirstnameError, String LastnameError,
			String AddressError, String CcNumError, String CcTypeError, String CcExpiryError, String CvvError) {
		
		String firstname = getText(manager.getBookHotelPage().getFirstnameError());
		Assert.assertEquals("verified", FirstnameError, firstname);

		String lastname = getText(manager.getBookHotelPage().getLastnameError());
		Assert.assertEquals("verified", LastnameError, lastname);
		String address = getText(manager.getBookHotelPage().getAddressError());
		Assert.assertEquals("verified", AddressError, address);
		String cardnumber = getText(manager.getBookHotelPage().getCcNumError());
		Assert.assertEquals("verified", CcNumError, cardnumber);
		String cardtype = getText(manager.getBookHotelPage().getCcTypeError());
		Assert.assertEquals("verified", CcTypeError, cardtype);
		String expiry = getText(manager.getBookHotelPage().getCcExpiryError());
		Assert.assertEquals("verified", CcExpiryError, expiry);
		String cvv = getText(manager.getBookHotelPage().getCvvError());
		Assert.assertEquals("verified", CvvError, cvv);

	    
		
		
	}

}

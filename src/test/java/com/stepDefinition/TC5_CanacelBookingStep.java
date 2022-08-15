package com.stepDefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanagers.PageObjectManager;

import cucumber.api.java.en.Then;

public class TC5_CanacelBookingStep extends BaseClass {

	PageObjectManager manager= new PageObjectManager();

	@Then("User should cancel orderId")
	public void userShouldCancelOrderId() {
		String orderId = manager.getBookConfirmPage().getOrderId();
		manager.getCancelBookingPage().cancelOrderId(orderId);

	}

	@Then("User should verify after cancel order Id {string}")
	public void userShouldVerifyAfterCancelOrderId(String SearchResultError) {
		
		String searcherror = getText(manager.getCancelBookingPage().getSearchResultError());

		System.out.println(searcherror);

		Assert.assertEquals("verify", SearchResultError, searcherror);

	}

	@Then("User should cancel the existing order Id{string}")
	public void userShouldCancelTheExistingOrderId(String string) {
		manager.getCancelBookingPage().cancelOrderId(string);

	}

}

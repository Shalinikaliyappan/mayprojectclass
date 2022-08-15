package com.stepDefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanagers.PageObjectManager;

import cucumber.api.java.en.Then;

public class TC3_SelectHotelStep extends BaseClass {
	PageObjectManager manager= new PageObjectManager();
	
	@Then("User should select a hotel and continue")
	public void userShouldSelectAHotelAndContinue() {
		
		manager.getSelectHotelPage().selectHotel();
	   
	}

	@Then("User should verify text after continue {string}")
	public void userShouldVerifyTextAfterContinue(String verifyMessage) {
		String verifymsg = getText(manager.getSelectHotelPage().getVerifyMessage());
		System.out.println(verifymsg);
		Assert.assertEquals("hy", verifyMessage, verifymsg);
		  
	   
	}

	@Then("User doesnt select a hotel and continue")
	public void userDoesntSelectAHotelAndContinue() {
		
		manager.getSelectHotelPage().clickContinue();
	    	}

	@Then("User should verify error message  after continue {string}")
	public void userShouldVerifyErrorMessageAfterContinue(String BtnErrorMsg) {
		
		String btnerror = getText(manager.getSelectHotelPage().getBtnErrorMsg());
		Assert.assertEquals("hy", BtnErrorMsg, btnerror);
	    
	}

}

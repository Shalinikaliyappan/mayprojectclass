package com.stepDefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.config.Configuration;
import com.pagemanagers.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonStep extends BaseClass {

	PageObjectManager manager= new PageObjectManager();

	@Given("User is on the  Adactinhotel page")
	public void userIsOnTheAdactinhotelPage() {

		getDriver(Configuration.BROWSERTYPE);
		implicitWait(30);
		maximize();
		loadUrl(Configuration.URL);
	}
	@Then("User should verify success message after login{string}")
	public void userShouldVerifySuccessMessageAfterLogin(String VerifyMessage) {
		
		String verifymsg = findAttValue(manager.getLoginPage().getVerifyMessage());
		System.out.println(verifymsg);
		Assert.assertEquals("verified", VerifyMessage, verifymsg);

	}
}

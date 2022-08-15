package com.stepDefinition;

import java.awt.AWTException;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanagers.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC1_LoginStep extends BaseClass {
	
	PageObjectManager manager= new PageObjectManager();
	
	@When("User should login with {string} and {string}")
	public void userShouldLoginWithAnd(String username, String password) {
	   manager.getLoginPage().login(username, password);
	}

	

	@When("User should login with Enter Key{string} and {string}")
	public void userShouldLoginWithEnterKeyAnd(String username, String password) throws AWTException {
	    manager.getLoginPage().loginWithEnter(username, password);
	}

	@Then("User should verify after login with error message {string}")
	public void userShouldVerifyAfterLoginWithErrorMessage(String verifymessage) {
		
		String text = getText(manager.getLoginPage().getErrorMessage());
		Assert.assertTrue("hy",text.contains(verifymessage));
		
	    
	}
}

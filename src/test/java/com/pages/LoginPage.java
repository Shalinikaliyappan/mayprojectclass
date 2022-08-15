
package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}

//1.Login with valid Credentials 3.Invalid
	@FindBy(id="username")
	private WebElement txtusername;
	@FindBy(id ="password")
	private WebElement txtpassword;
	@FindBy(id="login")
	private WebElement btnlogin;
	
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getVerifyMessage() {
		return verifyMessage;
	}
	public WebElement getErrorMessage() {
		return errorMessage;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	@FindBy(id = "username_show")
	private WebElement verifyMessage;
	
	@FindBy(xpath = "//div[@class='auth_error']")
	private WebElement errorMessage;

	//1.Login with valid Credentials 3.InvalidS
	public void login(String username, String password) {
		type(getTxtusername(),username);
		type(getTxtpassword(),password);
		click(getBtnlogin());
		
	}
	//Login with Enter key
	public void loginWithEnter(String username, String password) throws AWTException {
		type(getTxtusername(),username);
		type(getTxtpassword(),password);
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}
	
}
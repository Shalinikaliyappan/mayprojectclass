
package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement selectHotel;
	@FindBy(id="continue")
	private WebElement clickContinue;
	
	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement verifyMessage;
	
	@FindBy(id="radiobutton_span")
	private WebElement btnErrorMsg;
	
	

	public WebElement getVerifyMessage() {
		return verifyMessage;
	}


	public WebElement getBtnErrorMsg() {
		return btnErrorMsg;
	}


	public WebElement getSelectHotel() {
		return selectHotel;
	}


	public WebElement getClickContinue() {
		return clickContinue;
	}

    //By select hotel name
	public void selectHotel() {
		click(getSelectHotel());
		click(getClickContinue());
	}
	//Without select hotel click continue
	public void clickContinue() {
		click(getClickContinue());	
	}
	
	}
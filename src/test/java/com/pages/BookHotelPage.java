	
package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="first_name")
	private WebElement firstname ;
	@FindBy(id="last_name")
	private WebElement  lastname;
	@FindBy(id="address")
	private WebElement Address ;
	@FindBy(id="cc_num")
	private WebElement cardno ;
	@FindBy(id="cc_type")
	private WebElement cardtype ;
	@FindBy(id="cc_exp_month")
	private WebElement expiremonth ;
	@FindBy(id="cc_exp_year")
	private WebElement expireyear ;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvvno ;
	@FindBy(id="book_now")
	private WebElement Booknow ;
	
	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement verrifyMessage;

		
		@FindBy(id = "first_name_span")
		private WebElement firstnameError;
		

		@FindBy(id = "last_name_span")
		private WebElement lastnameError;
		@FindBy(id = "address_span")
		private WebElement addressError;
		@FindBy(id = "cc_num_span")
		private WebElement ccNumError;
		@FindBy(id = "cc_type_span")
		private WebElement ccTypeError;
		@FindBy(id = "cc_expiry_span")
		private WebElement ccExpiryError;
		@FindBy(id = "cc_cvv_span")
		private WebElement cvvError;

	
	public WebElement getVerrifyMessage() {
			return verrifyMessage;
		}
		public WebElement getFirstnameError() {
			return firstnameError;
		}
		public WebElement getLastnameError() {
			return lastnameError;
		}
		public WebElement getAddressError() {
			return addressError;
		}
		public WebElement getCcNumError() {
			return ccNumError;
		}
		public WebElement getCcTypeError() {
			return ccTypeError;
		}
		public WebElement getCcExpiryError() {
			return ccExpiryError;
		}
		public WebElement getCvvError() {
			return cvvError;
		}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpiremonth() {
		return expiremonth;
	}
	public WebElement getExpireyear() {
		return expireyear;
	}
	public WebElement getCvvno() {
		return cvvno;
	}
	public WebElement getBooknow() {
		return Booknow;
	}
	public void bookHotel( String firstname,String Lastname,String Address,String cardno,String cardtype,String Month,String year,String cvvno) 
	{
		type(getFirstname(),firstname);
		type(getLastname(),Lastname);
	    type(getAddress(),Address);
	    type(getCardno(),cardno);
	    selectOptionByText(getCardtype(),cardtype);
	    selectOptionByText(getExpiremonth(),Month);
	    selectOptionByText(getExpireyear(),year);
	    type(getCvvno(),cvvno);
	    click(getBooknow());
	    
	}
	public void bookHotel() {
		click(getBooknow());
	}
	
	
	
	
}
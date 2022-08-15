
package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CancelBookingPage extends BaseClass {
	public CancelBookingPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement bookItineary;

	@FindBy(id = "order_id_text")
	private WebElement orderidSearch;

	@FindBy(id = "search_hotel_id")
	private WebElement search;

	//	@FindBy(id = "check_all")
	//	private WebElement checkAll;

	@FindBy(xpath = "//input[contains(@id,'btn_id')]")
	private WebElement cancelAll;

	@FindBy(id = "search_result_error")
	private WebElement cancelmsg;

	@FindBy(id = "search_result_error")
	private WebElement searchResultError;

	public WebElement getBookItineary() {
		return bookItineary;
	}

	public WebElement getOrderidSearch() {
		return orderidSearch;
	}

	public WebElement getSearch() {
		return search;
	}


	public WebElement getCancelAll() {
		return cancelAll;
	}

	public WebElement getCancelmsg() {
		return cancelmsg;
	}

	public WebElement getSearchResultError() {
		return searchResultError;
	}

	public void cancelOrderId(String data) {
		click(getBookItineary());
		type(getOrderidSearch(), data);
		click(getSearch());
		//		click(getCheckAll());
		click(getCancelAll());
		Alert al = driver.switchTo().alert();
		al.accept();
		
		//		click(getCancelmsg());

	}
}
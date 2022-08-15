
package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingConfirmPage extends BaseClass {
	public BookingConfirmPage() {
		
		
		PageFactory.initElements(driver, this);
	}
	 @FindBy(id="order_no")
	   private WebElement textOrderId;
	 
	 
	 public WebElement getTextOrderId() {
		return textOrderId;
	 }
     
	
	 public String getOrderId() {
		String attributeValue= findAttValue(getTextOrderId());
		System.out.println(attributeValue);
		return attributeValue;
		
     } 
	 
	
}
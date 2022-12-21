package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CancelBookingPage extends BaseClass {
	
	public CancelBookingPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement clickBookItinerary;
	
	

	@FindBy(id="order_id_text")
	private WebElement searchid;
	
	@FindBy(id="search_hotel_id")
   private WebElement goclick;
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement cancelClick;
	
	@FindBy(id="search_result_error")
	private WebElement successMsg;
	
	
	public WebElement getClickBookItinerary() {
		return clickBookItinerary;
	}

	public WebElement getSearchid() {
		return searchid;
	}

	
	public WebElement getGoclick() {
		return goclick;
	}

	public WebElement getCancelClick() {
		return cancelClick;
	}

	
	
	
	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public void cancelOrderID(String orderId) {
         click(getClickBookItinerary());
		sendKeysValue(getSearchid(), orderId);
		click(getGoclick());
		click(getCancelClick());
		alertHandlingAccept();
		
	}
	
	
}

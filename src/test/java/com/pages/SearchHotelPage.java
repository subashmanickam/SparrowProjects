package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement room_type;

	@FindBy(id = "room_nos")
	private WebElement room_nos;

	@FindBy(id = "datepick_in")
	private WebElement CheckIn;

	@FindBy(id = "datepick_out")
	private WebElement CheckOut;

	@FindBy(id = "adult_room")
	private WebElement adultsroom;

	@FindBy(id = "child_room")
	private WebElement childrenroom;

	@FindBy(id = "Submit")
	private WebElement Search;

	@FindBy(id = "location_span")
	private WebElement LocationError;

	@FindBy(id = "checkin_span")
	private WebElement CheckInError;

	@FindBy(id = "checkout_span")
	private WebElement CheckOutError;

	@FindBy(id = "username_show")
	private WebElement successLoginMsg;
	
	
 
	
	public WebElement getSuccessLoginMsg() {
		return successLoginMsg;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getCheckIn() {
		return CheckIn;
	}

	public WebElement getCheckOut() {
		return CheckOut;
	}

	public WebElement getAdultsroom() {
		return adultsroom;
	}

	public WebElement getChildrenroom() {
		return childrenroom;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getLocationError() {
		return LocationError;
	}

	public WebElement getCheckInError() {
		return CheckInError;
	}

	public WebElement getCheckOutError() {
		return CheckOutError;
	}

	public void searchHotelCommon(String location, String room_nos, String CheckIn, String CheckOut,
			String adultsroom) {

		selectByVisibleText(getLocation(), location);
		selectByVisibleText(getRoom_nos(), room_nos);
		clear(getCheckIn());
		sendKeysValue(getCheckIn(), CheckIn);
		clear(getCheckOut());
		sendKeysValue(getCheckOut(), CheckOut);
		selectByVisibleText(getAdultsroom(), adultsroom);

	}

	public void searchHotel(String location, String hotels, String room_type, String room_nos, String CheckIn,
			String CheckOut, String adultsroom, String childrenroom) {
		searchHotelCommon(location, room_nos, CheckIn, CheckOut, adultsroom);
		selectByVisibleText(getHotels(), hotels);
		selectByVisibleText(getRoom_type(), room_type);
		selectByVisibleText(getChildrenroom(), childrenroom);

		click(getSearch());

	}

	public void mandatory(String location, String room_nos, String CheckIn, String CheckOut, String adultsroom) {

		searchHotelCommon(location, room_nos, CheckIn, CheckOut, adultsroom);

		click(getSearch());
	}

	public void searchHotel() {

		click(getSearch());

	}

}

package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC2_SearchHotelStep extends BaseClass{
	
	PageObjectManager pom = new PageObjectManager();

	@Then("User should Search the Hotel Details {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_search_the_hotel_details_and(String location, String hotels, String room_type, String room_nos,
			String CheckIn, String CheckOut, String adultsroom, String childrenroom) {
		pom.getSearchHotelPage().searchHotel(location, hotels, room_type, room_nos, CheckIn, CheckOut, adultsroom, childrenroom);
	}

	@Then("User should verify After Search Hotel Get the Success Message {string}")
	public void user_should_verify_after_search_hotel_get_the_success_message(String successMessage) {
		
		WebElement successMessage2 = pom.getSelectHotelPage().getSuccessSelectt();
String textt = getTextt(successMessage2);
boolean contains = textt.contains(successMessage);
Assert.assertTrue("verify After Search Hotel Get the Success Message", contains);


	}

	@Then("User should Entry Mandatory Details {string},{string},{string},{string} and {string}")
	public void user_should_entry_mandatory_details_and(String location, String room_nos, String CheckIn, String CheckOut,
			String adultsroom) {
		pom.getSearchHotelPage().mandatory(location, room_nos, CheckIn, CheckOut, adultsroom);
	}
	

	@Then("User should verify After Search Hotel Get the Error Message {string} and {string}")
	public void user_should_verify_after_search_hotel_get_the_error_message_and(String CheckInError, String CheckOutError ) {
		
		Assert.assertEquals("verify After Search Hotel Get the GetInDate Error Message", CheckInError,pom.getSearchHotelPage().getCheckInError().getText()); 
		Assert.assertEquals("verify After Search Hotel Get the GetOutdate Error Message", CheckOutError, pom.getSearchHotelPage().getCheckOutError().getText());
		
		

		
		
	}

	@Then("User should select search button")
	public void user_should_select_search_button() {
		pom.getSearchHotelPage().searchHotel();
	}

	@Then("User should verify After Search Hotel Get the Error message {string}")
	public void user_should_verify_after_search_hotel_get_the_error_message(String errorMessage) {
		Assert.assertEquals("verify After Search Hotel Get the Error message", errorMessage, pom.getSearchHotelPage().getLocationError().getText());
		
	}

}

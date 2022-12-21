package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC4_BookHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Then("User Should Book the Hotel {string},{string} and {string}")
	public void user_should_book_the_hotel_and(String first_name, String last_name, String address,
			io.cucumber.datatable.DataTable dataTable) {
		pom.getBookHotelPage().bookHotel(first_name, last_name, address, dataTable);

	}

	@Then("User Should Verify After Book the Hotel Get Success Message {string} and Save the Generated OrderId")
	public void user_should_verify_after_book_the_hotel_get_success_message_and_save_the_generated_order_id(
			String Succesmsg) {

		Assert.assertEquals("Verify After Book the Hotel Get Success Message", Succesmsg, pom.getBookHotelPage().getSuccesmsg().getText());
		
		
		
		

	}

	@Then("User Should Select the Book Now button without Entering any Fields")
	public void user_should_select_the_book_now_button_without_entering_any_fields() {

		pom.getBookHotelPage().bookHotel();
	}

	@Then("User Should Verify After clicking book now button Error Message {string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_after_clicking_book_now_button_error_message_and(String firstNameError,
			String lastNameError, String addressError, String creditCardError, String cardTypeError, String expiryError,
			String cvvError) {

		Assert.assertEquals("Verify After clicking book now button Error Message", firstNameError,
				pom.getBookHotelPage().getFirstNameError().getText());
		Assert.assertEquals("Verify After clicking book now button Error Message", lastNameError,
				pom.getBookHotelPage().getLastNameError().getText());
		Assert.assertEquals("Verify After clicking book now button Error Message", addressError,
				pom.getBookHotelPage().getAddressError().getText());

		Assert.assertEquals("Verify After clicking book now button Error Message", creditCardError,
				pom.getBookHotelPage().getCreditCardError().getText());

		Assert.assertEquals("Verify After clicking book now button Error Message", cardTypeError,
				pom.getBookHotelPage().getCardTypeError().getText());

		Assert.assertEquals("Verify After clicking book now button Error Message", expiryError,
				pom.getBookHotelPage().getExpiryError().getText());

		Assert.assertEquals("Verify After clicking book now button Error Message", cvvError, pom.getBookHotelPage().getCvvError().getText());

		
	}

}

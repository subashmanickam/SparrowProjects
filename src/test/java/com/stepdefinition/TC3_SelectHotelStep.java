package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC3_SelectHotelStep extends BaseClass{
	
	
	PageObjectManager pom = new PageObjectManager();
	

	@Then("User Should perform select hotel with click continue button")
	public void user_should_perform_select_hotel_with_click_continue_button() {
		
		pom.getSelectHotelPage().SelectHotel();
		
	}

	@Then("User Should Verify After Select Hotel Get Success Message {string}")
	public void user_should_verify_after_select_hotel_get_success_message(String bookSuccessMsg) {
		
		Assert.assertEquals("Verify After Select Hotel Get Success Message", bookSuccessMsg, pom.getBookHotelPage().getBookSuccessMsg().getText());
		
	}

	@Then("User Should perform  without selecting hotel field and enter continue button")
	public void user_should_perform_without_selecting_hotel_field_and_enter_continue_button() {
		
		pom.getSelectHotelPage().withoutButton();
	}

	@Then("User should Verify After clicking continue button Error Message {string}")
	public void user_should_verify_after_clicking_continue_button_error_message(String withoutSelectError) {
		
		Assert.assertEquals("Verify After clicking continue button Error Message", withoutSelectError, pom.getSelectHotelPage().getWithoutSelectError().getText());
		
	}

}

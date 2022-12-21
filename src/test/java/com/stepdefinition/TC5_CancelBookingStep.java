package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC5_CancelBookingStep extends BaseClass {
 
	PageObjectManager pom = new PageObjectManager();
	
	@Then("User Should Cancel the Generated Order Id")
	public void user_should_cancel_the_generated_order_id() {
		
		WebElement orderId = pom.getBookConfirmPage().getOrderId();
		
		pom.getCancelBookingPage().cancelOrderID(getAttributes(orderId));
		
	}

	@Then("User Should Verify After Cancel Order Id Get success Message {string}")
	public void user_should_verify_after_cancel_order_id_get_success_message(String successMsg) {

		Assert.assertEquals("Verify After Cancel Order Id Get success Message",successMsg,pom.getCancelBookingPage().getSuccessMsg().getText());
	
	}

	@Then("User Should Cancel the Existing Order Id {string}")
	public void user_should_cancel_the_existing_order_id(String orderId) {
		
		pom.getCancelBookingPage().cancelOrderID(orderId);
		
	}

}

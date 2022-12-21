package com.stepdefinition;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class CommonStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	
	@Then("User Should Verify After Login Success Message {string}")
	public void user_should_verify_after_login_success_message(String expSuccessMessage) {
		

		WebElement successMessage = pom.getSearchHotelPage().getSuccessLoginMsg();
		String attributes = getAttributes(successMessage);
		org.junit.Assert.assertEquals("Verify After Login Success Message ", expSuccessMessage, attributes);
	}
}

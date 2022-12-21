package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC1_LoginStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();
	
	
	@Given("User is on the Adactin Page")
	public void user_is_on_the_adactin_page() throws IOException {
		
		getWebDriver(getPropertyFilevalue("browser"));
		enterAppUrl(getPropertyFilevalue("url"));
		maxmizewindow();
		implicitWait();
		
	}

	@When("User Should Perform Login {string} and {string}")
	public void user_should_perform_login_and(String username, String password) throws AWTException {
		
pom.getLoginPage().login(username, password);
	}


	@When("User should Perform Login {string} and {string} with Enter Key")
	public void user_should_perform_login_and_with_enter_key(String username, String password) throws AWTException {
		pom.getLoginPage().LoginwithEntry(username, password);
	}

	@Then("User should Verify Login with Invalid Login Credential and Error Message contains {string}")
	public void user_should_verify_login_with_invalid_login_credential_and_error_message_contains(String expLoginMessage) {
		WebElement actErrorMsg = pom.getLoginPage().getErrorMessage();
		String txtErrorMsg = getTextt(actErrorMsg);
		boolean contains = txtErrorMsg.contains(expLoginMessage);
		Assert.assertTrue("Verify After Login with invalid credentials ErrorMessage contains", contains);
}

}


	
	package com.pages;

	import java.awt.AWTException;
	//import java.awt.Robot;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.base.BaseClass;

	public class LoginPage extends BaseClass {

		public LoginPage() {

			PageFactory.initElements(driver, this);

		}

		@FindBy(id = "username")
		private WebElement username;

		@FindBy(id = "password")
		private WebElement password;

		@FindBy(id = "login")
		private WebElement login;
		
		@FindBy(xpath="//b[contains(text(),\"Invalid Login details\")]")
		private WebElement errorMessage;
		
		
		
		

		public WebElement getLogin() {
			return login;
		}

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public void commonLoginStep(String username1, String Password1) {

			sendKeysValue(getUsername(), username1);
			sendKeysValue(getPassword(), Password1);
			
			

		}

		// Verifying Adactin Hotel Login Valid
		public void login(String username1, String Password1) throws AWTException {


			commonLoginStep(username1, Password1);
			click(getLogin());
			
		}
		
		//Verifying Adactin Hotel Enter Key
		
		public void LoginwithEntry(String username1,String password1) throws AWTException {

			commonLoginStep(username1, password1);
      enter();
			
			
		}

		public WebElement getErrorMessage() {
			return errorMessage;
		}

	}

	

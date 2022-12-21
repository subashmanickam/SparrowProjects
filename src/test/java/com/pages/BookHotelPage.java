package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.cucumber.datatable.DataTable;

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "first_name")
	private WebElement first_name;

	@FindBy(id = "last_name")
	private WebElement last_name;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement cc_num;

	@FindBy(id = "cc_type")
	private WebElement cc_type;

	@FindBy(id = "cc_exp_month")
	private WebElement cc_exp_month;

	@FindBy(id = "cc_exp_year")
	private WebElement cc_exp_year;

	@FindBy(id = "cc_cvv")
	private WebElement cc_cvv;

	@FindBy(id = "book_now")
	private WebElement book_now;

	@FindBy(xpath = "//label[text()='Please Enter your First Name']")
	private WebElement firstNameError;

	@FindBy(xpath = "//label[text()='Please Enter you Last Name']")
	private WebElement lastNameError;

	@FindBy(xpath = "//label[text()='Please Enter your Address']")
	private WebElement addressError;

	@FindBy(xpath = "//label[text()='Please Enter your 16 Digit Credit Card Number']")
	private WebElement creditCardError;

	@FindBy(xpath = "//label[text()='Please Select your Credit Card Type']")
	private WebElement cardTypeError;

	@FindBy(xpath = "//label[text()='Please Select your Credit Card Expiry Month']")
	private WebElement expiryError;

	@FindBy(xpath = "//label[text()='Please Enter your Credit Card CVV Number']")
	private WebElement cvvError;

	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement Succesmsg;

	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement bookSuccessMsg;

	public WebElement getBookSuccessMsg() {
		return bookSuccessMsg;
	}



	public WebElement getFirst_name() {
		return first_name;
	}



	public WebElement getLast_name() {
		return last_name;
	}



	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	

	public WebElement getFirstNameError() {
		return firstNameError;
	}



	public WebElement getLastNameError() {
		return lastNameError;
	}



	public WebElement getAddressError() {
		return addressError;
	}



	public WebElement getCreditCardError() {
		return creditCardError;
	}



	public WebElement getCardTypeError() {
		return cardTypeError;
	}



	public WebElement getExpiryError() {
		return expiryError;
	}



	public WebElement getCvvError() {
		return cvvError;
	}



	public WebElement getSuccesmsg() {
		return Succesmsg;
	}

	public void bookHotel(String first_name, String last_name, String address, DataTable dataTable) {

		sendKeysValue(getFirst_name(), first_name);
		sendKeysValue(getLast_name(), last_name);
		sendKeysValue(getAddress(), address);

		List<Map<String, String>> m = dataTable.asMaps();

		Map<String, String> map = m.get(1);

		String cardNum = map.get("cc_num");
		String cardType = map.get("cc_type");
		String month = map.get("cc_exp_month");
		String year = map.get("cc_exp_year");
		String cvv = map.get("cc_cvv");
		
		sendKeysValue(getCc_num(), cardNum);
		sendKeysValue(getCc_type(), cardType);
		
		sendKeysValue(getCc_exp_month(), month);
		sendKeysValue(getCc_exp_year(), year);
		sendKeysValue(getCc_cvv(), cvv);
		
		click(getBook_now());

	}

	public void bookHotel() {

		click(getBook_now());

	}

}

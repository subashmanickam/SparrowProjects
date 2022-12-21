package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id ="radiobutton_0")
	private WebElement radiobutton;
	@FindBy(id ="continue")
	private WebElement Continue;
	@FindBy(xpath ="//td[text()='Select Hotel ']")
	private WebElement successSelectt;
	
	@FindBy(id="radiobutton_span")
	private WebElement withoutSelectError;

	public WebElement getWithoutSelectError() {
		return withoutSelectError;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinue() {
		return Continue;
	}

	

	public WebElement getSuccessSelectt() {
		return successSelectt;
	}

	public void SelectHotel() {

		click(getRadiobutton());
		click(getContinue());

	}

	public void withoutButton() {

		click(getContinue());

	}
}

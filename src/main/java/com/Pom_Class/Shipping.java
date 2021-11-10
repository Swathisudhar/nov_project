package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {

	public WebDriver driver;

	@FindBy(id = "cgv")
	private WebElement verify;

	@FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement click;

	public Shipping(WebDriver f) {

		this.driver = f;

		PageFactory.initElements(driver, this);

	}

	public WebElement getVerify() {
		return verify;
	}

	public WebElement getClick() {
		return click;
	}

}

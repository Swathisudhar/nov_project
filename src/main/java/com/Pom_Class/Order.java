package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {
	public WebDriver driver;

	@FindBy(xpath = "//input[@size='2']")
	private WebElement quantity;

	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceedtocheck;

	public Order(WebDriver c) {

		this.driver = c;

		PageFactory.initElements(driver, this);
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getProceedtocheck() {
		return proceedtocheck;
	}

}

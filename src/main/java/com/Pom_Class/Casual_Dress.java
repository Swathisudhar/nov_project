package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casual_Dress {

	public WebDriver driver;

	@FindBy(xpath = "//div[@class='right-block']")
	private WebElement dress;

	@FindBy(xpath = "//a[@class='button ajax_add_to_cart_button btn btn-default']")
	private WebElement addtocart;

	public Casual_Dress(WebDriver b) {
		this.driver = b;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

}
